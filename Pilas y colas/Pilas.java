import java.util.Scanner;
import java.util.Stack;

public class Pilas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        // Menu para acceder a los puntos del ejercicio

        System.out.println("1. Punto 9.2");
        System.out.println("2. Punto 9.3");
        System.out.println("3. Punto 9.4");
        System.out.println("4. Punto 9.5");
        System.out.println("5. Punto 9.6");
        System.out.println("6. Punto 9.7");

        System.out.print("Ingrese el número del punto que quiere ejecutar: ");
        opcion = scanner.nextInt();

        switch (opcion) {

            case 1:
                // Punto 9.2
                Stack<String> pilaAuxiliar = new Stack<>();
                Stack<String> pilaOriginal = new Stack<>();
                pilaOriginal.push("A");
                pilaOriginal.push("B");
                pilaOriginal.push("C");

        System.out.println("--- Contenido de la Pila ---");
        
        while (!pilaOriginal.isEmpty()) {
            String elemento = pilaOriginal.pop(); 
            System.out.println(elemento);         
            pilaAuxiliar.push(elemento);          
        }

        while (!pilaAuxiliar.isEmpty()) {
            pilaOriginal.push(pilaAuxiliar.pop()); 
        }
        
        System.out.println("----------------------------");

                break;

            case 2:
                // Punto 9.3
                break;

            case 3:
                // Punto 9.4
                break;

            case 4:
                // Punto 9.5
                break;

            case 5:
                // Punto 9.6
                break;
        }
    }
}
