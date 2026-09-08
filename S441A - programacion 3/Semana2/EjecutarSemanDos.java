public class EjecutarSemanDos {
    
    public static void main(String[] args) {
        
//Declaracion del arreglo forma 1
    int[] a = {3, 10, 5, 9, 11, 22, 1, 14, 25, 7, 8, 19};
    
//Recorrer y mostrar el arreglo

    for(int i = 0; i < a.length; i++){
        System.out.println("a[" + i + "] = " + a[i]);

    }
    //Declaracion del arreglo forma 2
    
    int[] b = new int [12];

    int max = 100;
    int min = 1;

    for (int i = 0; i < b.length; i++){
        b[i] = (int)(Math.random() * (max - min + 1) + min);
        System.out.println("b[" + i + "] = " + b[i]);
    }
    
    }
}
