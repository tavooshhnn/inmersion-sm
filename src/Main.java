import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
            System.out.println("Bienvenido a la inmesion de datos");
            //System.out.println("Pelicula Matrix");

            int fechaDeLAnzamiento = 1999;
            double evaluacion = 4.5;
            boolean incluidoEnElPlanBasico = true;
            String nombre = "Matrix";
            String sinopsis = """
                    La mejor pelicula del fin del milenio
                    mi pelicula que fue tarea de logica
                    """;

            double mediaEvaluacionUsuario = 0;

            System.out.println("Pelicula: " + nombre);
            System.out.println(fechaDeLAnzamiento);
            System.out.println(evaluacion);
            System.out.println(incluidoEnElPlanBasico);
            System.out.println(sinopsis);

            double mediaEvaluacion = (4.5 + 4.8 + 3) / 3;
            System.out.println("media de la evaluacion de matrix " + mediaEvaluacion);

            if (fechaDeLAnzamiento >= 2023){
                System.out.println("Pelicula popular en el momento");
            }else {
                System.out.println("Pelicula retro que vale la pena ver");
            }

            for (int i = 0; i < 5; i++) {
                Scanner teclado = new Scanner(System.in);
                System.out.println("Ingresa la nota que le daria a la pelicula matrix");
                double notaMAtrix = teclado.nextDouble();
                mediaEvaluacionUsuario = mediaEvaluacionUsuario + notaMAtrix;
            }
            System.out.println("La media de la pelicula "
                    + "MAtrix calculada por el usuario: " + mediaEvaluacionUsuario / 5);

        }

    }