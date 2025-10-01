package com.vinicius.calculadora;

public class Emprestimo {

    public static int getDuasParcelas() {
        return 2;
    }

    public static int getTresParcelas() {
        return 3;
    }

    public static double getTaxaDuasParcelas() {
        return 0.3;
    }

    public static void calculaValor(double valor, int parcelas) {

        if (parcelas == 2) {

            double valorFinal = valor + (valor * getDuasParcelas());
            System.out.println("Valor final do emprestimo(" + valor + ") para duas parcelas: " + valorFinal);
        } else if (parcelas == 3) {

            double valorFinal = valor + (valor * getTresParcelas());
            System.out.println("Valor final do emprestimo(" + valor + ") para tres parcelas: " + valorFinal);
        } else {
            System.out.println("Digite um valor de parcelas valido ate TRES!");
        }

    }

}
