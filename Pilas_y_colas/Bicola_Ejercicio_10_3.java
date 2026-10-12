
public class Bicola_Ejercicio_10_3 <T> {
      public static void main(String[] args) {
    
        Bicola_Ejercicio_10_3<String> clientes = new Bicola_Ejercicio_10_3<>();

        clientes.insertarFin("Carlos");
        clientes.insertarFin("Maria");
        clientes.insertarFrente("Ana");

        clientes.mostrar();

        System.out.println("Frente: " + clientes.consultarFrente());
        System.out.println("Fin: " + clientes.consultarFin());
        System.out.println("Cantidad: " + clientes.tamano());

        System.out.println("Eliminado del frente: "
                + clientes.eliminarFrente());

        System.out.println("Eliminado del fin: "
                + clientes.eliminarFin());

        clientes.mostrar();
    }

    //defini cada nodo a la lista doble enlazada
    private static class Nodo<E> {
        E dato;
        Nodo<E> anterior;
        Nodo<E> siguiente;

        Nodo(E elemento) {
            dato = elemento;
            anterior = null;
            siguiente = null;
        }
    }

    //defini los extremos y cantidad de elementos
    private Nodo<T> frente;
    private Nodo<T> fin;
    private int cantidad;

    //solo hice la bicola vacia, nada mas 
    public Bicola_Ejercicio_10_3() {
        frente = null;
        fin = null;
        cantidad = 0;
    }

    public boolean estaVacia() {
        return frente == null;
    }

    public int tamano() {
        return cantidad;
    }

    //coloque un elemento al frente
    public void insertarFrente(T elemento) {
        Nodo<T> nuevo = new Nodo<>(elemento);

        if (estaVacia()) {
            frente = nuevo;
            fin = nuevo;
        } else {
            nuevo.siguiente = frente;
            frente.anterior = nuevo;
            frente = nuevo;
        }

        cantidad++;
    }

    //aca es al revés, ahora por el fin
    public void insertarFin(T elemento) {
        Nodo<T> nuevo = new Nodo<>(elemento);

        if (estaVacia()) {
            frente = nuevo;
            fin = nuevo;
        } else {
            nuevo.anterior = fin;
            fin.siguiente = nuevo;
            fin = nuevo;
        }

        cantidad++;
    }

    //se quita y vuelve el elemento al frente
    public T eliminarFrente() {
        if (estaVacia()) {
            throw new IllegalStateException("La bicola esta vacia");
        }

        T elemento = frente.dato;
        frente = frente.siguiente;

        if (frente == null) {
            fin = null;
        } else {
            frente.anterior = null;
        }

        cantidad--;
        return elemento;
    }

    //se quita y vuelve el elemento al fin
    public T eliminarFin() {
        if (estaVacia()) {
            throw new IllegalStateException("La bicola esta vacia");
        }

        T elemento = fin.dato;
        fin = fin.anterior;

        if (fin == null) {
            frente = null;
        } else {
            fin.siguiente = null;
        }

        cantidad--;
        return elemento;
    }

    //se verifica el elemento del frente sin quitarlo
    public T consultarFrente() {
        if (estaVacia()) {
            throw new IllegalStateException("La bicola esta vacia");
        }

        return frente.dato;
    }

    //se verifica el elemento del fin sin quitarlo 
    public T consultarFin() {
        if (estaVacia()) {
            throw new IllegalStateException("La bicola esta vacia");
        }

        return fin.dato;
    }

    // Se muestran los elementos desde el frente hasta el fin
    public void mostrar() {
        Nodo<T> actual = frente;

        System.out.print("Frente -> ");

        while (actual != null) {
            System.out.print(actual.dato);

            if (actual.siguiente != null) {
                System.out.print(" <-> ");
            }

            actual = actual.siguiente;
        }

        System.out.println(" <- Fin");
    }

}
 
