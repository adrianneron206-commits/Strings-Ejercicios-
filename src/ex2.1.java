//Ex1.java

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce una cadena:");
        String cadena = sc.nextLine();

        System.out.println("La longitud es: " + cadena.length());
    }
}

//Ex2.java

import java.util.Scanner;
import java.util.LinkedHashMap;

public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce una cadena:");
        String cadena = sc.nextLine().trim();

        LinkedHashMap<Character, Integer> frecuencia = new LinkedHashMap<>();

        for (int i = 0; i < cadena.length(); i++) {
            char caracter = cadena.charAt(i);

            if (frecuencia.containsKey(caracter)) {
                frecuencia.put(caracter, frecuencia.get(caracter) + 1);
            } else {
                frecuencia.put(caracter, 1);
            }
        }

        System.out.println(frecuencia);
    }
}

//Ex3.java

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce una cadena:");
        String cadena = sc.nextLine();

        if (cadena.length() < 2) {
            System.out.println("");
        } else {
            String resultado = cadena.substring(0, 2) + cadena.substring(cadena.length() - 2);
            System.out.println(resultado);
        }
    }
}

//Ex4.java

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce una cadena:");
        String cadena = sc.nextLine();

        if (cadena.length() < 3) {
            System.out.println(cadena);
        } else if (cadena.endsWith("ing")) {
            System.out.println(cadena + "ly");
        } else {
            System.out.println(cadena + "ing");
        }
    }
}

//Ex5.java

public class Ex5 {
    public static void main(String[] args) {

        String[] palabras = {"casa", "ordenador", "sol", "programacion", "java"};

        String masLarga = palabras[0];

        for (int i = 1; i < palabras.length; i++) {
            if (palabras[i].length() > masLarga.length()) {
                masLarga = palabras[i];
            }
        }

        System.out.println("La palabra mas larga es: " + masLarga);
        System.out.println("Su longitud es: " + masLarga.length());
    }
}