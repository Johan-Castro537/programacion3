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

    private static int menuPeliculas(Scanner scanner, Pelicula[] peliculas, int cantidadPeliculas) {
        int opcionMenuAnidado = 0;
        
        while (opcionMenuAnidado != 3) {
            System.out.println("\n=== Menu de Peliculas ===");
            System.out.println("1. Registrar Pelicula");
            System.out.println("2. Ver Peliculas");
            System.out.println("3. Volver al menu principal");
            System.out.print("Seleccione una opcion: ");
            opcionMenuAnidado = scanner.nextInt();

            if (opcionMenuAnidado == 1) {
                if (cantidadPeliculas >= peliculas.length) {
                    System.out.println("\nNo hay espacio para peliculas");
                } else {
                    peliculas[cantidadPeliculas] = Pelicula.solicitarDatos(scanner);
                    cantidadPeliculas++;
                    System.out.println("\nPelicula registrada con exito");
                }
            } else if (opcionMenuAnidado == 2) {
                if (cantidadPeliculas == 0) {
                    System.out.println("\nNo hay peliculas registradas");
                } else {
                    for (int i = 0; i < cantidadPeliculas; i++) {
                        System.out.println(peliculas[i]);
                    }
                }
            } else if (opcionMenuAnidado != 3) {
                System.out.println("\nOpcion no valida, intenta de nuevo, por favor");
            }
        }
        return cantidadPeliculas;
    }

    private static void mostrarListaPeliculas(Pelicula[] peliculasRegistradas, int cantidadPeliculas)
    {
        if(cantidadPeliculas == 0){
            System.out.println("\n En este momento no contamos con peliculas en fucion, vuelva pronto");
        }else{
            System.out.println("\n --- Peliculas Registradas ---");
            for (int indice = 0; indice < cantidadPeliculas; indice++) {
                System.out.println((indice + 1));
                peliculasRegistradas[indice].mostrarInfo();
            }
        }
    }

    private static void asignarPeliculaSala(Scanner scanner, Sala[] salas, Pelicula[] peliculasRegistradas, int cantidadPeliculas)
    {
        if (cantidadPeliculas == 0) {
            System.out.println("\nNo hay peliculas registradas");
            return;
        }

        mostrarListaPeliculas(peliculasRegistradas, cantidadPeliculas);
        System.out.print("Seleccione el numero de pelicula: ");
        int numeroPelicula = scanner.nextInt();
        if (numeroPelicula < 1 || numeroPelicula > cantidadPeliculas) {
            System.out.println("\nNumero de pelicula no valido");
            return;
        }

        System.out.print("Seleccione el numero de sala (1-" + salas.length + "): ");
        int numeroSala = scanner.nextInt();
        if (numeroSala < 1 || numeroSala > salas.length) {
            System.out.println("\nNumero de sala no valido");
            return;
        }

        salas[numeroSala - 1].asignarFuncion(peliculasRegistradas[numeroPelicula - 1]);
    }

        private static void menuFunciones(Scanner scanner, Sala[] salas, Pelicula[] peliculaRegistradas, int cantidadPeliculas)
    {
        if(cantidadPeliculas == 0){
            System.out.println("\n****Primer0 debes registrar al menos una pelicula (opcion 1 del menu principal)****");
        } else {
            int opcionMenuAnidado = 0;
            
            while (opcionMenuAnidado != 3) {
                System.out.println("\n--- Asignacion de Funciones ---");
                System.out.println("1. Asignar pelicula a una sala/franja");
                System.out.println("2. Ver funciones asignadas");
                System.out.println("3. Volver al menu principal");
                System.out.print("\nSeleccione una opcion: ");
                opcionMenuAnidado = scanner.nextInt();

                if (opcionMenuAnidado == 1) {
                    asignarPeliculaSala(scanner, salas, peliculaRegistradas, cantidadPeliculas);
                } else if (opcionMenuAnidado == 2) {
                    for (int indiceSala = 0; indiceSala < salas.length; indiceSala++) {
                        salas[indiceSala].mostrarFunciones();
                    }
                } else if (opcionMenuAnidado != 3) {
                    System.out.println("\nOpcion no valida, intentar de nuevo");
                }
            }
        }
    }
}