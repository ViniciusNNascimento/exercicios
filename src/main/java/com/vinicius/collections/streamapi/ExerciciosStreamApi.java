package com.vinicius.collections.streamapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.*;
import java.util.stream.Collectors;

public class ExerciciosStreamApi {
    public static void main(String[] args) {

        List<String> numerosAleatorios = Arrays.asList("1", "0", "3", "4", "17", "8", "9", "2");

        System.out.println("Imprima todos os elementos desta lista de string: ");
//        numerosAleatorios.stream()
//                .forEach(System.out::println);
//        numerosAleatorios.forEach(System.out::println);

//        System.out.println("Pegue os 5  primeiros e coloque dentro de um Set: " );
//        numerosAleatorios.stream()
//                .limit(5)
//                .collect(Collectors.toSet())
//                .forEach(System.out::println);

        System.out.println("Transforme esta lista de string em uma lista de numeros inteiros: ");
//        List<Integer> numerosAleatorios1 = numerosAleatorios.stream()
//                .map(Integer::parseInt).collect(Collectors.toList());

        List<Integer> listInteger = numerosAleatorios.stream()
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        System.out.println("Pegue os numeros pares e maiores do que 2 e coloque em uma lista: ");
//        numerosAleatorios.stream()
//                .map(Integer::parseInt)
//                .filter(i -> % 2 == 0 && i > 2)
//                .collect(Collectors.toList())
//                .forEach(System.out::println);

//        List<Integer> listParse = numerosAleatorios.stream()
//                .map(Integer::parseInt)
//                .filter(i -> (i % 2 == 0 && i > 2))
//                .collect(Collectors.toList());
//        System.out.println(listParse);

//        System.out.println("Mostre a media dos numeros: ");
//        numerosAleatorios.stream()
//                .mapToInt(Integer::parseInt)
//                .average()
//                .ifPresent(System.out::println);

        System.out.println("Remova os valores impares: ");
        listInteger.removeIf(integer -> (integer % 2 != 0));
        System.out.println(listInteger);

    }
}
