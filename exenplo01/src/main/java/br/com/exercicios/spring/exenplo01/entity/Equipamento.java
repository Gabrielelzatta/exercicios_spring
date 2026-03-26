package br.com.exercicios.spring.exenplo01.entity;

public class Equipamento {
    private String nome;
    private String descrição;
    private int número;
    private String patrimônio;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescrição() {
        return descrição;
    }

    public void setDescrição(String descrição) {
        this.descrição = descrição;
    }

    public int getNúmero() {
        return número;
    }

    public void setNúmero(int número) {
        this.número = número;
    }

    public String getPatrimônio() {
        return patrimônio;
    }

    public void setPatrimônio(String patrimônio) {
        this.patrimônio = patrimônio;
    }

    public Equipamento(String nome, String descrição, int número, String patrimônio) {
        this.nome = nome;
        this.descrição = descrição;
        this.número = número;
        this.patrimônio = patrimônio;
    }
}
