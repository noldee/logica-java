/*

Ejercicio 15: Dadas las edades y alturas de 5 alumnos, mostrar la edad y la estatura media, la cantidad de
alumnos mayores de 18 años, y la cantidad de alumnos que miden más de 1.75
    
*/
package com.ejercicios.ciclos;

import javax.swing.JOptionPane;

public class Ejercicio15 {

    public static void main(String[] args) {
        int edad, sumaEdad = 0, conteoMayor18 = 0, conteoMayor175 = 0;
        float altura, sumaAltura = 0, mediaEdad, mediaAltura;

        for (int i = 1; i <= 5; i++) {
            edad = Integer.parseInt(JOptionPane.showInputDialog("Alumno " + i + "Digite su edad"));

            altura = Float.parseFloat(JOptionPane.showInputDialog("Alumno: " + i + "Digite su altura: "));

            sumaEdad += edad;
            sumaAltura += altura;

            if (edad > 10) {
                conteoMayor18++;
            }

            if (altura > 1.75) {
                conteoMayor175++;
            }
        }

        mediaEdad = (float) sumaEdad / 5;
        mediaAltura = (float) sumaAltura / 5;

        System.out.println("La edad promedio es: " + mediaEdad);
        System.out.println("La estatura promedio es: " + mediaAltura);
        System.out.println("Cantidad de alumnos mayores a 18 años: " + conteoMayor18);
        System.out.println("Cantidad de alumnos que miden mas de 1.75: " + conteoMayor175);
    }
}
