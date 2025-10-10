package com.vinicius.debugging;

import java.util.logging.SimpleFormatter;

public class Main {
    public static void main(String[] args) {
        System.out.println("Iniciou metodo main");
        a();
        System.out.println("Finalizou no metodo main");
    }
    public static void a() {
        System.out.println("entrou no metodo a");
        b();
        System.out.println("finalizou o metodo a");
    }

    public static void b() {
        System.out.println("entrou no metodo b");
        for (int i = 0; i <= 4; i++) System.out.println(i);
        c();
        System.out.println("finalizou o metodo b");
    }

    public static void c() {
        System.out.println("entrou no metodo c");
        Thread.dumpStack();
        System.out.println("finalizou o metodo c");
    }




}
