package org.example.Ejercicios;

import java.util.Scanner;

public class contador_vocales_4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar palabra
        System.out.print("Ingrese una palabra: ");
        String texto = scanner.nextLine();


        texto = texto.toLowerCase();


        int contarVocales = 0;

        // Recorrer texto
        for (int i = 0; i < texto.length(); i++) {
            char caracter = texto.charAt(i);

            // verificacion
            if (caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u') {
                contarVocales++;
            }
        }

        System.out.println("El número de vocales en la cadena es: " + contarVocales);


        scanner.close();
    }
}
