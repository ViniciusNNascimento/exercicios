package com.vinicius;

import com.vinicius.calculadora.Calculadora;
import com.vinicius.calculadora.Emprestimo;
import com.vinicius.calculadora.Mensagem;
import com.vinicius.triangulo.Quadrilatero;

public class Main {

    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();
        Mensagem mensagem = new Mensagem();
        Emprestimo emprestimo = new Emprestimo();
        Quadrilatero quadrilatero = new Quadrilatero();

        //  quadrilatero
        System.out.println("Area do quadrado: " + quadrilatero.area(4));
        System.out.println("Area do retangulo: " + quadrilatero.area(3d, 3d));
        System.out.println("Area do trapezio: " + quadrilatero.area(3, 3, 4));
        System.out.println("Area do losango: " + quadrilatero.area(4f, 4f));

        double areaQuadrado = Quadrilatero.area(3);
        System.out.println("Quadrado: " + areaQuadrado);

        double areaRetangulo = Quadrilatero.area(3, 3);
        System.out.println("Retangulo: " + areaRetangulo);

        double areaTrapezio = Quadrilatero.area(3, 2, 3);
        System.out.println("Trapezio: " + areaTrapezio);

        double areaLosango = Quadrilatero.area(3f, 3f);
        System.out.println("Losango: " + areaLosango);


        // calculadora
        System.out.println("\n -- calculadora --");
        calculadora.soma(5, 23);
        calculadora.subtracao(5, 3);
        calculadora.multiplicacao(5, 3);
        calculadora.divisao(5, 3);

        // mensagem
        System.out.println("\n -- Hora da mensagem -- ");
        mensagem.obterMensagem(20);
        mensagem.obterMensagem(12);
        mensagem.obterMensagem(10);

        // emprestimo
        System.out.println("\n -- Emprestimo --");
        emprestimo.calculaValor(1000, 3);
        emprestimo.calculaValor(1000, 2);
        emprestimo.calculaValor(2000, 2);
    }

}