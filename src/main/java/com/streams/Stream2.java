package com.streams;

import java.util.Arrays;

public class Stream2 {

    public static void main(String[] args) {

        var continentes = Arrays.asList("América", "América", "Europa", "Asia", "Oceania", "Africa", "Antartida");

        continentes.stream()
                .distinct()
                .filter((continente) -> continente.startsWith("A"))
                .map((continente) -> continente.toUpperCase())
                .forEach(System.out::println);
    }
}
