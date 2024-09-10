package org.example.Ejercicios;
import java.util.Scanner;
import java.util.Random;

public class AdivinarNum_23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int numeroAleatorio = random.nextInt(100) + 1;
        int intentos = 0;
        int intentoUsuario;

        System.out.println("Bienvenido al juego Adivina el Numero!");

        do {
            System.out.print("Intente adivinar el numero (entre 1 y 100): ");
            intentoUsuario = scanner.nextInt();
            intentos++;

            if (intentoUsuario < numeroAleatorio) {
                System.out.println("El numero a adivinar es mayor.");
            } else if (intentoUsuario > numeroAleatorio) {
                System.out.println("El numero a adivinar es menor.");
            }
        } while (intentoUsuario != numeroAleatorio);

        System.out.println("¡Felicidades! Has adivinado el numero " + numeroAleatorio + " en " + intentos + " intentos.");
    }
}