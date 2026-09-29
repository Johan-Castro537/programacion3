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
                    {"G", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-"},
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
int indiceFila = 1;
        int indiceEncontrado = -1;
        boolean encontrado = false;
while (indiceFila < todosAsientos.length && encontrado == false) {
            if (todosAsientos[indiceFila][0].equals(pFila)) {
                indiceEncontrado = indiceFila;
                encontrado = true; // esto detiene el while
            }
            indiceFila = indiceFila + 1;
        }
        return indiceEncontrado;
    }

    public void asignarFuncion(int franjaSeleccionada, Pelicula peliculaSeleccionada) {

        throw new UnsupportedOperationException("Unimplemented method 'asignarFuncion'");
    }
    public boolean columnaValida(int cColumna)
    {
        return cColumna >= 1 && cColumna <= todosAsientos[0].length - 1;
    }

    public boolean esPreferencial(String pFila)
    {
        if (salaId == 3) {
            return false;
        }
        if (pFila.equals("G") || pFila.equals("H")) {
            return true;
        }
        return false;
    }

    public void mostrarMapa()
    {
        System.out.println("--- Mapa de sillas de la sala " + salaId + " ---");
        for (int indiceFila = 0; indiceFila < todosAsientos.length; indiceFila ++) {
            for (int indiceColumna = 0; indiceColumna < todosAsientos[indiceFila].length; indiceColumna ++) {
                System.out.print(todosAsientos[indiceFila][indiceColumna] + "\t");
            }
            System.out.println();
        }
    }

    public double venderSilla(String pFila, int pColumna)
    {
        double precioResultante = -1;
        int indiceFila = buscarIndiceFila(pFila);

        if(indiceFila == -1){
            System.out.println("La fila \"" + pFila + "\" no existe en esta sala.");
        } else if(!columnaValida(pColumna)){
            System.out.println("La silla numero " + pColumna + " no existe en esta sala.");
        } else {
            String estadoSilla = todosAsientos[indiceFila][pColumna];
            
            if(estadoSilla.equals("_")){
                System.out.println("En esta posicion no hay silla fisica.");
            }else if (estadoSilla.equals(" ") || estadoSilla.equals("")){
                System.out.println(" Esa posicion no corresponde a una silla valida");
            }else if(estadoSilla.equals("X")){
                System.out.println("La silla" + pFila + pColumna + " ya fue vendida ");
            }else{
                todosAsientos[indiceFila][pColumna] = "X";
                if (solo3D) {
                    precioResultante = 10000;
                }else if (pFila.equals("G") || pFila.equals("H")){
                    precioResultante = 12000;
                }else{
                    precioResultante = 8000;
                }
            }
        }
        return precioResultante;
    }

    public int contarDisponibles()
    {
        int totalDisponible = 0;
        int indiceFila = 1;
        
        while (indiceFila < todosAsientos.length)
        {
            int indiceColumna = 1;
            while (indiceColumna < todosAsientos[indiceFila].length)
            {
                if (todosAsientos[indiceFila][indiceColumna].equals("-"))
                {
                    totalDisponible = totalDisponible + 1;
                }
                indiceColumna = indiceColumna + 1;
            }
            indiceFila = indiceFila + 1;
        }
        return totalDisponible;
    }

    public void mostrarFunciones()
    {
        System.out.println("--- Funciones de la sala " + salaId + " ---");
        for (int indiceFuncion = 0; indiceFuncion < funcionesDelDia.length; indiceFuncion++)
        {
            funcionesDelDia[indiceFuncion].mostrarInfo();   
        }
    }
   
    public boolean asignarPelicula(int fFranjaHoraria, Pelicula pPelicula)
    {
        boolean tipoCompatible = false;

        String tipoProyeccion = pPelicula.getTipoPelicula();

        if (solo3D && !tipoProyeccion.equals("3D")) {
            System.out.println("La sala" + salaId + " solo admite peliculas 3D");
        } else if (!solo3D && tipoProyeccion.equals("3D")) {
            System.out.println("La sala " + salaId + " no admite peliculas 3D");
        } else {
            tipoCompatible = true;
        }

        boolean asignacionExitosa = false;
        if(tipoCompatible){
            Funcion funcionSeleccionada = funcionesDelDia[fFranjaHoraria - 1];
            asignacionExitosa = funcionSeleccionada.intentarAsignar(pPelicula);
        }
        return asignacionExitosa;
    }

    public void venderEntradas(Scanner scanner, int pFranjaHoraria)
    {
        Funcion funcionSeleccionada = funcionesDelDia[pFranjaHoraria - 1];

        if(!funcionSeleccionada.tieneAsignacion()){
            System.out.println("Esta funcion todavia no tiene una peliucla asignada.");
        } else {
            System.out.println("Funcion: " + funcionSeleccionada.getPeliculaAsignada().getNombre() + " (" + funcionSeleccionada.getHorarioTexto() + ")");

            double totalAcumulado = 0;
            String deseaContinuar = "S";

            while (deseaContinuar.equals("S"))
            {
                mostrarMapa();
                System.out.println("Sillas disponibles en esta funion: " + contarDisponibles());

                System.out.println("ingrese la fila de la silla (ej: B): ");
                String filaIngresada = scanner.next().toUpperCase(); 

                System.out.println("ingrese el numero de la silla: ");
                int columnaIngresada = scanner.nextInt();

                double precioSilla = venderSilla(filaIngresada, columnaIngresada);

                if(precioSilla == -1) {
                    System.out.println("No fue posible vender esa siila, intente con otra.");
                }else {
                    totalAcumulado = totalAcumulado + precioSilla;
                    System.out.println("silla " + filaIngresada + columnaIngresada + " vendida por $" + precioSilla + ". Total acumulado: $" + totalAcumulado);
                }

                System.out.println("Desea comprar otra silla? (S = si / N = no): ");
                deseaContinuar = scanner.next().toUpperCase();
            }

            System.out.println("\n--- Resumen de la venta --- ");
            System.out.println("Total a pagar: $" + totalAcumulado);
            System.out.println("Sillas disponibles restantes en la funcion: " + contarDisponibles());
        }
    }
}