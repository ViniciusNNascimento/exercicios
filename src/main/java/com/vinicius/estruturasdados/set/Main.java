package com.vinicius.estruturasdados.set;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<Carro> hashSetCarros = new HashSet<>();

        hashSetCarros.add(new Carro("Toyota"));
        hashSetCarros.add(new Carro("Volkswagen"));
        hashSetCarros.add(new Carro("Honda"));
        hashSetCarros.add(new Carro("Fiat"));
        hashSetCarros.add(new Carro("Peugeot"));

        System.out.println(hashSetCarros);

        Set<Carro> treeSetCarros = new TreeSet<>();

        treeSetCarros.add(new Carro("Toyota"));
        treeSetCarros.add(new Carro("Volkswagen"));
        treeSetCarros.add(new Carro("Honda"));
        treeSetCarros.add(new Carro("Fiat"));
        treeSetCarros.add(new Carro("Peugeot"));

        System.out.println(treeSetCarros  );

    }
}
