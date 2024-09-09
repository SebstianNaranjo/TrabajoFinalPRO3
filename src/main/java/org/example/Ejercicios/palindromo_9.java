package org.example.Ejercicios;

import java.util.Scanner;

public class palindromo_9 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese una palabra: ");
        String texto = sc.nextLine();

        texto = texto.toLowerCase();
        String invertido= "";


            for (int i = texto.length() - 1; i >= 0; i--) {
                invertido += texto.charAt(i);
            }

        System.out.println(invertido);
        if (invertido.equals(texto)){
            System.out.println("El palabrado es un palindromo");
        }
        else{
            System.out.println("El palabrado no es un palindromo");
        }


        sc.close();


    }

}
