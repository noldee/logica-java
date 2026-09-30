/*
    Ejercicio 2: Leer un número e idiciar si es 
    positivo o negativo. El proceso se repetirá 
    hasta que se introduzca un 0
*/
package com.ejercicios.ciclos;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;

        System.out.println("Digite un número: ");
        numero = scanner.nextInt();

        while (numero != 0) {

            if (numero > 0) {
                System.out.println("El numero :" + numero + " es positovo");
            } else {
                System.out.println("No es positivo");
            }
            System.out.println("Digite un número: ");
            numero = scanner.nextInt();
        }

    }

}
