package com.vinicius.loops;

import java.util.Scanner;

public class Ex4_ParEImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int quantidadeNum;
        int i = 0;
        int quantidadePar = 0;
        int quantidadeImpar = 0;


        System.out.println("Quantidade de numeros: ");
        quantidadeNum = scan.nextInt();

        do {
            System.out.println("Digite o numero: ");
            int num = scan.nextInt();
            if ((num % 2) == 0) {
                quantidadePar++;
            } else {
                quantidadeImpar++;

            }
            i += 1;
        // i = i + 1;
        }
        while (i < quantidadeNum);
        System.out.println("Impar: " + quantidadeImpar);
        System.out.println("Par: " + quantidadePar);

//        int numero;
//        int quantidadePar = 0;
//        int quantidadeImpar = 0;
//
//        int i = 0;
//        while (i < 5) {
//            System.out.println("Digite um numero");
//            numero = scan.nextInt();
//            if ((numero % 2) == 0) {
//                quantidadePar++;
//
//            } else {
//                quantidadeImpar++;
//
//            }
//            i++;
//        }
//        System.out.println("Total de impares: " + quantidadeImpar);
//        System.out.println("Total de pares: " + quantidadePar);

    }
}
