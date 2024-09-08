package org.example.Ejercicios;

public class SumaNumero_pares {

        public static void main(String[] args) {
            int suma = 0;

            for (int i = 0; i <= 70; i++) {
                if (i % 2 == 0) {
                    suma += i;
                    System.out.println("Número par: " + i);
                }
            }

            System.out.println("La suma de los números pares entre 1 y 100 es: " + suma);
        }

}
