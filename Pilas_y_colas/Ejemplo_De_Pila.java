import java.util.Stack;

public class Ejemplo_De_Pila {
// este ejemplo es como si tuvieramos una pila de platos, uno encima de otro y pues uso cada metodo 
//push()  colocar un plato encima de la torre
//pop()  retirar el plato que está arriba
//peek()  mirar cual es el plato de arriba sin retirarlo
//size()  contar cuantos platos hay
//isEmpty()  comprobar si ya no quedan platos

    public static void main(String[] args) {
        Stack<String> platos = new Stack<>();

        platos.push("Plato 1");
        platos.push("Plato 2");
        platos.push("Plato 3");

        System.out.println("Platos: " + platos);

        System.out.println("Último plato: " + platos.peek());

        System.out.println("Sacar plato: " + platos.pop());

        System.out.println("Cantidad: " + platos.size());

        System.out.println("Está vacía? " + platos.isEmpty());

        System.out.println("Posición del plato: "
                + platos.search("Plato 1"));

        System.out.println("Existe el plato? "
                + platos.contains("Plato 2"));

        platos.clear();

        System.out.println("Está vacía? " + platos.empty());
    }
}
