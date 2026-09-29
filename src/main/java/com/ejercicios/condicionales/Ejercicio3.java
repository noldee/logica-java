/*
    Ejercicio 3: Hacer un progama que lea un carácter 
    por teclado y compruebe si es una letra mayúscula
*/
package com.ejercicios.condicionales;

import javax.swing.JOptionPane;

public class Ejercicio3 {
    public static void main(String[] args) {
        char letra;
        
        letra = JOptionPane.showInputDialog("Digite una letra: ").charAt(0);
        
        if (Character.isUpperCase(letra)) {
            JOptionPane.showMessageDialog(null, "Es letra mayuscula");
        }else{
            JOptionPane.showMessageDialog(null, "Es una letra miniscula");
        }
    }   
}
