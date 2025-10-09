package com.vinicius.estruturasdados.queue;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<Carro> carros = new LinkedList<>();

        carros.add(new Carro("Maserati"));
        carros.add(new Carro("Lamborghini"));
        carros.add(new Carro("Porsche"));

        System.out.println(carros.add(new Carro("Ferrari")));

        System.out.println(carros.offer(new Carro("RedBull")));
        System.out.println(carros);

        System.out.println(carros.peek());
        System.out.println(carros);

        System.out.println(carros.poll());
        System.out.println(carros);

        System.out.println(carros.isEmpty());
        System.out.println(carros.size());


    }
}
