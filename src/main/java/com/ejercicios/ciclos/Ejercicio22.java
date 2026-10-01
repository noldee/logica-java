/*
    Ejercicio 22: Pedir 5 calificaciones de alumnos
    y decir al final si hay algún suspenso.
*/

package com.ejercicios.ciclos;

import javax.swing.JOptionPane;

public class Ejercicio22 {

    public static void main(String[] args) {

        int numero;
        boolean haySuspenso = false;

        for (int i = 1; i < 5; i++) {
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite su calificación: "));

            if (numero < 10) {
                haySuspenso = true;
            }
        }

        if (haySuspenso == true) {
            System.out.println("Si hay algunos suspensos");
        } else {
            System.out.println("No hay suspensos");
        }

    }
}
