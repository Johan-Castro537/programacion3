package Pilas;
import java.util.Scanner;
import java.util.Stack;

public class Ejercicio94 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double[] arregloNumeros = new double[10];
        Stack<Double> pilaNumeros = new Stack<>();

        System.out.println("Por favor, ingrese 10 números reales:");

        for (int i = 0; i < 10; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            arregloNumeros[i] = scanner.nextDouble(); 
            pilaNumeros.push(arregloNumeros[i]);      
        }

        System.out.println("\n--- Secuencia Original (desde el array) ---");
        for (int i = 0; i < 10; i++) {
            System.out.print(arregloNumeros[i] + "  ");
        }
        System.out.println();

        System.out.println("\n--- Elementos extraídos de la pila (pero en inversa) ---");
        while (!pilaNumeros.isEmpty()) {
            System.out.print(pilaNumeros.pop() + "  "); 
        }
        System.out.println();
        
        scanner.close();
    }
}