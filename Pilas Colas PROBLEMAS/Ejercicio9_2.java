public class Ejercicio9_2 {

    public static void main(String[] args) {
        System.out.println(comprobar("abc&cba"));
        System.out.println(comprobar("hola&aloh"));
        System.out.println(comprobar("abc&abc"));
    }

    public static boolean comprobar(String cadena) {

        int separador = cadena.indexOf('&');

        if (separador == -1) {
            return false;
        }

        String x = cadena.substring(0, separador);
        String y = cadena.substring(separador + 1);

        String inversa = "";

        for (int i = x.length() - 1; i >= 0; i--) {
            inversa += x.charAt(i);
        }

        return inversa.equals(y);
    }
}