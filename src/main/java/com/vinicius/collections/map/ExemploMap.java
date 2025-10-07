package com.vinicius.collections.map;

import java.util.*;

public class ExemploMap {
    public static void main(String[] args) {


        System.out.println("Crie um dicionario que relacione  os modelos e seus respectivos");
        Map<String, Double> carrosPopulares = new HashMap<>() {{
            put("Gol", 15.6);
            put("BMW", 14.4);
            put("Porshe", 14.0);
            put("Mercedes", 55.66);
            put("RedBull", 15.6);
        }};
        System.out.println(carrosPopulares);

        System.out.println("Substitua o consumo do gol por 15,2 Km/l: ");
        carrosPopulares.put("Gol", 15.2);
        System.out.println(carrosPopulares);

        System.out.println("Confira se o modelo RedBull esta no dicionario: " + carrosPopulares.containsKey("RedBull"));

        System.out.println("Exiba o consumo da Mercedes: " + carrosPopulares.get("Mercedes"));

        System.out.println("Exiba os modelos: ");
        Set<String> modelos = carrosPopulares.keySet();
        System.out.println(modelos);

        System.out.println("Exiba o consumo dos carros: ");
        Collection<Double> consumos = carrosPopulares.values();
        System.out.println(consumos);

        System.out.println("Exiba o modelo mais economicos e seu consumo: ");
        Double consumoEconomico = Collections.max(carrosPopulares.values());
        Set<Map.Entry<String, Double>> entries = carrosPopulares.entrySet();
        String modeloMaisEconomico = "";

        for (Map.Entry<String, Double> entry : entries) {
            if (entry.getValue().equals(consumoEconomico)) {
                modeloMaisEconomico = entry.getKey();
                System.out.println("Modelo mais economico : " + modeloMaisEconomico + " - " + consumoEconomico);
            }
        }

        System.out.println("Exiba o modelo menos economico e seu consumo: ");
        Double menosEconomico = Collections.min(carrosPopulares.values());
        String modelosMenosEconomico = "";

        for (Map.Entry<String, Double> entry : carrosPopulares.entrySet()) {
            if (entry.getValue().equals(menosEconomico)) {
                modelosMenosEconomico = entry.getKey();

                System.out.println("Modelo menos economico: " + modelosMenosEconomico + " - " + menosEconomico);

            }
        }


        Iterator<Double> iterator = carrosPopulares.values().iterator();
        Double soma = 0d;

        while (iterator.hasNext()){
            soma += iterator.next();

        }
        System.out.println("Exiba a soma dos consumo: " + soma);

        System.out.println("Exiba a media dos consumos: " + (soma / carrosPopulares.size()));

        System.out.println("Remova os modelos com o consumo igual a 15,6 km/l: ");
        Iterator<Double> iterator1 = carrosPopulares.values().iterator();
        while (iterator1.hasNext()){
            if (iterator1.next().equals(15.6)) iterator1.remove();
        }
        System.out.println(carrosPopulares);

        System.out.println("Exiba todos os carros na ordem informada: ");
        Map<String, Double> carrosPopulares1 = new LinkedHashMap<>() {{
           put("Gol", 14.4);
           put("Corsa", 14.4);
           put("Vectra", 13.4);
           put("Dodge", 5.4);
           put("Opala", 8.4);
        }};
        System.out.println(carrosPopulares1);

        System.out.println("Exiba o dicionario ordenado pelo modelo: ");
        Map<String, Double> carrosPopulares2 = new TreeMap<>(carrosPopulares1);
        System.out.println(carrosPopulares2.toString());

        System.out.println("Apague o dicionario de carros: " );
        carrosPopulares1.clear();

        System.out.println("Confira se o dicionario esta vazio: " + carrosPopulares1.isEmpty());


    }
}
