package com.vinicius.exception.checked;

import javax.swing.*;
import java.io.*;

public class CheckedException {
    public static void main(String[] args) {
        String nomeArquivo = "animes.txt";
        try {
            imprimirArquivo(nomeArquivo);
        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Revise o nome do arquivo que voce deseja enviar " + e.getCause());
            e.printStackTrace();

        } catch (IOException e) {
            JOptionPane.showMessageDialog(null,
                    "Ocorreu um erro ineperado entre em contato com o suporte " + e.getCause());
            e.printStackTrace();
        } finally {
            System.out.println("Chegou no finally");
        }

        System.out.println("Apesar da exception ou nao continua...");

    }

    public static void imprimirArquivo(String nomeArquivo) throws IOException {
        File file = new File(nomeArquivo);

        BufferedReader br = new BufferedReader(new FileReader(file.getName()));
        String line = br.readLine();

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        do {
            bw.write(line);
            bw.newLine();
            line = br.readLine();
        } while (line != null);
        bw.flush();
        br.close();
    }
}
