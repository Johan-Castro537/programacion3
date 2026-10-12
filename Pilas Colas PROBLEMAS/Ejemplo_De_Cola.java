
import java.util.Queue;
import java.util.LinkedList;

public class Ejemplo_De_Cola {
//hago como si atendiera clientes 
//offer()	Agregar un cliente al final de la cola
//poll()	Atender y retirar al primero
//peek()	Consultar quién sigue sin retirarlo
//size()	Contar los clientes pendientes
//isEmpty()	Comprobar si quedan clientes
//contains()	Buscar si un cliente está en la cola

    public static void main(String[] args) {
        //se crea la cola de clientes
        Queue<String> clientes = new LinkedList<>();

        clientes.offer("Carlos");
        clientes.offer("María");
        clientes.offer("Pedro");

        System.out.println("Clientes: " + clientes);

        System.out.println("Siguiente cliente: " + clientes.peek());

        System.out.println("Atendido: " + clientes.poll());

        System.out.println("Clientes pendientes: " + clientes.size());

        System.out.println("Está vacía? " + clientes.isEmpty());

        System.out.println("Está Pedro? " + clientes.contains("Pedro"));

        //se atiende a los clientes restantes
        while (!clientes.isEmpty()) {
            System.out.println("Atendido: " + clientes.poll());
        }

        //se muestra el estado final
        System.out.println("Cola final: " + clientes);
    }
}
