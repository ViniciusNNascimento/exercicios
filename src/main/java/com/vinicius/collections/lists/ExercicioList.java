package com.vinicius.collections.lists;

import java.util.*;

public class ExercicioList {
    public static void main(String[] args){
        List<Double> notas = new ArrayList<>();

        notas.add(6d);
        notas.add(5d);
        notas.add(8d);
        notas.add(9d);
        System.out.println(notas);

        notas.remove(2);
        System.out.println(notas.toString());

        notas.set(0, 10d);
        System.out.println(notas);

        System.out.println("Exiba a terceita nota: " + notas.get(2));
        System.out.println(notas.toString());

        System.out.println("Exiba a menor nota: " + Collections.min(notas));
        System.out.println("Exiba a maior nota: " + Collections.max(notas));

        System.out.println("Exiba a soma dos valores: " );
        Iterator<Double> iterator = notas.iterator();
        Double soma = 0d;
        while (iterator.hasNext()) {
            Double next = iterator.next();
                    soma += next;
        }

    }
}
