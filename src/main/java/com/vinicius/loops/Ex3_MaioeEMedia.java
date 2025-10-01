package com.vinicius.loops;

import java.util.Scanner;

public class Ex3_MaioeEMedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;
        int i = 0;
        int maior = 0;
        int soma = 0;

        do {
            System.out.println("Numero: ");
            numero = scan.nextInt();
            soma = soma + numero;

            if (numero > maior) {
                maior = numero;
            }
            i++;


        } while (i < 5);

        System.out.println("O maior numero: "+ maior);
        System.out.println("A soma: "+ soma);
        System.out.println("A media: "+ (soma / 2));




    }
}
