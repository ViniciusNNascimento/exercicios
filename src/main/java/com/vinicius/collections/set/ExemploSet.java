package com.vinicius.collections.set;

import java.util.*;

public class ExemploSet {
    public static void main(String[] args) {


        System.out.println("Crie um  conjunto e adicione as notas: ");
        Set<Double> notas = new HashSet<>(Arrays.asList(5.5, 6.2d, 4d, 7d, 9d, 4d));
        System.out.println(notas.toString());


        System.out.println("Confira se a nota 5.0 esta no conjunto: " + notas.contains(5d));

        System.out.println("Exiba a menor nota: " + Collections.min(notas));
        System.out.println("Exiba a maior nota: " + Collections.max(notas));

        Iterator<Double> iterator = notas.iterator();
        Double soma = 0d;

        while (iterator.hasNext()) {
            Double next = iterator.next();
            soma += next;
        }

        System.out.println("Exiba a soma: " + soma);

        System.out.println("Exiba a media: " + (soma / notas.size()));
        notas.remove(4d);
        System.out.println(notas);

        System.out.println("Remova as notas menores que 7.0 e exiba a lista: ");
        Iterator<Double> iterator1 = notas.iterator();
        while (iterator1.hasNext()) {
            Double next = iterator1.next();
            if (next < 7) iterator1.remove();
        }
        System.out.println(notas);
        Set<Double> notas2 = new LinkedHashSet<>();
        notas2.add(7d);
        notas2.add(8d);
        notas2.add(4d);
        notas2.add(9d);
        notas2.add(7d);
        System.out.println(notas2);

        System.out.println("Exiba todas as notas na ordem crescente: ");
        Set<Double> notas3 = new TreeSet<>(notas2);
        System.out.println(notas3);

        System.out.println("Apagar conjunto");
        notas.clear();

        System.out.println("Confira se esta vazio: " + notas2.isEmpty());

    }
}
