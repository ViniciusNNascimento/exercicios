package com.vinicius.arrays;

import java.util.Scanner;


public class Ex1_OrdemInversa {
    public static void main(String[] args) {

        int[] vetor = {11, -2, 333, 41, 54, 64};
//
        System.out.println("Vetor invertido: ");
        for (int i = (vetor.length -1); i >= 0; i--) {
            System.out.print(vetor[i] + " ");
        }

        int count = 0;
        System.out.println("\nVetor original: ");
        while (count < vetor.length) {
            System.out.print(vetor[count] + " ");
            count++;
        }

//        for (int array : vetor ) {
//            System.out.println(array);
//        }


    }
}
