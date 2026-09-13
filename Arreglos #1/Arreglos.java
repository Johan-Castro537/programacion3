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
                break;

            case 2:
                int[] numeros = new int[30];
                int mayor = 0;
                int menor = 0;
                int vecesmayor = 0;
                int vecesmenor = 0;

                System.out.println("Ingrese 30 números enteros:");
                for (int i = 0; i < numeros.length; i++) {
                    numeros[i] = scanner.nextInt();
                }

                mayor = numeros[0];
                menor = numeros[0];

                for (int i = 0; i < numeros.length; i++) {
                    if (numeros[i] > mayor) {
                        mayor = numeros[i];
                    }
                    if (numeros[i] < menor) {
                        menor = numeros[i];
                    }
                }

                for (int i = 0; i < numeros.length; i++) {
                    if (numeros[i] == mayor) {
                        vecesmayor++;
                    }
                    if (numeros[i] == menor) {
                        vecesmenor++;
                    }
                }
                System.out.println("El mayor es: " + mayor + " y aparece " + vecesmayor + " veces.");
                System.out.println("El menor es: " + menor + " y aparece " + vecesmenor + " veces.");

                break;

            case 3:
                // Punto 9
                int[] a = new int[10];
                int x;
                int contador = 0;

                for (int i = 0; i < a.length; i++) {
                    a[i] = (int) (Math.random() * (100 - 1 + 1) + 1);
                }

                x = (int) (Math.random() * (100 - 1 + 1) + 1);

                for (int i = 0; i < a.length; i++) {
                    System.out.println("a[" + i + "] = " + a[i]);
                }

                for (int i = 0; i < a.length; i++) {
                    if (a[i] == x) {
                        contador++;
                    }
                }

                System.out.println("x = " + x);
                System.out.println("Se encuentra " + contador + " veces.");
                break;

            default:
                System.out.println("Opción no válida.");
                break;
        }

        scanner.close();
    }
}
