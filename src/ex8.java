public class MiniAhorcado {

    public static void main(String[] args) {

        String palabra = "Forrest Gump";
        String resultado = "";

        resultado = resultado + palabra.charAt(0);

        for (int i = 1; i < palabra.length(); i++) {

            if (palabra.charAt(i) == ' ') {
                resultado = resultado + " ";
            } else {
                resultado = resultado + "*";
            }

        }

        System.out.println("Adivina la pelicula: " + resultado);

    }
}