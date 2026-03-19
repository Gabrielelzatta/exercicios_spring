package br.com.exercicios.spring.exenplo01.service;

import org.springframework.stereotype.Service;

    @Service
public class Exercicio01Service {
    public String converteBinario (String binario){
        int decimal = Integer.parseInt(binario, 2);
        return decimal+";";
    }
}
