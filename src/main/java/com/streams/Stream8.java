package com.streams;

import java.util.List;

public class Stream8 {

    public static void main(String[] args) {

        var frutas = List.of("Manzana", "Pera", "Ciruela");
        var variedades = List.of("Verde", "Amarrillo", "Premium");

        var strings = frutas.stream()
                .flatMap(fruta -> variedades.stream()
                        .map(var -> fruta + " " + var))
                .toList();

        System.out.println(strings);
    }
}
