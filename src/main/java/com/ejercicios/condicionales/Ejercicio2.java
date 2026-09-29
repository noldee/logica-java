/*
    Ejercicio 2: Pedir dos núnmeros y decir cual es el
    mayo o sin son iguales
*/
package com.ejercicios.condicionales;

import javax.swing.JOptionPane;

public class Ejercicio2 {
    
    public static void main(String[] args) {
        
        int num1, num2;

        num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite el primer numero: "));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite el segundo numero: "));
        
        if (num1 > num2) {
            JOptionPane.showMessageDialog(null, "El numero: " +num1 + "es mayor") ;
        }

        if (num2 > num1) {
            JOptionPane.showMessageDialog(null, "El numero: " + num2 + " es mayor");
        }
        if (num1 == num2) {
            JOptionPane.showMessageDialog(null, "Los numeros son iguales");
        }
    }
}
