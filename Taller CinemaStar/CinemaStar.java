import java.util.Scanner;

public class CinemaStar
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner (System.in);

        Pelicula[] peliculaRegistrada = new Pelicula[20];
        int cantidadPeliculas = 0;

        Sala[] salas = new Sala[3];
        salas[0] = new Sala(1);
        salas[1] = new Sala(2);
        salas[2] = new Sala(3);

        int opcion = 0;

        //creo el menu para el cine
        while (opcion != 4)
        {
            System.out.print("\n=======CinemaStar======="
                                + "\n 1. crear o visualizar las peliculas disponibles"
                                + "\n 2. asignar funciones"
                                + "\n 3. ventas"                    
                                + "\n 4. salir"
                                + "\n elija una opcion: "
            );
            opcion = scanner.nextInt();

            if (opcion == 1) {
                cantidadPeliculas = menuPeliculas(scanner, peliculaRegistrada, cantidadPeliculas);
            } else if (opcion == 2) {
                menuFunciones(scanner, salas, peliculaRegistrada, cantidadPeliculas);
            } else if (opcion == 3) {
                menuVentas(scanner, salas);
            } else if (opcion == 4) {
                System.out.println("\nGracias por la visita a nuestro cine, ¡Vuelva pronto!");
            } else {
                System.out.println("\nOpcion no valida, intentar de nuevo");
            }
        } 

        scanner.close();
    }