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

                String cad = "";

                for (int i = 0; i < a.length; i++) {
                    for (int j = 0; j < a[i].length; j++) {
                        cad += "|" + a[i][j] + "|";
                    }

                    cad += "\n";
                }

                System.out.println(cad);

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

                String cad18 = "";

                for (int i = 0; i < t_multiplicar.length; i++) {
                    for (int j = 0; j < t_multiplicar[i].length; j++) {
                        cad18 += "|" + t_multiplicar[i][j] + "|";
                    }

                    cad18 += "\n";
                }

                System.out.println(cad18);

                break;

            case 3:
                // Punto 19
                int[][] a19 = new int[5][5];

                for (int i = 0; i < a19.length; i++) {
                    for (int j = 0; j < a19[i].length; j++) {
                        if (i == j) {
                            a19[i][j] = 1;
                        } else {
                            a19[i][j] = 0;
                        }
                    }
                }

                String cad19 = "";

                for (int i = 0; i < a19.length; i++) {
                    for (int j = 0; j < a19[i].length; j++) {
                        cad19 += "|" + a19[i][j] + "|";
                    }

                    cad19 += "\n";
                }

                System.out.println(cad19);
                break;

            case 4:
                // Punto 20
                int[][] a20 = new int[10][10];

                for (int i = 0; i < a20.length; i++) {
                    for (int j = 0; j < a20[i].length; j++) {

                        if (i <= j) {
                            a20[i][j] = 1;
                        } else {
                            a20[i][j] = 0;
                        }
                    }
                }

                String cad20 = "";

                for (int i = 0; i < a20.length; i++) {
                    for (int j = 0; j < a20[i].length; j++) {
                        cad20 += "|" + a20[i][j] + "|";
                    }

                    cad20 += "\n";
                }

                System.out.println(cad20);

                break;

            case 5:
                // Punto 21
                int[][] a21 = new int[5][6];
                int[] b21 = new int[a21.length];

                for (int i = 0; i < a21.length; i++) {
                    for (int j = 0; j < a21[i].length; j++) {
                        a21[i][j] = (int) (Math.random() * (20 - 1 + 1) + 1);
                    }
                }

                for (int i = 0; i < a21.length; i++) {
                    for (int j = 0; j < a21[i].length; j++) {

                        if (a21[i][j] % 2 == 0) {
                            b21[i] += a21[i][j];
                        }
                    }
                }
                String cad21 = "";

                for (int i = 0; i < a21.length; i++) {
                    for (int j = 0; j < a21[i].length; j++) {
                        cad21 += "|" + a21[i][j] + "|";
                    }

                    cad21 += "\n";
                }

                System.out.println(cad21);

                System.out.println("Vector B:");

                for (int i = 0; i < b21.length; i++) {
                    System.out.println("B[" + i + "] = " + b21[i]);
                }
                break;

            case 6:
                // Punto 22
                System.out.println("Ingrese el tamaño de filas: ");
                int filas = scanner.nextInt();

                System.out.println("Ingrese el tamaño de columnas: ");
                int columnas = scanner.nextInt();

                int[][] a22 = new int[filas][columnas];

                for (int i = 0; i < a22.length; i++) {
                    for (int j = 0; j < a22[i].length; j++) {
                        a22[i][j] = (int) (Math.random() * (100 - 1 + 1) + 1);
                    }
                }
                String cad22 = "";

                for (int i = 0; i < a22.length; i++) {
                    for (int j = 0; j < a22[i].length; j++) {
                        cad22 += "|" + a22[i][j] + "|";
                    }

                    cad22 += "\n";
                }

                System.out.println(cad22);

                int mayor = a22[0][0];
                int menor = a22[0][0];

                int filaMayor = 0;
                int columnaMayor = 0;
                int filaMenor = 0;
                int columnaMenor = 0;

                for (int i = 0; i < a22.length; i++) {
                    for (int j = 0; j < a22[i].length; j++) {

                        if (a22[i][j] > mayor) {
                            mayor = a22[i][j];
                            filaMayor = i;
                            columnaMayor = j;
                        }

                        if (a22[i][j] < menor) {
                            menor = a22[i][j];
                            filaMenor = i;
                            columnaMenor = j;
                        }
                    }
                }

                System.out.println("Mayor = " + mayor);
                System.out.println("Posicion = [" + filaMayor + "][" + columnaMayor + "]");

                System.out.println("Menor = " + menor);
                System.out.println("Posicion = [" + filaMenor + "][" + columnaMenor + "]");

                break;

            case 7:
                // Punto 23
                int[][] a23 = new int[5][6];

                for (int i = 0; i < a23.length; i++) {
                    for (int j = 0; j < a23[i].length; j++) {
                        a23[i][j] = (int) (Math.random() * (20 - (-20) + 1) + -20);
                    }
                }

                for (int i = 0; i < a23.length; i++) {

                    int mayorabs = 0;

                    for (int j = 0; j < a23[i].length; j++) {

                        if (Math.abs(a23[i][j]) > mayorabs) {
                            mayorabs = Math.abs(a23[i][j]);
                        }
                    }

                    a23[i][a23[i].length - 1] = mayorabs;
                }
                String cad23 = "";

                for (int i = 0; i < a23.length; i++) {
                    for (int j = 0; j < a23[i].length; j++) {
                        cad23 += "|" + a23[i][j] + "|";
                    }

                    cad23 += "\n";
                }

                System.out.println(cad23);

                break;

            case 8:
                // Punto 24
                int[][] cereales = new int[4][12];

                for (int i = 0; i < cereales.length; i++) {
                    System.out.println("Cereal " + (i + 1));

                    for (int j = 0; j < cereales[i].length; j++) {
                        System.out.print("Mes " + (j + 1));
                    }
                }

                int sumaTotal = 0;

                for (int i = 0; i < cereales.length; i++) {
                    for (int j = 0; j < cereales[i].length; j++) {
                        sumaTotal = sumaTotal + cereales[i][j];
                    }
                }

                double promedio = (double)sumaTotal / 48;
        }
    }
}
