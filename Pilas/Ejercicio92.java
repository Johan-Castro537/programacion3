package Pilas;

import java.util.Stack;

public class Ejercicio92 {
    public static void mostrarPila(Stack<String> pilaOriginal) {
        Stack<String> pilaAuxiliar = new Stack<>();

        System.out.println("--- Contenido de la Pila ---");
        
        //Vacia la pila original luego imprimir y guardar en la auxiliar
        while (!pilaOriginal.isEmpty()) {
            String elemento = pilaOriginal.pop(); // Operación básica: extraer
            System.out.println(elemento);         // Mostrar el elemento
            pilaAuxiliar.push(elemento);          // Operación básica: insertar en auxiliar
        }

        //Se restaura elementos de la pila original
        while (!pilaAuxiliar.isEmpty()) {
            pilaOriginal.push(pilaAuxiliar.pop()); // Extrae de la auxiliar y reinserta en la original
        }
        
        System.out.println("----------------------------");
    }
}
