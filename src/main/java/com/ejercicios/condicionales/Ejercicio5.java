/*
Ejercicio 5: Un obrero necesita calcular su salario 
semanal, el cual se obtiene de la siguiente manera:
✓ Si trabaja 40 horas o menos se le paga $16 por hora 
✓ Si trabaja mas de 40 horas se le paga $16 por cada 
una de las primeras 40 horas y $20 por cada hora
extra. 
*/
package com.ejercicios.condicionales;

import java.util.Scanner;

public class Ejercicio5 {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int horasTrabajadas;
        float salarioTotal;

        System.out.println("Ingrese las horas trabajadas: ");
        horasTrabajadas = entrada.nextInt();

        if (horasTrabajadas <= 40) {
            salarioTotal= horasTrabajadas * 16;
        }else {
            salarioTotal = (40 *16) + ((horasTrabajadas - 40) * 20);
        }


        System.out.println("El salario total es: " + salarioTotal);

    }
}
