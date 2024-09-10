package org.example.Ejercicios;
import java.util.Scanner;

public class ContadoNumPositivoNegativo_21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int positivos = 0;
        int negativos = 0;
        int numero;

        do {
            System.out.print("Introduce un numero (0 para terminar): ");
            numero = scanner.nextInt();
            if (numero > 0) {
                positivos++;
            } else if (numero < 0) {
                negativos++;
            }
        } while (numero != 0);

        System.out.println("Cantidad de numeros positivos: " + positivos);
        System.out.println("Cantidad de numeros negativos: " + negativos);
        scanner.close();
    }
}