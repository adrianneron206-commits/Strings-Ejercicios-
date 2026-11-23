import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un texto:");
        String texto = sc.nextLine();

        if (texto.isEmpty()) {
            System.out.println("El texto está vacío. Fin del programa.");
        } else {
            System.out.println("Introduce una palabra para buscar:");
            String palabra = sc.nextLine();

            if (texto.contains(palabra)) {
                System.out.println("La palabra se ha encontrado.");
            } else {
                System.out.println("La palabra no se ha encontrado.");
            }
        }

        sc.close();
    }
}