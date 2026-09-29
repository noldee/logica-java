/*
    Ejercicio 12: Pedir una nota de 0 a 10 y mostrarla
    de la forma: Insuficiente, Suficiente, Bien, Notable
    y Sobresaliente
*/
package com.ejercicios.condicionales;

import javax.swing.JOptionPane;

public class Ejercicio12 {

    public static void main(String[] args) {
        int nota;

        nota = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la nota de 0 a 10: "));

        if (nota >= 9) {
            System.out.println("Sobresaliente");
        } else if (nota >= 7) {
            System.out.println("Notable");
        } else if (nota >= 6) {
            System.out.println("Bien");
        } else if (nota >= 5) {
            System.out.println("Suficiente");
        } else {
            System.out.println("Insuficiente");
        }

    }
}
