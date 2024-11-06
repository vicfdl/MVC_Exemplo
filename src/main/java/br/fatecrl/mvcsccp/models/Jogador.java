package br.fatecrl.mvcsccp.models;

public class Jogador {
    private String nome;
    private String numero;
    private String posicao;
    private int golsTemp;
    
    public Jogador(String nome, String numero, String posicao, int golsTemp) {
        this.nome = nome;
        this.numero = numero;
        this.posicao = posicao;
        this.golsTemp = golsTemp;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    public int getGolsTemp() {
        return golsTemp;
    }

    public void setGolsTemp(int golsTemp) {
        this.golsTemp = golsTemp;
    }

}
