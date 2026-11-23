import java.util.Scanner;

public class Counter {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce un texto terminado en punto: ");
        String texto = teclado.nextLine();

        String[] palabras = texto.substring(0, texto.lastIndexOf(".")).split(" ");

        int contadorPalabras = palabras.length;
        int contadorVocales = 0;

        for (int i = 0; i < texto.length(); i++) {

            char letra = Character.toLowerCase(texto.charAt(i));

            if (letra == 'a' || letra == 'e' || letra == 'i' ||
                    letra == 'o' || letra == 'u') {

                contadorVocales++;

            }
        }

        System.out.println("Numero de palabras: " + contadorPalabras);
        System.out.println("Numero de vocales: " + contadorVocales);

        teclado.close();
    }
}