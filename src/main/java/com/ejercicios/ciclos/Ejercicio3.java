/*
    Ejercicio 3: Leer números hasta quese introduzca
    un 0. Para cada uno indicar si es para o impar
*/
package com.ejercicios.ciclos;

import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero;

        System.out.println("Digite un numero: ");
        numero = scanner.nextInt();

        while (numero != 0) {
            if (numero % 2 == 0) {
                System.out.println("El numero: " + numero + " es par");
            } else {
                System.out.println("El numero: " + numero + " es impar");
            }

            System.out.println("Digite un numero: ");
            numero = scanner.nextInt();
        }

    }
}
