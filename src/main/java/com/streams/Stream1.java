package com.streams;

import java.util.Arrays;
import java.util.List;

public class Stream1 {

    public static void main(String[] args) {
        List<String> paises = nuevaLista();
        paises.stream()
                .distinct()
                .filter(pais -> pais.length() <= 6)
                .forEach(pais -> System.out.println("Pais: " + pais));
    }

    public static List<String> nuevaLista() {

        return Arrays.asList("Argentina", "Bolivia", "Bolivia", "Perú", "México", "Venezuela", "Chile", "Colombia");
    }
}
