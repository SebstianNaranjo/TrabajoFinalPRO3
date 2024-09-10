package org.example.Ejercicios;

import java.util.Scanner;

public class BucleSumaCero_20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int suma = 0;

        int numero;

        do {
            System.out.print("Introduce un numero (0 para terminar): ");
            numero = (int) scanner.nextDouble();
            suma += numero;
        } while (numero != 0);

        System.out.println("La suma de los numeros ingresados es: " + suma);

        scanner.close();
    }
}