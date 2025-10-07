package com.vinicius.collections.set;

import java.util.*;

public class Ordenacao {
    public static void main(String[] args) {

        System.out.println("--\tOrdem aleatoria\t");
        Set<Serie> series = new HashSet<>() {{
            add(new Serie("Alice in Borderland", "Fantasia", 50));
            add(new Serie("Peaky Blinders", "Drama", 45));
            add(new Serie("Andor", "Aventura", 30));
            add(new Serie("Mandalorian", "Comedia", 30));
        }};
        for (Serie serie : series)
            System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " +
                    serie.getTempoEpisodio());


        System.out.println("\n--\tOrdem Inserção\t");
        Set<Serie> series2 = new LinkedHashSet<>() {{
            add(new Serie("Alice in Borderland", "Fantasia", 50));
            add(new Serie("Peaky Blinders", "Drama", 45));
            add(new Serie("Andor", "Aventura", 30));
            add(new Serie("Mandalorian", "Comedia", 37));
        }};
        for (Serie serie : series2)
            System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " +
                    serie.getTempoEpisodio());


        System.out.println("\n--\tOrdem Natural\t--");
        Set<Serie> series3 = new TreeSet<>(series2);
        for (Serie serie: series3)  System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " +
                serie.getTempoEpisodio());

        System.out.println("\n--\tOrdem Nome/Genero/Numero\t--");
        Set<Serie> minhaSerie = new TreeSet<>(new ComparatorNomeGeneroTempo());
        minhaSerie.addAll(series);

        for (Serie serie : minhaSerie) System.out.println(serie.getNome() + " - " +
                serie.getGenero() + " - " + serie.getTempoEpisodio());



    }

    static class Serie implements Comparable<Serie> {
        private String nome;
        private String genero;
        private Integer tempoEpisodio;

        public Serie(String nome, String genero, Integer tempoEpisodio) {
            this.nome = nome;
            this.genero = genero;
            this.tempoEpisodio = tempoEpisodio;
        }

        public String getNome() {
            return nome;
        }

        public String getGenero() {
            return genero;
        }

        public Integer getTempoEpisodio() {
            return tempoEpisodio;
        }

        @Override
        public String toString() {
            return "Serie{" +
                    "nome='" + nome + '\'' +
                    ", genero='" + genero + '\'' +
                    ", tempoEpisodio=" + tempoEpisodio +
                    '}';
        }

        @Override
        public boolean equals(Object o) {

            if (o == null || getClass() != o.getClass()) return false;
            Serie serie = (Serie) o;
            return Objects.equals(nome, serie.nome) && Objects.equals(genero, serie.genero) && Objects.equals(tempoEpisodio, serie.tempoEpisodio);
        }

        @Override
        public int hashCode() {
            return Objects.hash(nome, genero, tempoEpisodio);
        }

        @Override
        public int compareTo(Serie serie) {
            int tempoEpisodio = Integer.compare(this.getTempoEpisodio(), serie.getTempoEpisodio());

            if (tempoEpisodio != 0) return tempoEpisodio;

            return this.getGenero().compareTo(serie.getGenero());
        }
    }

    static class ComparatorNomeGeneroTempo implements Comparator<Serie>{

        @Override
        public int compare(Serie s1, Serie s2) {
            int nome = s1.getNome().compareTo(s2.getNome());
            if (nome != 0) return nome;

            int genero = s1.getGenero().compareTo(s2.getGenero());
            if (genero != 0) return genero;

            return Integer.compare(s1.getTempoEpisodio(), s2.getTempoEpisodio());


        }
    }

}
