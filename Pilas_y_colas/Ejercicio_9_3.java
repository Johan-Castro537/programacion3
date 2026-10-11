import java.util.Stack;

public class Ejercicio_9_3 {

    public static void main(String[] args) {
        // Se define la expresión original
        String expresion = "(x-y)/(z+w)-(z+y)^x";


        String resultado = postfija(expresion);

        System.out.println("Expresion original: " + expresion);
        System.out.println("Expresion postfija: " + resultado);
    }

    public static String postfija(String expresion) {
        Stack<Character> pila = new Stack<>();
        String resultado = "";

        for (int i = 0; i < expresion.length(); i++) {
            char caracter = expresion.charAt(i);

            if (Character.isLetterOrDigit(caracter)) {
                resultado += caracter;
            }

            else if (caracter == '(') {
                pila.push(caracter);
            }

            else if (caracter == ')') {
                while (!pila.isEmpty() && pila.peek() != '(') {
                    resultado += pila.pop();
                }

                if (!pila.isEmpty()) {
                    pila.pop();
                }
            }

            else {
                while (!pila.isEmpty() && pila.peek() != '('
                        && (prioridad(pila.peek()) > prioridad(caracter)
                        || (prioridad(pila.peek()) == prioridad(caracter)
                        && caracter != '^'))) {

                    resultado += pila.pop();
                }

                pila.push(caracter);
            }
        }

        while (!pila.isEmpty()) {
            resultado += pila.pop();
        }

        return resultado;
    }

    public static int prioridad(char operador) {

        if (operador == '^') {
            return 3;
        }

        if (operador == '*' || operador == '/') {
            return 2;
        }

        if (operador == '+' || operador == '-') {
            return 1;
        }

        return 0;
    }
}