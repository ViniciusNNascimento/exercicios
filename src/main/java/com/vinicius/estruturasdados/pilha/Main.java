package com.vinicius.estruturasdados.pilha;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Carro> carros = new Stack<>();

        carros.push(new Carro("Porshe"));
        carros.push(new Carro("Mercedes"));
        carros.push(new Carro("Lamborguini"));

        System.out.println(carros);
        System.out.println(carros.pop());
        System.out.println(carros);

        System.out.println(carros.peek());
        System.out.println(carros.isEmpty());

    }
}
