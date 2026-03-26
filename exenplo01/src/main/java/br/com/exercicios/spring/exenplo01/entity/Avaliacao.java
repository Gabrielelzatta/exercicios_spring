package br.com.exercicios.spring.exenplo01.entity;

public class Avaliacao {
    private String nome;
    private String disciplina;
    private double nota;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }




    public Avaliacao(String nome, String disciplina, double nota, String nomeAluno) {
        this.nome = nome;
        this.disciplina = disciplina;
        this.nota = nota;

    }
}
