import java.util.Scanner;
import java.util.Stack;

public class Ejercicio9_5 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        Stack<Integer>[] pilas = new Stack[5];

        for (int p = 0; p < 5; p++) {
            pilas[p] = new Stack<>();
        }

        int i, j, k;
            //las pilas i,j,k
        do {
            System.out.print("Ingrese i: ");
            i = entrada.nextInt();

            if (i != 0) {
                System.out.print("Ingrese j: ");
                j = entrada.nextInt();

                System.out.print("Ingrese k (-1 o 0): ");
                k = entrada.nextInt();

                int indice = Math.abs(i) - 1;

                if (indice < 0 || indice >= 5) {
                    System.out.println("Pila no válida");
                } else if (k == -1) {
    
                    pilas[indice].clear();
                } else if (k == 0) {
                    //use lo del punto 4 en esta parte
                    if (i > 0) {
                        pilas[indice].push(j);
                    } else {
                        pilas[indice].remove(Integer.valueOf(j));
                    }
                } else {
                    System.out.println("Valor de k no válido");
                }
            }

        } while (i != 0);

        for (int p = 0; p < 5; p++) {
            System.out.println("P" + (p + 1) + ": " + pilas[p]);
        }

        entrada.close();
    }
}
