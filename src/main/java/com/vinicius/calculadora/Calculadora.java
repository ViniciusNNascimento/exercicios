package com.vinicius.calculadora;

public class Calculadora {

    public static void soma(double a, double b) {
        double resultado = a + b;
        System.out.println("A soma de " + a + " e " + b + " eh: " + resultado);
    }

    public static void subtracao(double a, double b) {
        double resultado = a - b;
        System.out.println("A subtração de " + a + " e " + b + " eh: " + resultado);
    }
    public static void multiplicacao(double a, double b) {
        double resultado = a * b;
        System.out.println("A multiplicação de " + a + " e " + b + " eh: " + resultado);
    }
    public static void divisao(double a, double b) {
        double resultado = a / b;
        System.out.println("A divisão de " + a + " e " + b + " eh: " + resultado);
    }

}


