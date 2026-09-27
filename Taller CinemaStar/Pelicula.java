import java.util.Scanner;

public class Pelicula 
{
    private String nombre;
    private String idioma;
    private String tipoPelicula;
    private int duracionMinutos;

    public Pelicula(String nNombre, String iIdioma, String tTipoProyeccion, int dDuracionMinutos )
    {
        nombre = nNombre;
        idioma = iIdioma;
        tipoPelicula = tTipoProyeccion;
        duracionMinutos = dDuracionMinutos;
    }

    // Como los atributos de arriba son privados, necesitamos crear estos pequeños métodos públicos 
    // para obtener (get) desde otras partes del programa (como desde la clase Sala)

    public String getNombre() {return nombre; }
    public String getIdioma () {return idioma;}
    public String getTipoPelicula() {return tipoPelicula;}
    public int getDuracionMinutos() {return duracionMinutos;}

    public void mostrarInfo()
    {
        System.out.println("Titulo: " + nombre + "\nIdioma: " + idioma + "\ntipo: " + tipoPelicula + "\nDuracion: " + duracionMinutos + " min");
    }

    public static Pelicula solicitarDatos(Scanner scanner)
    {
        scanner.nextLine();

        System.out.print("Nombre de la pelicula: ");
        String nombreIngresado = scanner.nextLine();

        System.out.print("Idioma: ");
        String idiomaIngresado = scanner.nextLine();

        int opcionTipo = 0;
        
        while (opcionTipo != 1 && opcionTipo != 2) 
        {
            System.out.println("En que formato quiere ver la pelicula?: ");
            System.out.println("1. 35mm");
            System.out.println("2. 3D");
            System.out.print("digite lo que quiera: ");
            opcionTipo = scanner.nextInt();

            if (opcionTipo != 1 && opcionTipo != 2) {
                System.out.println("\n Opcion invalida, pruebe de neuvo por favor");
            }
        }
         
        String tipoIngresado;
        if (opcionTipo == 1) {
            tipoIngresado = "35mm";
        } else {
            tipoIngresado = "3D";
        }

        System.out.print("cuanta es la duracion de minutos en la pelicula: ");
        int duracionIngresada = scanner.nextInt();

    // Usé la palabra reservada new para llamar al Constructor 
        return new Pelicula(nombreIngresado, idiomaIngresado, tipoIngresado, duracionIngresada);
    }
}