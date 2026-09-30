/*
    Ejercicio 8: Pedir un número N, y mostrar todos
    los números del 1 al N.
*/
package com.ejercicios.ciclos;

import javax.swing.JOptionPane;

public class Ejercicio8 {

    public static void main(String[] args) {

        int numero;

        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número: "));

        for (int i = 1; i <= numero; i++) {
            System.out.println("Los números son: " + i);
        }
    }
}
