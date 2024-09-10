package org.example.Ejercicios;

import java.util.Scanner;

public class minimo_comunMultiplo_8 {

    public static int calcularMCD(int a, int b) {
        // Mientras b no sea cero
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static int calcularMCM(int a, int b) {
        // Fórmula para el MCM: |a * b| / MCD(a, b)
        return Math.abs(a * b) / calcularMCD(a, b);
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario los dos números
        System.out.print("Ingrese el primer número: ");
        int num1 = scanner.nextInt();
        System.out.print("Ingrese el segundo número: ");
        int num2 = scanner.nextInt();

        // Calcular el MCD
        int mcm = calcularMCM(num1, num2);


        System.out.println("El MCD de " + num1 + " y " + num2 + " es: " + mcm);

        scanner.close();

    }



}
