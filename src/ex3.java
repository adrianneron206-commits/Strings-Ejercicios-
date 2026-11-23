import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner lectura = new Scanner(System.in);

        System.out.println("Introduce un texto:");
        String texto = sc.nextLine();

        System.out.println("En mayúsculas: " + texto.toUpperCase());
        System.out.println("En minúsculas: " + texto.toLowerCase());

        lectura.close();
    }
}