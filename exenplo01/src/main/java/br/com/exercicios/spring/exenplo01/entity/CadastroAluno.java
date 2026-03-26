package br.com.exercicios.spring.exenplo01.entity;

public class CadastroAluno {
    private String nome;
    private String turma;
    private int idade;
    private String nacimento;

    public CadastroAluno() {
    }

    public CadastroAluno(String nome, String turma, int idade, String nacimento) {
        this.nome = nome;
        this.turma = turma;
        this.idade = idade;
        this.nacimento = nacimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNacimento() {
        return nacimento;
    }

    public void setNacimento(String nacimento) {
        this.nacimento = nacimento;
    }
}
