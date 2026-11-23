import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        String[] catalogo = {
                "Java desde cero",
                "Programacion en Java",
                "Aprende Python",
                "HTML y CSS",
                "Java avanzado",
                "Bases de datos"
        };

        System.out.print("Introduce una palabra del titulo: ");
        String busqueda = teclado.nextLine();

        boolean encontrado = false;

        System.out.println("\nResultados de la busqueda:");

        for (int i = 0; i < catalogo.length; i++) {

            if (catalogo[i].toLowerCase().contains(busqueda.toLowerCase())) {

                System.out.println(catalogo[i]);
                encontrado = true;

            }
        }

        if (!encontrado) {
            System.out.println("No se han encontrado libros.");
        }

        teclado.close();
    }
}