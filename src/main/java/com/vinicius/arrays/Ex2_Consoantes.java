package com.vinicius.arrays;

import java.util.Scanner;

public class Ex2_Consoantes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] consoantes = new String[6];
        int quantidadeConsoantes = 0;

        int count = 0;
        do {
            System.out.println("Letra: ");
            String letter = scan.next();
            if (!(letter.equalsIgnoreCase("a") |
                    letter.equalsIgnoreCase("e") |
                    letter.equalsIgnoreCase("i") |
                    letter.equalsIgnoreCase("o") |
                    letter.equalsIgnoreCase("u"))
            ) {
                consoantes[count] = letter;
                quantidadeConsoantes++;
            }

            count++;
        } while (count < consoantes.length);
        System.out.println(quantidadeConsoantes);

        for (String consoante : consoantes) {
            if (consoante != null) {
                System.out.print(consoante + " ");
            }
        }
            System.out.print("\nquantidade de consoantes: "+quantidadeConsoantes + " ");
    }
}
