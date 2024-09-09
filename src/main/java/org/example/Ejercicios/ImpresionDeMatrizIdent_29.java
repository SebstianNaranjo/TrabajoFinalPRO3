package org.example.Ejercicios;
import java.util.Scanner;

public class ImpresionDeMatrizIdent_29 {// toco con ayuda de diosito gpt me quedo grande
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Por favor, introduzca el tamaño de la matriz identidad (n): ");
        int n = scanner.nextInt();
        if (n <= 0) {
            System.out.println("El tamaño de la matriz debe ser un entero positivo.");
            return;
        }

        int[][] matrizIdentidad = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    matrizIdentidad[i][j] = 1;
                } else {
                    matrizIdentidad[i][j] = 0;
                }
            }
        }
        System.out.println("La matriz identidad de tamaño " + n + " es:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrizIdentidad[i][j] + " ");
            }
            System.out.println();
        }
        scanner.close();
    }
}
