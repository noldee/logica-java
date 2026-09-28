/*
    Ejercicio 2: Hacer un programa que calcule e imprima el salario
    semanal de un empleado a partir de sus horas
    semanales trabajadas y de su salario por hora.
*/

package com.ejercicios.operadores;

import java.util.Scanner;

public class Ejercicio2 {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        float horasTrabajadas,  salarioxHora, salario;

        System.out.println("Digite sus horas trabajadas: ");
        horasTrabajadas = entrada.nextFloat();

        System.out.println("Digite el salario por hora");
        salarioxHora =entrada.nextFloat();

        salario =  salarioxHora * horasTrabajadas;

        System.out.println("El salario es: " + salario);
    }
}
