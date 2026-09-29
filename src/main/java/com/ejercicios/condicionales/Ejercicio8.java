/*
    Ejercicio 8: Pedir un número entre 0 y 99 999 y 
    decir cúantas cifras tiene.
*/
package com.ejercicios.condicionales;

import java.util.Scanner;

public class Ejercicio8 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int num;

        System.out.println("Digite un número: ");
        num = entrada.nextInt();

        if (num < 10) {
            System.out.println(num + " tiene 1 cifra");
        } else if (num < 100) {
            System.out.println(num + " tiene 2 cifras");
        } else if (num < 1000) {
            System.out.println(num + " tiene 3 cifras");
        } else if (num < 10000) {
            System.out.println(num + " tiene 4 cifras");
        } else if (num < 100000) {
            System.out.println(num + " tiene 5 cifras");
        } else {
            System.out.println("Se pasó del rango");
        }

    }
}