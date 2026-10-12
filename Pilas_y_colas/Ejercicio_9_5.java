import java.util.Stack;

public class Ejercicio_9_5 {

    public static void main(String[] args) {
        String expresion = "(x-y)/(z+w)-(z+y)^x";

        String resultado = prefija(expresion);

        System.out.println("Expresion original: " + expresion);
        System.out.println("Expresion prefija: " + resultado);
    }

    public static String prefija(String expresion) {
        
        String invertida = "";

        for (int i = expresion.length() - 1; i >= 0; i--) {
            char caracter = expresion.charAt(i);

            if (caracter == '(') {
                caracter = ')';
            } else if (caracter == ')') {
                caracter = '(';
            }

            invertida += caracter;
        }

        String postfija = convertirPostfija(invertida);

        String resultado = "";

        for (int i = postfija.length() - 1; i >= 0; i--) {
            resultado += postfija.charAt(i);
        }

        return resultado;
    }

    public static String convertirPostfija(String expresion) {

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
                        && caracter == '^'))) {

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
