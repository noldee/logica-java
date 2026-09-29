/**
 * Ejercicio 10: Pedir el día, mes y año de una fecha
 * e indicar si la fecha es correcta. Con meses de
 * 28, 30 y 31 días. Sin años bisiestos
 */
package com.ejercicios.condicionales;

import java.util.Scanner;

public class Ejercicio10 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int dia, mes, anio;

        System.out.println("Digite el día");
        dia = entrada.nextInt();

        System.out.println("Digite el mes");
        mes = entrada.nextInt();

        System.out.println("Digite el año");
        anio = entrada.nextInt();

        if (mes >= 1 && mes <= 12) {

            if (anio != 0) {

                if (mes == 2) {
                    // Febrero tiene 28 días
                    if (dia >= 1 && dia <= 28) {
                        System.out.println("Fecha correcta");
                    } else {
                        System.out.println("Fecha incorrecta, día incorrecto");
                    }

                } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
                    // Abril, junio, septiembre y noviembre tienen 30 días
                    if (dia >= 1 && dia <= 30) {
                        System.out.println("Fecha correcta");
                    } else {
                        System.out.println("Fecha incorrecta, día incorrecto");
                    }

                } else {
                    // Los demás meses tienen 31 días
                    if (dia >= 1 && dia <= 31) {
                        System.out.println("Fecha correcta");
                    } else {
                        System.out.println("Fecha incorrecta, día incorrecto");
                    }
                }

            } else {
                System.out.println("Fecha incorrecta, año incorrecto");
            }

        } else {
            System.out.println("Fecha incorrecta, mes incorrecto");
        }

        entrada.close();
    }
}