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

                for(int i = 0; i < a.length; i++){
                    for(int j = 0; j < a[i].length; j++){
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

                for(int i = 0; i < t_multiplicar.length; i++){
                    for(int j = 0; j < t_multiplicar[i].length; j++){
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
                        
                    }
                }
        }
    }
}
