import java.util.Scanner;

public class Sala 
{
    private int salaId;
    private String[][] todosAsientos;
    private boolean solo3D;  //ya que debe saber si la persona que va a comprar la entrada puede o no ver peliculas 3D
    private Funcion[] funcionesDelDia; //unicamente 3 funciones por sala, por eso es un arreglo de 3
    
    public Sala(int sSalaId) 
    {
        salaId = sSalaId;
      
        funcionesDelDia = new Funcion[3];
        funcionesDelDia[0] = new Funcion(1);
        funcionesDelDia[1] = new Funcion(2);
        funcionesDelDia[2] = new Funcion(3);

        if(salaId == 1 || salaId == 2){
            solo3D = false; 
            todosAsientos = new String[][]{
                {" ", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"},
                {"H", " ", " ", "-", "-", "-", "-", "-", "-", "-", "-", "-", ""},
                {"G", " ", " ", "-", "-", "-", "-", "-", "-", "-", "-", "-", ""},
                {"F", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-"},
                {"E", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-"},
                {"D", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-"},
                {"C", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-"},
                {"B", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-"},
                {"A", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-"}
                
            };
        }else {
            solo3D = true;
            todosAsientos = new String[][]{
                  {" ", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"},
                    {"F", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-"},
                    {"E", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-"},
                    {"D", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-"},
                    {"C", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-"},
                    {"B", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-"},
                    {"A", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-"}
            };
        }
    }

    public int getSalaId(){return salaId;}

    public boolean isSolo3D(){ return solo3D;}

    public Funcion[] getFuncionesDelDia(){return funcionesDelDia;
    }
    //busca el indice de toda la fila del matriz dependiendo que letra escogió
    public int buscarIndiceFila(String pFila)
    {
        int indiceEncontrado = -1;
        for (int indiceFila = 1; indiceFila < todosAsientos.length; indiceFila = indiceFila+1){
            if (todosAsientos[indiceFila][0].equals(pFila))
            {
                indiceEncontrado = indiceFila;
            }   
        }
        return indiceEncontrado;
    }
}