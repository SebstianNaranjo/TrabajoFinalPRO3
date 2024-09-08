package org.example.Ejercicios;

public class invertir_numero_5 {
    public static void main(String[] args) {

                int numero = 5981;
                int numeroInvertido = invertirNumero(numero);
                System.out.println("Número original: " + numero);
                System.out.println("Número invertido: " + numeroInvertido);
                int nuevo = 1548%10;
        System.out.println(nuevo);
            }

            public static int invertirNumero(int numero) {
                int numeroInvertido = 0;
                while (numero != 0) {
                    int digito = numero % 10;
                    numeroInvertido = numeroInvertido * 10 + digito;
                    numero /= 10;
                }
                return numeroInvertido;


            }
        }

