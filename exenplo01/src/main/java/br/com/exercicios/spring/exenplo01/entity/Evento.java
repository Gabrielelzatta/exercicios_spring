package br.com.exercicios.spring.exenplo01.entity;

public class Evento {
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getLoca() {
        return loca;
    }

    public void setLoca(String loca) {
        this.loca = loca;
    }

    public Evento(String nome, String data, String loca) {
        this.nome = nome;
        this.data = data;
        this.loca = loca;
    }

    private String data;
    private String loca;
}
