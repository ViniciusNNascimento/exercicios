package com.vinicius.estruturasdados.equalshashcode;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Carro> carros = new ArrayList<>();

        carros.add(new Carro("Ford"));
        carros.add(new Carro("Mustang"));
        carros.add(new Carro("Mercedes"));

        System.out.println(carros.contains(new Carro("Mustang")));
        System.out.println(new Carro("Mustang").hashCode());
        System.out.println(new Carro("Mustang1").hashCode());

        Carro carro1 = new Carro("Ford");
        Carro carro2 = new Carro("Mustang");

        System.out.println(carro1.equals(carro2));
    }
}
