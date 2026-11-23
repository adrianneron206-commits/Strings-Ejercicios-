
import java.util.Scanner;

public class Classroom {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        String[] alumnos = {
                "Paula",
                "Santiago",
                "Pascual",
                "Jorge",
                "Saul",
                "Enrique"
        };

        for (int i = 0; i < alumnos.length; i++) {

            System.out.print(alumnos[i]);

            if (i < alumnos.length - 1) {
                System.out.print(", ");
            }
        }

        System.out.println();

        System.out.print("Que posicion quieres cambiar? ");
        int posicion = teclado.nextInt();
        teclado.nextLine();

        if (posicion >= 0 && posicion < alumnos.length) {

            System.out.println("Nombre actual: " + alumnos[posicion]);

            System.out.print("Introduce el nuevo nombre: ");
            String nuevoNombre = teclado.nextLine();

            alumnos[posicion] = nuevoNombre;

            System.out.println("Nuevo contenido del array:");

            for (int i = 0; i < alumnos.length; i++) {

                System.out.print(alumnos[i]);

                if (i < alumnos.length - 1) {
                    System.out.print(", ");
                }
            }

        } else {

            System.out.println("La posicion introducida no existe.");

        }

        teclado.close();
    }
}