/*
    Ejercicio 20: Pedir un número N, introducir N sueldos
    y mostrar el sueldo maximo.
*/

package com.ejercicios.ciclos;

import javax.swing.JOptionPane;

public class Ejercicio20 {
    public static void main(String[] args) {
        int N = Integer.parseInt(JOptionPane.showInputDialog("Introduce N: "));
        float sueldo, maximo = 0;

        for (int i = 1; i <= N; i++) {
            sueldo = Float.parseFloat(JOptionPane.showInputDialog("Sueldo " + i + ": "));
            if (sueldo > maximo) {
                maximo = sueldo;
            }
        }

        JOptionPane.showMessageDialog(null, "Sueldo máximo: $" + maximo);
    }
}