import modelo.Pelicula;

import java.util.Scanner;

public class Principal {

    public void muestraElMenu(){
        int opcion = 0;
        Scanner teclado = new Scanner(System.in);
        while (opcion != 9){
            String menu = """
                    Bienvenido(a) a Screenmatch TVS
                    1) Registra nueva pelicula
                    2) Registrar una nueva serie
                    
                    9) Salir del menu
                    """;
            System.out.println(menu);
            opcion = teclado.nextInt();
            teclado.nextLine();
            switch (opcion) {
                case 1:
                    System.out.println("Ingresa el nombre de la Pelicula");
                    String nombre = teclado.nextLine();
                    System.out.println("Ingresa el año de lanzamiento");
                    int fechaDeLanzamiento = teclado.nextInt();
                    teclado.nextLine();
                    System.out.println("Ingresa la duracion en minutos de la pelicula");
                    int duracionEnMinutos = teclado.nextInt();
                    teclado.nextLine();
                    Pelicula peliculaUsuario = new Pelicula();
                    peliculaUsuario.setFechaDeLAnzamiento(fechaDeLanzamiento);
                    peliculaUsuario.setTiempoDeDuracionEnMinutos(duracionEnMinutos);
                    peliculaUsuario.muetraFichaTecnica();
                    break;
                case 9 :
                    System.out.println("Gracias por usar el programa :) ");
                    break;
                default:
                    System.out.println("Opcion no valida, saliendo al menu O_o o_O");
                    break;

            }

        }
    }
}
