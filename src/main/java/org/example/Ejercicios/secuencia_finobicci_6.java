package org.example.Ejercicios;

import java.util.Scanner;

public class secuencia_finobicci_6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario el número de términos que desea
        System.out.print("Ingrese el número para calcular la secuencia de Fibonacci: ");
        int n = scanner.nextInt();

        // Inicializar los primeros dos términos de la secuencia
        int a = 0;
        int b = 1;

        System.out.println("Secuencia de Fibonacci:");

        // Imprimir los primero  términos
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");

            //  secuencia
            int siguiente = a + b;
            a = b;
            b = siguiente;
        }

        scanner.close();
    }
}
