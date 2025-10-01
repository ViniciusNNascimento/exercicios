package com.vinicius.loops;

import com.vinicius.calculadora.Mensagem;

import java.util.Scanner;

public class Ex2_Nota {
    public static void main(String[] args) {
        Mensagem mensagem = new Mensagem();

        Scanner scan = new Scanner(System.in);

        int nota;

        System.out.println("Nota: ");
        nota = scan.nextInt();
//
//        while (nota < 0 || nota > 10) {
//            System.out.println("Nota invalida! \nDigite novamente");
//            nota = scan.nextInt();
//        }

        for (int i = 0; nota < 0 | nota > 10; i++) {
            System.out.println("Nota invalida!! \nDigite denovo");
            nota = scan.nextInt();
        }


        if (nota > 6) {
            mensagem.mensagemBomDia("");
        } else {
            mensagem.mensagemBoaNoite("reprovou");
        }

    }
}
