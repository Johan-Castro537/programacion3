import java.util.ArrayList;
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

        private static void menuPeliculas(Scanner scanner, ArrayList<Pelicula> peliculas) {
        int opcionSubmenu = 0;
        
        while (opcionSubmenu != 3) {
            System.out.println("\n=== Menu de Peliculas ===");
            System.out.println("1. Registrar Pelicula");
            System.out.println("2. Ver Peliculas");
            System.out.println("3. Volver al menu principal");
            System.out.print("Seleccione una opcion: ");
            opcionSubmenu = scanner.nextInt();

            if (opcionSubmenu == 1) {
                if (peliculas.size() >= 20) {
                    System.out.println("\nNo hay espacio para peliculas");
                } else {
                    peliculas.add(Pelicula.solicitarDatos(scanner));
                    System.out.println("\nPelicula registrada con exito");
                }
            } else if (opcionSubmenu == 2) {
                mostrarListaPeliculas(peliculas);
            } else if (opcionSubmenu != 3) {
                System.out.println("\nOpcion no valida, intenta de nuevo, por favor");
            }
        }
    }
    }