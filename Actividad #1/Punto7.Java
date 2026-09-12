public class Punto7{

    public static void main(String[] args){

        int[] a = {3,10,32,1,22,7,0,5,8};

        for(int i = 0; i < a.length; i++){
                static.out.println("a[" + i + "] = " + a[i]);
        }

        int [] pares = new int[10];
        int [] impares = new int[10];

        int p = 0;
        int im = 0;

        for (int i = 0; i < a.length; i++){
            if (a[i] % 2 == 0){
                pares[p] = a[i];
                p++
            } else {
                impares[im] = a[i];
                im++
            }
        }
    }
}