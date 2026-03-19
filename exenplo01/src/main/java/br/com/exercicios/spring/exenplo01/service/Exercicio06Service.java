package br.com.exercicios.spring.exenplo01.service;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Exercicio06Service {
    public double calcularMedia(Double nota1,Double nota2) {


        return (nota1 +nota2) / 2;
    }
}
