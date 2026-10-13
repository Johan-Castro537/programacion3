
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Ejercicio10_5 {

    //los datos de cada repartidor
    static class Repartidor {
        int nss;
        String nombre;
        int diasTrabajados;

        Repartidor(int nss, String nombre, int diasTrabajados) {
            this.nss = nss;
            this.nombre = nombre;
            this.diasTrabajados = diasTrabajados;
        }

        public String toString() {
            return "NSS: " + nss
                    + ", Nombre: " + nombre
                    + ", Dias trabajados: " + diasTrabajados;
        }
    }

    //trabajos en el dia
    static class Trabajo {
        int nss;
        String entidad;

        Trabajo(int nss, String entidad) {
            this.nss = nss;
            this.entidad = entidad;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        LinkedList<Repartidor> lista = new LinkedList<>();

        Queue<Trabajo> cola = new LinkedList<>();

        lista.add(new Repartidor(100, "Carlos", 5));
        lista.add(new Repartidor(200, "Maria", 8));
        lista.add(new Repartidor(300, "Pedro", 3));

        System.out.print("Cantidad de trabajos del dia: ");
        int cantidad = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < cantidad; i++) {
            System.out.print("NSS del repartidor: ");
            int nss = sc.nextInt();
            sc.nextLine();

            System.out.print("Entidad anunciada: ");
            String entidad = sc.nextLine();

            cola.add(new Trabajo(nss, entidad));
        }

        while (!cola.isEmpty()) {
            Trabajo trabajo = cola.poll();

            boolean encontrado = false;

            for (int i = 0; i < lista.size(); i++) {
                if (lista.get(i).nss == trabajo.nss) {
                    lista.get(i).diasTrabajados++;
                    encontrado = true;
                    break;
                }
            }

            if (!encontrado) {
                System.out.print("Nombre del nuevo repartidor: ");
                String nombre = sc.nextLine();

                Repartidor nuevo = new Repartidor(
                        trabajo.nss, nombre, 1);

                int posicion = 0;

                while (posicion < lista.size()
                        && lista.get(posicion).nss < nuevo.nss) {
                    posicion++;
                }

                lista.add(posicion, nuevo);
            }

            System.out.println("Trabajo hecho: "
                    + trabajo.nss + " - " + trabajo.entidad);
        }

        System.out.println("\n--- Lista de repartidores ---");

        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }

        sc.close();
    }
}
