public class MatricesA {
    public static void main(string[] args){

        //Declaracion de la matriz forma 1
        int[][] a ={{5, 8, 6}, 
                    {1, 3, 2},
                    {4, 7, 9}};   

        //Recorrido de la matriz 
        for (int i = 0; i < a.length; i++){
            for (int j = 0; j < a[i].length; j++){
                System.out.println("a[" + i + "][" + j + "] = " + a[i][j]);
            }
        }            
    }
    