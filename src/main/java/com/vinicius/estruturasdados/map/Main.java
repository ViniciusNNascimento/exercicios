package com.vinicius.estruturasdados.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Map<String, String> aluno = new HashMap<>();
        aluno.put("Nome", "Anakin");
        aluno.put("Idade", "17");
        aluno.put("Media", "8.0");
        aluno.put("Turma", "3a");

        System.out.println(aluno);

        System.out.println(aluno.keySet());
        System.out.println(aluno.values());

        Map<String, String> aluno1 = new HashMap<>();
        aluno1.put("Nome", "Obi-wan Kenobi");
        aluno1.put("Idade", "18");
        aluno1.put("Media", "9.0");
        aluno1.put("Turma", "3b");

        List<Map<String, String>> listAlunos = new ArrayList<>();
        listAlunos.add(aluno);
        listAlunos.add(aluno1);
        System.out.println(listAlunos);

        System.out.println(aluno.containsKey("Nome"));

    }
}
