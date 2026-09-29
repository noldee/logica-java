/*
    Ejercicio 13: Hacer un programa que simule un cajero automático
    con un saldo inicial de 1000 Dolares, con el siguiente menú de 
    opciones

    1. Ingresar dinero a la cuenta
    2. Retirar dinero de la cuenta
    3. Salir
*/
package com.ejercicios.condicionales;

import javax.swing.JOptionPane;

public class Ejercicio13 {

    public static void main(String[] args) {
        final int saldo_inicial = 1000;
        int opcion;
        float ingreso, saldoActual, retiro;

        opcion = Integer.parseInt(JOptionPane.showInputDialog(
                "Bienvenido a su Cajero Automático\n" +
                        "1. Ingresar cuenta\n" +
                        "2. Retirar saldo\n" +
                        "3. Salir"));

        switch (opcion) {
            case 1:
                ingreso = Float.parseFloat(JOptionPane.showInputDialog("Digite la cantidad "));
                saldoActual = saldo_inicial + ingreso;
                JOptionPane.showMessageDialog(null, "DInero en cuenta " + saldoActual);
                break;
            case 2:
                retiro = Float.parseFloat(JOptionPane.showInputDialog("Digite la cantidad que desee retira "));
                if (retiro >= saldo_inicial) {
                    JOptionPane.showMessageDialog(null, "No cuenta con el saldo suficiente para el retiro");
                } else {
                    saldoActual = saldo_inicial - retiro;
                    JOptionPane.showMessageDialog(null, "Dinero en cuenta: " + saldoActual);
                }
            case 3:
                break;
            default:
                JOptionPane.showMessageDialog(null, "Se equivoco de opción");
                break;
        }
    }
}
