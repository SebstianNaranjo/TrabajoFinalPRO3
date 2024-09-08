package org.example.Ejercicios;

import java.util.Scanner;

public class numero_primo_3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Solicitar  número
        System.out.print("Ingrese un numero: ");
        int numero = scanner.nextInt();


        boolean esPrimo = true;

        if (numero <= 1) {
            esPrimo = false;
        } else {
            // Comenzar a comprobar si tiene divisores
            for (int i = 2; i <= Math.sqrt(numero); i++) {
                if (numero % i == 0) {
                    esPrimo = false;
                    break;
                }
            }
        }

        // Imprimir el resultado
        if (esPrimo) {
            System.out.println(numero + " es un numero primo.");
        } else {
            System.out.println(numero + " no es un numero primo.");
        }


        scanner.close();

    }
}
