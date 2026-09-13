import java.util.Scanner;

public class Punto9 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

        int[] arreglo = new int[5];
        int numero;
        int contador = 0;

        System.out.println("Ingrese los elementos del arreglo:");

        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = scanner.nextInt();
        }

        System.out.println("Ingrese un número para buscar en el arreglo:");
        numero = scanner.nextInt();

        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] == numero) {
                contador++;
            }
        }
        System.out.println("El número " + numero + " aparece " + contador + " veces en el arreglo");
        }
    }
}
