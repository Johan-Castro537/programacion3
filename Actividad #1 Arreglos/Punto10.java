public class Punto10 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = new int[4];

        for (int i = 0; i < b.length; i++) {
            b[i] = a[i] + a[a.length - 1 - i];
        }

        for (int i = 0; i < b.length; i++) {
            System.out.println("b[" + i + "] = " + b[i]);
        }
    }
}

