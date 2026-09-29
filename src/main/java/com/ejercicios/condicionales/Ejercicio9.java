/*
    Ejercicio 9: Pedir el día, mes y año de una fecha
    indicar si la fecha es correcta. Suponiendo que todos
    los meses son de 30 días.
*/
package com.ejercicios.condicionales;

import java.util.Scanner;

public class Ejercicio9 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int dia, mes, anio;

        System.out.println("Digite el día");
        dia = entrada.nextInt();
        System.out.println("Digite el mes");
        mes = entrada.nextInt();
        System.out.println("Digite el año");
        anio = entrada.nextInt();

        if ((dia >= 1 ) && (dia <= 30)) {
            if ((mes >= 1) && (mes <= 12)) {
                if (anio != 0) {
                    System.out.println("La fecha es correcta");
                }else {
                    System.out.println("El año es incorrecto");
                }
            }
            else {
                System.out.println("Fecha incorrecta, mes incorrecto");
            }
        }else{
            System.out.println("La fecha es incorrecta, dia incorrecto");
        }
    
    }
}
