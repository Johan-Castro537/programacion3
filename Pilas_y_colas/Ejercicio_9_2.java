import java.util.Stack;

public class Ejercicio_9_2 {

    public static void main(String[] args) {
        // Crear una pila de cadenas
        Stack<String> pila = new Stack<>();

        pila.push("Primer elemento");
        pila.push("Segundo elemento");
        pila.push("Tercer elemento");

        mostrarPila(pila);

        System.out.println("Pila original: " + pila);
    }

    public static void mostrarPila(Stack<String> pilaOriginal) {

        Stack<String> pilaAuxiliar = new Stack<>();

        while (!pilaOriginal.isEmpty()) {
            String elemento = pilaOriginal.pop();

            System.out.println(elemento);

            pilaAuxiliar.push(elemento);
        }

        while (!pilaAuxiliar.isEmpty()) {
            pilaOriginal.push(pilaAuxiliar.pop());
        }
    }
}
