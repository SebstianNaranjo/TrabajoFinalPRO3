package org.example.Ejercicios;

import java.util.Scanner;

public class ComversionTem_19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce una temperatura en Celsius: ");
        double celsius = scanner.nextDouble();

        double fahrenheit = celsius * 9 / 5 + 32;

        System.out.println(celsius + " grados Celsius son " + fahrenheit + " grados Fahrenheit.");
        scanner.close();
    }
}
