package org.example.EjerciciosAvanzados;

import java.util.Scanner;

public class SimDeCajaRegistradora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("introduzca el total de la compra: ");
        double totalCompra = scanner.nextDouble();
        System.out.print("introduzca el monto entregado por el cliente: ");
        double montoEntregado = scanner.nextDouble();
        double cambio = montoEntregado - totalCompra;

        if (cambio < 0) {
            System.out.println("El monto entregado no es suficiente.");
        } else {
            System.out.println("El cambio a devolver es: " + cambio + " pesos.");
        }
        scanner.close();
    }
}
