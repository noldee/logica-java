/*
    Ejercicio 1: Leer un número y mostrar su 
    cuadrado, repetir el proceso hasta que se introduzca
    un número negativo.
*/

package com.ejercicios.ciclos;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int numero, cuadrado;

        System.out.println("Digite un numero: ");
        numero = entrada.nextInt();

        while (numero >= 0) {
            cuadrado = (int) Math.pow(numero, 2);
            System.out.println("El número: " + numero + " elevado al cuadro es: " + cuadrado);

            System.out.println("Digite un numero: ");
            numero = entrada.nextInt();
        }
    }
}
