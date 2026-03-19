package br.com.exercicios.spring.exenplo01.service;

import org.springframework.stereotype.Service;

@Service
public class Exercicio05Service {
    public double celsiusParaFahrenheit(double celsius) {

        return (celsius * 9 / 5) + 32;

    }
}
