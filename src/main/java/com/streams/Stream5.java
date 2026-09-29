package com.streams;

import java.util.List;
import java.util.stream.Stream;

public class Stream5 {

    public static void main(String[] args) {

        List<String> paises = List.of("América", "Europa", "Asia", "Oceania", "Africa", "Antartida");

        Stream<String> str = paises.stream();

        int total = str.reduce(0, (id, s) -> id + s.length(), Integer::sum);

        System.out.println(total);
    }
}
