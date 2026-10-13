import java.util.Scanner;
import java.util.Stack;

public class Ejercicio9_6 {
        public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese una frase: ");
        String frase = entrada.nextLine();

        if (esPalindromo(frase)) {
            System.out.println("La frase es palindroma");
        } else {
            System.out.println("La frase no es palindroma");
        }

        entrada.close();
    }

    static class Nodo {
        char dato;
        Nodo siguiente;

        Nodo(char dato) {
            this.dato = dato;
        }
    }

    static class ListaCircular {
        Nodo ultimo;
        int cantidad;

        public void agregar(char dato) {
            Nodo nuevo = new Nodo(dato);

            if (ultimo == null) {
                ultimo = nuevo;
                nuevo.siguiente = nuevo;
            } else {
                nuevo.siguiente = ultimo.siguiente;
                ultimo.siguiente = nuevo;
                ultimo = nuevo;
            }

            cantidad++;
        }

        public Nodo primero() {
            if (ultimo == null) {
                return null;
            }

            return ultimo.siguiente;
        }
    }

    public static boolean esPalindromo(String frase) {
        Stack<Character> pila = new Stack<>();
        ListaCircular lista = new ListaCircular();

        for (int i = 0; i < frase.length(); i++) {
            char c = Character.toLowerCase(frase.charAt(i));

            if (Character.isLetterOrDigit(c)) {
                pila.push(c);
                lista.agregar(c);
            }
        }

        Nodo actual = lista.primero();

        for (int i = 0; i < lista.cantidad; i++) {
            if (actual.dato != pila.pop()) {
                return false;
            }

            actual = actual.siguiente;
        }

        return true;
    }
}
