
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Ejercicio10_3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //los 25 carritos disponibles
        Queue<Integer> carritos = new LinkedList<>();

        for (int i = 1; i <= 25; i++) {
            carritos.add(i);
        }

        Queue<String> caja1 = new LinkedList<>();
        Queue<String> caja2 = new LinkedList<>();
        Queue<String> caja3 = new LinkedList<>();

        int opcion;
        int cliente = 1;

        do {
            System.out.println("\n--- Supermercado los duros ---");
            System.out.println("1. Llegada de un cliente");
            System.out.println("2. Cliente termina de comprar");
            System.out.println("3. Cliente paga");
            System.out.println("4. Mostrar estado");
            System.out.println("0. Salir");
            System.out.print("Opcion: ");

            opcion = sc.nextInt();

            if (opcion == 1) {

                if (carritos.isEmpty()) {
                    System.out.println("No hay carritos disponibles");
                    System.out.println("El cliente debe esperar");
                } else {
                    int carrito = carritos.poll();

                    System.out.println("Cliente " + cliente
                            + " recibe el carrito " + carrito);

                    cliente++;
                }

            } else if (opcion == 2) {

                //aqui va donde hay menos clientes
                System.out.print("Numero del cliente: ");
                int numero = sc.nextInt();

                System.out.print("Numero del carrito: ");
                int carrito = sc.nextInt();

                String dato = numero + "-" + carrito;

                if (caja1.size() <= caja2.size()
                        && caja1.size() <= caja3.size()) {
                    caja1.add(dato);
                    System.out.println("Cliente asignado a caja 1");
                } else if (caja2.size() <= caja3.size()) {
                    caja2.add(dato);
                    System.out.println("Cliente asignado a caja 2");
                } else {
                    caja3.add(dato);
                    System.out.println("Cliente asignado a caja 3");
                }

            } else if (opcion == 3) {

                //aqui pagamos
                System.out.print("Caja (1, 2 o 3): ");
                int caja = sc.nextInt();

                String dato = null;

                if (caja == 1 && !caja1.isEmpty()) {
                    dato = caja1.poll();
                } else if (caja == 2 && !caja2.isEmpty()) {
                    dato = caja2.poll();
                } else if (caja == 3 && !caja3.isEmpty()) {
                    dato = caja3.poll();
                }

                if (dato != null) {
        
                    String[] datos = dato.split("-");
                    int carrito = Integer.parseInt(datos[1]);

                    carritos.add(carrito);

                    System.out.println("Cliente " + datos[0]
                            + " ha pagado.");
                    System.out.println("Carrito " + carrito
                            + " disponible nuevamente.");
                } else {
                    System.out.println("La caja esta vacia.");
                }

            } else if (opcion == 4) {

                System.out.println("Carritos disponibles: " + carritos);
                System.out.println("Caja 1: " + caja1);
                System.out.println("Caja 2: " + caja2);
                System.out.println("Caja 3: " + caja3);
            }

        } while (opcion != 0);

        sc.close();
    }
}
