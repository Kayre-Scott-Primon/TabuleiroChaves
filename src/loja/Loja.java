/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loja;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Scanner;
import javax.swing.JFrame;

/**
 *
 * @author Usuário
 */
public class Loja {

    static CadastroCh addCh = new CadastroCh();
    static ArrayList<Chave> chaves = new ArrayList();
    static ArrayList<Carimbo> carimbos = new ArrayList();
    static AddCarimbo addCar = new AddCarimbo();

    public static void importarCSVChave(String nomeArq) {
        try {
            Scanner scanner = new Scanner(new File(nomeArq)); //lê arquivo externo
            while (scanner.hasNext()) {
                try {
                    String linha = (scanner.nextLine());
                    String[] vetor = linha.split(";");
                    Chave c = new Chave(vetor[0], vetor[1], vetor[2], vetor[3], vetor[4], Integer.parseInt(vetor[5]));
                    chaves.add(c);
                } catch (NoSuchElementException excecaoElemento) { //trata erro
                    System.err.println("Arquivo com formato incorreto");
                    scanner.close();
                    System.exit(1);
                }
            }
        } catch (FileNotFoundException e) { //trata erro
            System.err.println("Arquivo não encontrado");

        }
    }

    public static void importarCSVCarimbo(String nomeArq) {
        try {
            Scanner scanner = new Scanner(new File(nomeArq)); //lê arquivo externo
            while (scanner.hasNext()) {
                try {
                    String linha = (scanner.nextLine());
                    String[] vetor = linha.split(";");
                    Carimbo c = new Carimbo(vetor[0], vetor[1], vetor[2], Integer.parseInt(vetor[3]));
                    carimbos.add(c);
                } catch (NoSuchElementException excecaoElemento) { //trata erro
                    System.err.println("Arquivo com formato incorreto");
                    scanner.close();
                    System.exit(1);
                }
            }
        } catch (FileNotFoundException e) { //trata erro
            System.err.println("Arquivo não encontrado");
        }
    }

    public static void exportarCSVChaves(String nomeArq) {
        try {
            File arquivo = new File(nomeArq);
            arquivo.createNewFile();
            FileWriter fileWriter = new FileWriter(arquivo, false);
            PrintWriter writer = new PrintWriter(fileWriter);
            for (int i = 0; i < chaves.size(); i++) {
                writer.println(chaves.get(i).toCSV());
            }

            writer.flush();
            writer.close();
        } catch (IOException excecaoCriacaoArquivo) {
            System.out.printf("\nExceção: %s\n", excecaoCriacaoArquivo);
        }

    }

    public static void exportarCSVCarimo(String nomeArq) {
        try {
            File arquivo = new File(nomeArq);
            arquivo.createNewFile();
            FileWriter fileWriter = new FileWriter(arquivo, false);
            PrintWriter writer = new PrintWriter(fileWriter);
            for (int i = 0; i < carimbos.size(); i++) {
                writer.println(carimbos.get(i).toCSV());
            }

            writer.flush();
            writer.close();
        } catch (IOException excecaoCriacaoArquivo) {
            System.out.printf("\nExceção: %s\n", excecaoCriacaoArquivo);
        }

    }

    public static void main(String[] args) {
        // TODO code application logic here

        Dialog d = new Dialog();
        d.setVisible(true);

        importarCSVChave("listaChaves.csv");
        importarCSVCarimbo("listaCarimbos.csv");

    }
}
