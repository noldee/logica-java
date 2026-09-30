/*
    Ejercicio 6: Pedir números hasta que se teclee un
    0, mostrar la suma de todos los números introducidos
*/

package com.ejercicios.ciclos;

import javax.swing.JOptionPane;

public class Ejercicio6 {

    public static void main(String[] args) {

        int numero, suma = 0;

        do {

            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));

            suma = suma + numero;

        } while (numero != 0);

        System.out.println("La suma de los numeros es: " + suma);
    }
}
