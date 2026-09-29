/*
    Ejercicio 14: Hacer un programa que pase
    de KG a otra unidad de medida de masa,
    mostrar en pantalla un menú con las opciones
    posibles
*/
package com.ejercicios.condicionales;

import javax.swing.JOptionPane;

public class Ejercicio14 {

    public static void main(String[] args) {

        int opcion;
        double kg, resultado;

        opcion = Integer.parseInt(JOptionPane.showInputDialog(
                "Conversor de unidades de masa\n" +
                        "1. Kilogramos a gramos\n" +
                        "2. Kilogramos a miligramos\n" +
                        "3. Kilogramos a libras\n" +
                        "4. Kilogramos a toneladas\n" +
                        "5. Salir"));

        switch (opcion) {

            case 1:
                kg = Double.parseDouble(
                        JOptionPane.showInputDialog("Ingrese los kilogramos:"));

                resultado = kg * 1000;

                JOptionPane.showMessageDialog(null,
                        kg + " kg = " + resultado + " gramos");
                break;

            case 2:
                kg = Double.parseDouble(
                        JOptionPane.showInputDialog("Ingrese los kilogramos:"));

                resultado = kg * 1000000;

                JOptionPane.showMessageDialog(null,
                        kg + " kg = " + resultado + " miligramos");
                break;

            case 3:
                kg = Double.parseDouble(
                        JOptionPane.showInputDialog("Ingrese los kilogramos:"));

                resultado = kg * 2.20462;

                JOptionPane.showMessageDialog(null,
                        kg + " kg = " + resultado + " libras");
                break;

            case 4:
                kg = Double.parseDouble(
                        JOptionPane.showInputDialog("Ingrese los kilogramos:"));

                resultado = kg * 0.001;

                JOptionPane.showMessageDialog(null,
                        kg + " kg = " + resultado + " toneladas");
                break;

            case 5:
                JOptionPane.showMessageDialog(null, "Programa finalizado.");
                break;

            default:
                JOptionPane.showMessageDialog(null, "Opción incorrecta.");
        }
    }
}
