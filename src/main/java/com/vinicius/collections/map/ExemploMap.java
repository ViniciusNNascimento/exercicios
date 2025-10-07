package com.vinicius.collections.map;

import java.util.*;

public class ExemploMap {
    public static void main(String[] args) {


        System.out.println("Crie um dicionario que relacione  os modelos e seus respectivos");
        Map<String, Double> carrosPopulares = new HashMap<>(){{
            put("Gol", 14.8);
            put("BMW", 25.4);
            put("Porshe", 14.4);
            put("Mercedes", 12.2);
            put("RedBull", 15.66);
        }};
        System.out.println(carrosPopulares);

        System.out.println("Substitua o consumo do gol por 15,2 Km/l: ");
        carrosPopulares.put("Gol", 15.2);
        System.out.println(carrosPopulares);

        System.out.println("Confira se o modelo RedBull esta no dicionario: " + carrosPopulares.containsKey("RedBull"));

        System.out.println("Exiba o consumo da Mercedes: " + carrosPopulares.get("Mercedes"));

        System.out.println("Exiba os modelos: " );
        Set<String> modelos = carrosPopulares.keySet();
        System.out.println(modelos);

        System.out.println("Exiba o consumo dos carros: " );
        Collection<Double> consumos = carrosPopulares.values();
        System.out.println(consumos);

        System.out.println("Exiba o modelo mais economicos: ");
        Double consumoEconomico = Collections.max(carrosPopulares.values());
        System.out.println(consumoEconomico + " Km/l");
    }
}
