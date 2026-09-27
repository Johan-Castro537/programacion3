public class Funcion
{
    private int franjaHoraria;
    private Pelicula peliculaAsignada; 
    private boolean tienesuAsignacion;

    public Funcion (int fFranjaHoraria)
    {
        franjaHoraria = fFranjaHoraria;
        peliculaAsignada = null;
        tienesuAsignacion = false;
    }

    public int getFranjaHoraria(){return franjaHoraria;} 
    public Pelicula getPeliculaAsignada(){return peliculaAsignada;}
    public boolean tieneAsignacion(){return tienesuAsignacion;}

    public String getHorarioTexto()
    {
        //preferí usar un arreglo de textos para que el codigo sea mas corto 
        // Si el usuario eligió la franjaHoraria 1, le restamos 1 (1 - 1 = 0)
        // Así, nos devuelve la posición 0 del arreglo ("14:00 - 16:30" y asi sucesivamente)
        String[] horarios = {"14:00 - 16:30", "16:30 - 19:00", "19:00 - 21:00"};
        return horarios[franjaHoraria - 1];
    }

    public boolean intentarAsignar(Pelicula pPelicula)
    {
        boolean asignacionValida;
       
        if(!tienesuAsignacion){
            peliculaAsignada = pPelicula;
            tienesuAsignacion = true;
            System.out.println("se ha asignado con exito la pelicula al horario " + franjaHoraria + " (" + getHorarioTexto() + ")");
            asignacionValida = true;
        }else{
            System.out.println("el horario " + franjaHoraria + " (" + getHorarioTexto() + ") ya tiene una pelicula asignada");
            asignacionValida = false;
        }
        return asignacionValida;
    }

    public void mostrarInfo()
    {
        if (tienesuAsignacion){
            System.out.println("Horario" + franjaHoraria + " (" + getHorarioTexto() + "): " + peliculaAsignada.getNombre());
        }else{
            System.out.println("Horario " + franjaHoraria + " (" + getHorarioTexto() + "): aun no cuenta con asignacion de pelicula ");
        }
    }
}