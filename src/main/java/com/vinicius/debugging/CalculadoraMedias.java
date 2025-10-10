package com.vinicius.debugging;

import java.util.Scanner;

public class CalculadoraMedias {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] alunos = {"anakin", "mandalorian", "myo", "maria"};

        double media = calculadoraMediaDaTurma(alunos, scan);
        System.out.printf("Media da turma: %.1f ",  media);

    }

    public static double calculadoraMediaDaTurma(String[] alunos, Scanner scanner) {
        double soma = 0;
        for (String aluno : alunos) {
            System.out.printf("nota do aluno %s: ", aluno);
            double nota = scanner.nextInt();
            soma += nota;
        }
        return soma / alunos.length;
    }
}
