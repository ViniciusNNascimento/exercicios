package com.vinicius.estruturasdados.list;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Carro> carros = new ArrayList<>();

        carros.add(new Carro("Maserati"));
        carros.add(new Carro("McLaren"));
        carros.add(new Carro("RedBull"));
        carros.add(new Carro("Mercedes"));

        System.out.println(carros.contains(new Carro("RedBull")));

        System.out.println(carros.get(1));
        System.out.println(carros.indexOf(new Carro("Mercedes")));

        System.out.println(carros.remove(2));
        System.out.println(carros);

        System.out.println(carros.add(new Carro("Ferrari")));
        System.out.println(carros);

    }
}
