
import java.util.Scanner;
import java.util.Stack;

public class Ejercicio9_4 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        Stack<Integer>[] pilas = new Stack[5];

        for (int i = 0; i < pilas.length; i++) {
            pilas[i] = new Stack<>();
        }

        int i, j;

        do {
            System.out.print("Ingrese i: ");
            i = entrada.nextInt();

            if (i != 0) {
                System.out.print("Ingrese j: ");
                j = entrada.nextInt();

                int indice = Math.abs(i) - 1;

                if (indice < 0 || indice >= 5) {
                    System.out.println("Pila no válida");
                } else if (i > 0) {
                    //la j correspondiente
                    pilas[indice].push(j);
                } else {
                    //elimino la primera aparicion de la j
                    pilas[indice].remove(Integer.valueOf(j));
                }
            }

        } while (i != 0);

        for (int p = 0; p < pilas.length; p++) {
            System.out.println("P" + (p + 1) + ": " + pilas[p]);
        }

        entrada.close();
    }
}
