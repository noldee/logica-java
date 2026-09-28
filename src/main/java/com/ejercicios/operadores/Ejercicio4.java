/*
    Ejercicio 4: Una compañia de venta de carros usados, paga a su
    personal de ventas el salario de $1000 mensuales,
    mas una comisión de $150 por cada carro vendido, más
    el 5% del valor de venta por carro. Cada mes el 
    capturista de la empresa ingresa en la computadora
    los datos pertinentes. Hacer un programa que calcule
    e imprima el salario mensual de un vendedor dado
*/
package com.ejercicios.operadores;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        
        Scanner entrada= new Scanner(System.in);

        float salarioMensual, precioCarro;
        float carrosVendidos, comisionCarroVendido, ventaPorCarro = 0.05f;

        System.out.println("Digite los carros vendidos: ");
        carrosVendidos = entrada.nextFloat();
        
        System.out.println("Digite el precio del carro: ");
        precioCarro= entrada.nextFloat();

        comisionCarroVendido = carrosVendidos * 150 + (precioCarro * ventaPorCarro);
        salarioMensual = 1000 + comisionCarroVendido;

        System.out.println("El salario mensual es :"+salarioMensual);

    }
}
