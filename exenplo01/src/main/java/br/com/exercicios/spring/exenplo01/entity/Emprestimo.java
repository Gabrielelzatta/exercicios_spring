package br.com.exercicios.spring.exenplo01.entity;

import java.time.LocalDate;

public class Emprestimo {
    private String nome;
    private String usuário;
    private String item_Emprestado;
    private LocalDate data;

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public String getItem_Emprestado() {
        return item_Emprestado;
    }

    public void setItem_Emprestado(String item_Emprestado) {
        this.item_Emprestado = item_Emprestado;
    }

    public String getUsuário() {
        return usuário;
    }

    public void setUsuário(String usuário) {
        this.usuário = usuário;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Emprestimo(String nome, String usuário, String item_Emprestado, LocalDate data) {
        this.nome = nome;
        this.usuário = usuário;
        this.item_Emprestado = item_Emprestado;
        this.data = data;
    }
}
