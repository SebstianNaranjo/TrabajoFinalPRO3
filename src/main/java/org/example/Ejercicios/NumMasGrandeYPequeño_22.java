package org.example.Ejercicios;
import java.util.Scanner;

public class NumMasGrandeYPequeño_22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int maximo = 0;
        int minimo = 0;
        int numero;

        System.out.print("Introduce un numero (0 para terminar): ");
        numero = scanner.nextInt();
        if (numero != 0) {
            maximo = numero;
            minimo = numero;
        }

        while (numero != 0) {
            System.out.print("Introduce un numero (0 para terminar): ");
            numero = scanner.nextInt();
            if (numero != 0) {
                if (numero > maximo) {
                    maximo = numero;
                }
                if (numero < minimo) {
                    minimo = numero;
                }
            }
        }
        if (maximo == 0 && minimo == 0) {
            System.out.println("No se ingresaron números.");
        } else {
            System.out.println("El numero más grande es: " + maximo);
            System.out.println("El numero más pequeño es: " + minimo);
        }
        scanner.close();
    }
}