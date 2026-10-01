package com.ejercicios.ciclos;

import javax.swing.JOptionPane;

public class Ejercicio21 {

    public static void main(String[] args) {
        int numero;
        boolean hay_negativos = false;

        for (int i = 1; i <= 10; i++) {
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));

            if (numero < 0) {
                hay_negativos = true;
            }
        }

        if (hay_negativos == true) {
            System.out.println("Si existe algun numero negativo");
        } else {
            System.out.println("No existe un numero negativo");
        }
    }
}
