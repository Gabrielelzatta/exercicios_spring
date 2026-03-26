package br.com.exercicios.spring.exenplo01.entity;

public class EventoMensagem {
    private String destinatario;
    private String remetente;

    public String getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }

    public String getRemetente() {
        return remetente;
    }

    public void setRemetente(String remetente) {
        this.remetente = remetente;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public EventoMensagem(String destinatario, String remetente, String conteudo) {
        this.destinatario = destinatario;
        this.remetente = remetente;
        this.conteudo = conteudo;
    }

    private String conteudo;
}
