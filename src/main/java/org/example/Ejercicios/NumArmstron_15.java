package org.example.Ejercicios;
import java.util.Scanner;

public class NumArmstron_15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce un número entero: ");
        int numero = scanner.nextInt();

        int suma = 0;
        int temp = numero;

        int longDigitos = String.valueOf(numero).length();

        // Recorremos cada dígito del número
        while (temp > 0) {
            int digito = temp % 10;
            suma += Math.pow(digito, longDigitos);
            temp /= 10;
        }

        if (suma == numero) {
            System.out.println(numero + " es un número Armstrong.");
        } else {
            System.out.println(numero + " no es un número Armstrong.");
        }

        scanner.close();
    }
}

