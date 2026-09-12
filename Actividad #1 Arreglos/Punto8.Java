public class Punto8{

    public static void main(String[] args){

        int[] a = new int[30];

        int max = 100;
        int min = 1;

        for(int i = 0; i < a.length; i++){
            a[i] = (int)(Math.random() * (max - min + 1) + min);
            System.out.println("a[" + i + "] = " + a[i]);
        }
    }

     