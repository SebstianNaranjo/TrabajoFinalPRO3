package org.example.Ejercicios;

import java.util.Scanner;

public class ConteoPalabrasFrase_25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce una frase:");
        String frase = scanner.nextLine();
        int numeroPalabras = 0;

        if (frase != null && !frase.isEmpty()) {
            String[] palabras = frase.trim().split("\\s+");
            numeroPalabras = palabras.length;
        }

        System.out.println("La frase tiene " + numeroPalabras + " palabras.");
        scanner.close();
    }
}