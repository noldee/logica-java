/*
    Ejercicio 10: Pedir 10 números y escribir la suma
    total.
*/

package com.ejercicios.ciclos;

import javax.swing.JOptionPane;

public interface Ejercicio10 {

    public static void main(String[] args) {
        int numero, suma = 0;
        for (int i = 0; i < 10; i++) {
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
            suma = suma + numero;
        }

        System.out.println("La suma de los 10 numeros es: " + suma);
    }
}
