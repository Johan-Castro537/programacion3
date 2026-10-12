import java.util.Stack;

public class Ejercicio_9_6 {

    public static void main(String[] args) {
       
        String expresion = "x*y-(z+w)/(z+y)^x";

        String resultado = postfija(expresion);

        System.out.println("Expresion original: " + expresion);
        System.out.println("Expresion postfija: " + resultado);

        //evalua la expresión
        double r = evaluar(resultado);

        System.out.println("Resultado de r: " + r);
    }

    public static String postfija(String expresion) {

        Stack<Character> pila = new Stack<>();
        String resultado = "";

        for (int i = 0; i < expresion.length(); i++) {
            char caracter = expresion.charAt(i);

            //comprueba si caracter es una letra o un dígito, este comando si lo busque por IA
            //ya que no sabia como hacer esa parte

            if (Character.isLetterOrDigit(caracter)) {
                resultado += caracter;
            }

            //si es un parentesis de apertura, se guarda
            else if (caracter == '(') {
                pila.push(caracter);
            }

            //si es un parentesis de cierre, se extraen operadores
            else if (caracter == ')') {
                while (!pila.isEmpty() && pila.peek() != '(') {
                    resultado += pila.pop();
                }

                if (!pila.isEmpty()) {
                    pila.pop();
                }
            }

            //comparé las propiedades
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

    public static double evaluar(String expresion) {

        Stack<Double> pila = new Stack<>();

        for (int i = 0; i < expresion.length(); i++) {
            char caracter = expresion.charAt(i);

            if (caracter == 'x') {
                pila.push(2.0);
            }
            else if (caracter == 'y') {
                pila.push(-1.0);
            }
            else if (caracter == 'z') {
                pila.push(3.0);
            }
            else if (caracter == 'w') {
                pila.push(1.0);
            }

            else {
                double b = pila.pop();
                double a = pila.pop();
                double resultado = 0;

                if (caracter == '+') {
                    resultado = a + b;
                }
                else if (caracter == '-') {
                    resultado = a - b;
                }
                else if (caracter == '*') {
                    resultado = a * b;
                }
                else if (caracter == '/') {
                    resultado = a / b;
                }
                else if (caracter == '^') {
                    resultado = Math.pow(a, b);
                }

                pila.push(resultado);
            }
        }

        return pila.pop();
    }
}
