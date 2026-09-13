import java.util.Scanner;

public class Arreglos {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int opcion;

        // Menu para acceder a los puntos del ejercicio

        System.out.println("1. Punto 7");
        System.out.println("2. Punto 8");
        System.out.println("3. Punto 9");
        System.out.println("4. Punto 10");
        System.out.println("5. Punto 11");
        System.out.println("6. Punto 12");
        System.out.println("7. Punto 13");
        System.out.println("0. Salir");

        System.out.print("Ingrese el número del punto que quiere ejecutar: ");
        opcion = scanner.nextInt();

        switch (opcion) {

            // Punto 7

            case 1:
                int[] pares = new int[10];
                int[] impares = new int[10];

                int p = 0;
                int im = 0;

                for (int i = 0; i < 20; i++) {

                    int numero = (int) (Math.random() * (100 - 1 + 1) + 1);

                    if (numero % 2 == 0 && p < pares.length) {
                        pares[p] = numero;
                        p++;
                    }
                    if (numero % 2 != 0 && im < impares.length) {
                        impares[im] = numero;
                        im++;
                    }

                }
                System.out.println("Números pares:");
                for (int i = 0; i < p; i++) {
                    System.out.print(pares[i] + " ");
                }
                System.out.println("\nNúmeros impares:");
                for (int i = 0; i < im; i++) {
                    System.out.print(impares[i] + " ");
                }
        }
    }

    // PUNTO 8

    int[] numeros = new int[30];
    int[] mayor = 0;
    int[] menor = 0;
    int[] vecesmayor = 0;
    int[] vecesmenor = 0;

}
