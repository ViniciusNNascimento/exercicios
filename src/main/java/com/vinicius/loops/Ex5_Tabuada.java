package com.vinicius.loops;

import java.util.Arrays;
import java.util.Scanner;

public class Ex5_Tabuada {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Tabuada: ");
        int tabuada = scan.nextInt();

        System.out.println("Tabuada do: " + tabuada);

        for (int i = 1; i <= 100; i++) {
            System.out.println(i + "X" + tabuada + " = " + (tabuada * i));
        }

//        int i = 1;
//        while (i <= 10) {
//            System.out.println(tabuada * i);
//            i++;
//        }

    }
}
