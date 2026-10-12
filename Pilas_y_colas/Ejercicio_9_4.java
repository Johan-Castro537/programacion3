import java.util.Scanner;
import java.util.Stack;

public class Ejercicio_9_4 {

    public static void main(String[] args) {
        
        // Se crea el Scanner, el arreglo y la pila
        Scanner entrada = new Scanner(System.in);
        double[] numeros = new double[10];
        Stack<Double> pila = new Stack<>();

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingrese el numero " + (i + 1) + ": ");
            numeros[i] = entrada.nextDouble();
        }

        System.out.println("\nSecuencia original:");

        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }

        for (int i = 0; i < numeros.length; i++) {
            pila.push(numeros[i]);
        }

        System.out.println("\nElementos extraidos de la pila:");

        while (!pila.isEmpty()) {
            System.out.println(pila.pop());
        }

        entrada.close();
    }
}
