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
public class Chave {

    protected String gold, jas, dovale, land, local;
    protected int quantidade;

    public Chave(String gold, String jas, String dovale, String land, String local, int quantidade) {
        this.gold = gold;
        this.jas = jas;
        this.dovale = dovale;
        this.land = land;
        this.quantidade = quantidade;
        this.local = local;
    }

    public String getGold() {
        return gold;
    }

    public void setGold(String gold) {
        this.gold = gold;
    }

    public String getJas() {
        return jas;
    }

    public void setJas(String jas) {
        this.jas = jas;
    }

    public String getDovale() {
        return dovale;
    }

    public void setDovale(String dovale) {
        this.dovale = dovale;
    }

    public String getLand() {
        return land;
    }

    public void setLand(String land) {
        this.land = land;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    @Override
    public String toString() {
        return "Chave -> " + "gold :" + gold + ", jas :" + jas + ", dovale :" + dovale + ", land :" + land + ", quantidade :" + quantidade + " , local : " + local + "\n";
    }
    
    String toCSV() {
        
        return gold + ";" + jas + ";" + dovale + ";" + land + ";" + quantidade + ";" + local;

    }

}
