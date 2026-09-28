/*
    Guillermo tiene N dólares. Luis tiene la mitad de lo
    que posee Guillermo. Juan tiene la mitad de lo que
    poseeen Luis y Guillermo juntos. Hacer un programa
    que calcule e imprima la cantidad de dinero que tienen
    entre los tres.
*/
package com.ejercicios;

import java.util.Scanner;

public class Ejercicio3 {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float guillermo, luis, juan, total;
        

        System.out.println("Digite la cantidad de dinero que tiene Guillermo");
        guillermo = entrada.nextFloat();

        luis = guillermo / 2;
        juan = (guillermo + luis) / 2;

        total = guillermo +luis + juan;
        System.out.println("La cantidad de dinero entre los 3 es: " + total);
    }
}
