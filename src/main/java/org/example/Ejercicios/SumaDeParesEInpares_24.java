package org.example.Ejercicios;
import java.util.Scanner;

public class SumaDeParesEInpares_24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sumaPares = 0;
        int sumaImpares = 0;
        int numero;

        System.out.println("Introduce numeros (un numero negativo para terminar):");
        while (true) {
            numero = scanner.nextInt();
            if (numero < 0) {
                break;
            }
            if (numero % 2 == 0) {
                sumaPares += numero;
            } else {
                sumaImpares += numero;
            }
        }
        System.out.println("La suma de los numeros pares es: " + sumaPares);
        System.out.println("La suma de los numeros impares es: " + sumaImpares);
        scanner.close();
    }
}