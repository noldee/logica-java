/*
    Ejercicio 6: Hacer un programa que tome dos 
    números y diga si ambos son pares o impares
*/
package com.ejercicios.condicionales;

import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int num1, num2;

        System.out.println("Digite los numeros:");
        num1 = entrada.nextInt();
        num2 = entrada.nextInt();

        if (num1 % 2 == 0 && num2 % 2 == 0) {
            System.out.println("Los numeros " + num1 + " y " + num2 + " son pares");
        } else if (num1 % 2 != 0 && num2 % 2 != 0) {
            System.out.println("Los numeros " + num1 + " y " + num2 + " son impares");
        } else {
            System.out.println("Un numero es par y el otro es impar");
        }

        entrada.close();
    }
}
