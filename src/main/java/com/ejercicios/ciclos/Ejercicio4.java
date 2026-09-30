/*
    Ejercicio 4: Pedir números hasta que se teclee
    uno negativo, y mostrar cuántos números se han
    introducido.
*/
package com.ejercicios.ciclos;

import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numero, contador = 0;

        System.out.println("Digite un numero: ");
        numero = scanner.nextInt();

        while (numero >= 0) {

            contador += 1;

            System.out.println("Digite un numero: ");
            numero = scanner.nextInt();

        }
        System.out.println(contador);
    }
}
