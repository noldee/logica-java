/*
    Ejercicio 7: Construir un programa que, dado un número
    total de horas, devuelve el número de semanas, días y horas 
    equivalentes. Por ejemplo, dado un total de 1000 horas debe
    mostrar 5 semanas, 6 dias y 16 horas.
*/
package com.ejercicios.operadores;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        int horasTotales, semanas, dias, horas;

        System.out.println("Digite el numero de horas: ");
        horasTotales = entrada.nextInt();

        semanas = horasTotales /168;
        dias = horasTotales%168 / 24;
        horas = horasTotales%24;

        System.out.println("\n Equivalente es: ");
        System.out.println("Semanas: " + semanas);
        System.out.println("Días: " +dias);
        System.out.println("Horas: "+horas);
    }
}
