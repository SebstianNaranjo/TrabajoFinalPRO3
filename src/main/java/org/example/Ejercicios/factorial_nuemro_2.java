package org.example.Ejercicios;

import java.util.Scanner;

public class factorial_nuemro_2 {


        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            System.out.print("Ingrese un número: ");
            int numero = scanner.nextInt();

            // Inicializar la variable que almacenará el factorial
            long factorial = 1;

            // calcular
            for (int i = 1; i <= numero; i++) {
                factorial = factorial * i;
            }

            System.out.println("El factorial de " + numero + " es: " + factorial);

            scanner.close();
        }
    }


