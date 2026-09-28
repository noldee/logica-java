/*
    Ejercicio: 6: Hacer un programa que calcule
    el cuadrado de una suma

    (a+b)² = a² + b² + 2ab
*/
package com.ejercicios.operadores;

import java.util.Scanner;

public class Ejercicio6 {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        float num1, num2, resultado;

        System.out.println("Digite el primer numero: ");
        num1= entrada.nextFloat();
        System.out.println("Digite el segundo numero: ");
        num2 = entrada.nextFloat();
        
        resultado = (float) Math.pow(num1, 2) + 2 * num1 * num2 +(float) Math.pow(num2, 2);

        System.out.println("La suma del cuadrado es: "+ resultado);
    }
}
