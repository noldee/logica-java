/*
    Ejercicio 8: Construir un programa que calcule
    y muestre por pantalla las raíces de la ecuación de 
    segundo grado de coeficientes reales
*/
package com.ejercicios.operadores;

import java.util.Scanner;

public class Ejercicio8 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double num1, num2, num3, resultado1, resultado2;

        System.out.println("Digite el num1: ");
        num1 = entrada.nextDouble();
        System.out.println("Digite el nume2: ");
        num2 = entrada.nextDouble();
        System.out.println("Digite el num3: ");
        num3 = entrada.nextDouble();
 
        resultado1 = (-num2 + Math.sqrt(Math.pow(num2, 2) - 4 * num1 * num3)) / (2 * num1);
        resultado2 = (-num2 - Math.sqrt(Math.pow(num2, 2) - 4 * num1 * num3)) / (2 * num1);
        System.out.println("Primera raíz: " + resultado1);
        System.out.println("Segunda raíz: " + resultado2);
    }

}
