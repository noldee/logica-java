/*
    Ejercicio 7: Pedir tres números y mostrarlos 
    ordenados de mayor a menor
*/
package com.ejercicios.condicionales;

import java.util.Scanner;

public class Ejercicio7 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int n1, n2, n3;

        System.out.println("Digite un numero: ");
        n1 = entrada.nextInt();
        n2 = entrada.nextInt();
        n3 = entrada.nextInt();

        if ((n1 > n2) && (n2 > n3)) {
            System.out.println("Orden: " + n1 + " - " + n2 + " - " + n3);
        } else if ((n1 > n3) && (n3 > n2)) {
            System.out.println("Orden: " + n1 + " - " + n3 + " - " + n2);
        } else if ((n2 > n1) && (n1 > n3)) {
            System.out.println("Orden: " + n2 + " - " + n1 + " - " + n3);
        } else if ((n2 > n3) && (n3 > n1)) {
            System.out.println("Orden: " + n2 + " - " + n3 + " - " + n1);
        } else if ((n3 > n1) && (n1 > n2)) {
            System.out.println("Orden: " + n3 + " - " + n1 + " - " + n2);
        } else {
            System.out.println("Orden: " + n3 + " - " + n2 + " - " + n1);

        }

        entrada.close();
    }
}
