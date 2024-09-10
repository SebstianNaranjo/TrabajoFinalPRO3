package org.example.Ejercicios;
import java.util.Scanner;

public class ConteoDeDigitos_28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Por favor, introduzca un número entero: ");
        int n = scanner.nextInt();
        int numeroDigitos = 0;
        int numero = n;

        do {
            numero /= 10;
            numeroDigitos++;
        } while (numero != 0);
        System.out.println("El número " + n + " tiene " + numeroDigitos + " dígitos.");
        scanner.close();
    }
}
