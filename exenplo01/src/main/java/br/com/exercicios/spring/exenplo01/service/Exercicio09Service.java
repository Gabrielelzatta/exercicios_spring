package br.com.exercicios.spring.exenplo01.service;

import org.springframework.stereotype.Service;

@Service
public class Exercicio09Service {

    public double calcularAreaTriangulo(double base, double altura) {
        return (base * altura) / 2;
    }
}
