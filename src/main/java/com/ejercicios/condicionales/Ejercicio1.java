/**
    Ejercicio 1: Hacer un programa que lea un número entero
    y muestre si el número es múltiplo de 10
*/

package com.ejercicios.condicionales;

import javax.swing.JOptionPane;

public class Ejercicio1 {
    
    public static void main(String[] args) {
        
        int numero;

        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));

        if (numero % 10 == 0) {
            JOptionPane.showMessageDialog(null, "El numero " + numero + "es multiplo de 10");
        }else{
            JOptionPane.showMessageDialog(null, "No es multiplo de 10");
        }
    }
}
