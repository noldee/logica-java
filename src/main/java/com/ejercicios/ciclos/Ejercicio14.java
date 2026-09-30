/*
    Ejercicio 14: Pedir 10 sueldos.
    Mostrar su suma y cuantos hay mayores de 1000$
*/

package com.ejercicios.ciclos;

import javax.swing.JOptionPane;

public class Ejercicio14 {
    public static void main(String[] args) {

        int sueldos, suma = 0, totalMayores = 0;

        for (int i = 1; i <= 10; i++) {
            sueldos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));

            suma += sueldos;

            if (sueldos >= 1000) {
                totalMayores++;
            }
        }

        System.out.println("La suma es: " + suma);
        System.out.println("Conteo de mayores: " + totalMayores);
    }

}
