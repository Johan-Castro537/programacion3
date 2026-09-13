public class Punto11 {

    int[] a = {3,7,3,-7,-2,5,1,-9};

    int[] negativos = new int[a.length];
    int[] positivos = new int[a.length];
    int[] ceros = new int[a.length];

    int n = 0;
    int p = 0;
    int c = 0;

    for(int i = 0; i < a.length; i++){

        if(a[i] < 0){
            negativos[n] = a[i];
            n++;

        }else if(a[i] > 0){
            positivos[p] = a[i];
            p++;

        }else{
            ceros[c] = a[i];
            c++;
        }
    }

        System.out.println("Negativos: ");
        for(int i = 0; i < n; i++){
            System.out.println(negativos[i]);
        }
        System.out.println("Positivos: ");
        for(int i = 0; i < p; i++){
            System.out.println(positivos[i]);
        }

        System.out.println("Ceros: ");
        for(int i = 0; i < c; i++){ 
            System.out.println(ceros[i]);
        }
    }
