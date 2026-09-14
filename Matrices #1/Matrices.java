import java.util.Scanner;

public class Matrices {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        // Menu para acceder a los ejercicios

        System.out.println("1. Punto 17");
        System.out.println("2. Punto 18");
        System.out.println("3. Punto 19");
        System.out.println("4. Punto 20");
        System.out.println("5. Punto 21");
        System.out.println("6. Punto 22");
        System.out.println("7. Punto 23");
        System.out.println("8. Punto 24");

        System.out.print("Ingrese el número del punto que quiere ejecutar: ");
        opcion = scanner.nextInt();

        switch (opcion) {

            case 1:
                // Punto 17
                int[][] a = {
                        { 5, 8, 6 },
                        { 1, 3, 2 },
                        { 4, 7, 9 }
                };

                for (int i = 0; i < a.length; i++) {
                    for (int j = 0; j < a[i].length; j++) {
                        System.out.println("a[" + i + "][" + j + "] = " + a[i][j]);
                    }
                }

                for (int i = 0; i < a.length; i++) {
                    int suma = 0;

                    for (int j = 0; j < a[i].length; j++) {
                        suma += a[i][j];
                    }
                    System.out.println("Suma de la fila " + i + ": " + suma);
                }

                for (int j = 0; j < a[0].length; j++) {
                    int suma = 0;

                    for (int i = 0; i < a.length; i++) {
                        suma += a[i][j];
                    }
                    System.out.println("Suma de la columna " + j + ": " + suma);
                }
                break;

            case 2:
                // Punto 18
                int[][] t_multiplicar = new int[10][10];

                for (int i = 0; i < t_multiplicar.length; i++) {
                    for (int j = 0; j < t_multiplicar[i].length; j++) {
                        t_multiplicar[i][j] = (i + 1) * (j + 1);
                    }
                }

                for (int i = 0; i < t_multiplicar.length; i++) {
                    for (int j = 0; j < t_multiplicar[i].length; j++) {
                        System.out.printf("%4d", t_multiplicar[i][j]);
                    }
                    System.out.println();
                }
                break;

            case 3:
                // Punto 19
        }
    }
}
