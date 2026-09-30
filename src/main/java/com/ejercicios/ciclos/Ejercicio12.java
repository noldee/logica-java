/*
    Ejercicio 12: Pedir un número y calcular su factorial
*/
package com.ejercicios.ciclos;

import javax.swing.JOptionPane;

public class Ejercicio12 {

    public static void main(String[] args) {
        int numero, factorial = 1;

        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número"));

        for (int i = 1; i <= numero; i++) {
            factorial *= i;
        }

        System.out.println(numero + "!" + "=" + factorial);

    }
}
