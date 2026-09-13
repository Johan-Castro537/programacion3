public class Arreglos {
    public static void main(String[] args){
        //PUNTO 7

        int[] pares = new int[10];
        int[] impares = new int[10];

        int p = 0;
        int im = 0;

        for(int i = 0; i < 20;i++){
            
            int numero = (int)(Math.random()* (100 - 1 + 1) + 1);

            if(numero % 2 == 0 && p < pares.length){
                pares[p] = numero;
                p++;
            }
            if(numero % 2 != 0 && im < impares.length){
                impares[im] = numero;
                im++;
            }

        }
    }
    
}
