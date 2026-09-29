/*
    Ejercicio 4: En MegaPlaza se hace un 20% de 
    descuento a los clientes cuya compra supere los 
    $300. ¿Cuál será la compra que pagará una
    persona por su compra?
*/
package com.ejercicios.condicionales;

import javax.swing.JOptionPane;

public class Ejercicio4 {
    
    public static void main(String[] args) {
        
        float descuento, total, compra;

        compra = Float.parseFloat(JOptionPane.showInputDialog("Digite la compra de compra"));

        if (compra > 300) {
            descuento = (float) 0.2 * compra;
            total = compra - descuento;
            JOptionPane.showMessageDialog(null, "Debe pagar: " +total + "por la compra");  
        }else{
            JOptionPane.showMessageDialog(null, "Debe pagar: " +compra + "por la compra");
        }
    } 
}
