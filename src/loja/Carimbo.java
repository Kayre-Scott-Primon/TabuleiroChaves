/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loja;

/**
 *
 * @author Usuário
 */
public class Carimbo {

    protected String modelo,marca,tamanho;
    protected int quantidade  ;

    public Carimbo(String modelo,String marca,String tamanho, int quantidade) {
        this.modelo = modelo;
        this.quantidade = quantidade;
        this.tamanho=tamanho;
        this.marca=marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }
    

    @Override
    public String toString() {
        return "Carimbo{ " + "modelo: " + modelo +" , Tamanho :"+tamanho+ ", quantidade: " + quantidade + " }";
    }
    
    String toCSV(){
    
        return modelo + ";" + marca + ";" + tamanho + ";" + quantidade;
    
    }

}
