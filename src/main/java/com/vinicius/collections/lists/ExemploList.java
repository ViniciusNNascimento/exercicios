package com.vinicius.collections.lists;

import java.util.ArrayList;
import java.util.List;

public class ExemploList {
    public static void main(String[] args) {
        List<Double> notas = new ArrayList<>();
        notas.add(7.0);
        notas.add(5.0);
        notas.add(3.0);
        notas.add(9.0);
        notas.add(9.0);
        notas.add(7.4);
        notas.add(7.6);
        System.out.println(notas.toString());

        System.out.printf("Exiba a posicao da nota 5.0: " + notas.indexOf(9d));
        System.out.println("Adione na lista a nota 8.0: " );
        notas.add(4,8d);
        System.out.println(notas.toString());

        System.out.println("substitua a nota 5.0 pela nota 6.0: ");
        notas.set(notas.indexOf(5d), 6d);
        System.out.println(notas);


        System.out.println("Confira se a nota 5.0 esta na lista: " + notas.contains(6d));

        System.out.println("Exiba todas as notas de acordo com a ordem informada: ");
        for (Double nota : notas ) {
            System.out.print(nota + " ");
        }

    }
}
