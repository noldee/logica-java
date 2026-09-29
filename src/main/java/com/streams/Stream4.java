package com.streams;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Stream4 {

    public static void main(String[] args) {
        var continentes = Arrays.asList("América", "América", "Europa", "Asia", "Oceania", "Africa", "Antartida");

        var lista = continentes.stream().collect(Collectors.toList());
        System.out.println(lista);

    }
}
