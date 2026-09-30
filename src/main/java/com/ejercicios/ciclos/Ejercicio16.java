/*
    Ejercicio 16: Pide un número  (que debe estar entre
    0 y 10) y mostrar la tabla de multiplicar de dicho
    número
*/
package com.ejercicios.ciclos;

import javax.swing.JOptionPane;

public class Ejercicio16 {

    public static void main(String[] args) {

        int numero, mult = 1;

        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número: "));

        for (int i = 1; i <= 12; i++) {
            if (numero > 10) {
                JOptionPane.showMessageDialog(null, "Coloque otro numero");
                return;
            }
            mult = i * numero;
            System.out.println(numero + "x" + i + "=" + mult);
        }
    }
}
