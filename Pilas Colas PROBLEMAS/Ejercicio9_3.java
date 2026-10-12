import java.util.Stack;

public class Ejercicio9_3 {
    
        public static void main(String[] args) {
        System.out.println(equilibrada("((a+b)*5)-7"));
        System.out.println(equilibrada("2*[(a+b)/2.5+x-7*y"));
        System.out.println(equilibrada("{[()]}"));
    }

    public static boolean equilibrada(String expresion) {
        Stack<Character> pila = new Stack<>();

        for (int i = 0; i < expresion.length(); i++) {
            char c = expresion.charAt(i);

            //guardo los signos de apertura en la pila
            if (c == '(' || c == '[' || c == '{') {
                pila.push(c);
            }

            //verifico los de cierre de la pila
            else if (c == ')' || c == ']' || c == '}') {

                if (pila.isEmpty()) {
                    return false;
                }

                char apertura = pila.pop();

                if (c == ')' && apertura != '(') {
                    return false;
                }

                if (c == ']' && apertura != '[') {
                    return false;
                }

                if (c == '}' && apertura != '{') {
                    return false;
                }
            }
        }

        return pila.isEmpty();
    }
}
