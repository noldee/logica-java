package com.streams;

import java.util.Arrays;

public class Stream3 {
    public static void main(String[] args) {

        var continentes = Arrays.asList("América", "América", "Europa", "Asia", "Oceania", "Africa", "Antartida");

        continentes.stream()
                .distinct()
                .skip(3)
                .sorted()
                .dropWhile(str -> str.startsWith("A"))
                .forEach(System.out::println);
    }
}
