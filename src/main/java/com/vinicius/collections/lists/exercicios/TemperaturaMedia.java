package com.vinicius.collections.lists.exercicios;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TemperaturaMedia {
    public static void main(String[] args) {
        List<Double> tempMedia = new ArrayList<>();

        System.out.println("janeiro " + tempMedia.add(30d));
        tempMedia.add(31d);
        tempMedia.add(33d);
        tempMedia.add(34d);
        tempMedia.add(30d);
        tempMedia.add(31d);

        Iterator<Double> iterator = tempMedia.iterator();
        Double soma = 0d;
        while (iterator.hasNext()) {
            Double next = iterator.next();
            soma += next;
        }
        System.out.println(tempMedia);
        System.out.println("Temperatura media: " + soma / 2);
    }
}
