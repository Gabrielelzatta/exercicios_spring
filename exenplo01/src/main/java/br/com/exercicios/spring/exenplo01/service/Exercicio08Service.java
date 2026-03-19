package br.com.exercicios.spring.exenplo01.service;

import org.springframework.stereotype.Service;

@Service
public class Exercicio08Service {

    public double converterHorasParaMinutos(double horas) {
        return horas * 60;
    }
}
