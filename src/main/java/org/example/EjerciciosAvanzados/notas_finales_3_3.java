package org.example.EjerciciosAvanzados;

public class notas_finales_3_3 {

    public static void main(String[] args) {

        String[] Nombres =  {"juan", "victor", "david", "pacheco"};

        float[][] Notas = {
                {5.0f, 4.9f, 4.9f, 5.0f}, //notas juan
                {4.4f, 2.2f, 2.8f, 4.5f}, //notas victor
                {5.0f, 3.2f, 4.8f, 3.0f}, //notas david
                {3.4f, 2.2f, 2.8f, 4.5f}  //notas pacheco
        };


        // Recorrer
        for (int i = 0; i < Nombres.length; i++) {
            System.out.print("Estudiante: " + Nombres[i] + " - Notas: ");
            float suma = 0;
            for (int e = 0; e < Notas[i].length; e++) {
                System.out.print(Notas[i][e] + " ");
                suma += Notas[i][e];
            }

            float notaFinal = suma / Notas[i].length;
            System.out.println("- Nota definitiva: " + notaFinal);
        }



 }

}
