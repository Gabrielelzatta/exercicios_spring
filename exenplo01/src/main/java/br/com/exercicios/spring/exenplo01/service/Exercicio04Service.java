package br.com.exercicios.spring.exenplo01.service;

import org.springframework.stereotype.Service;

@Service
public class Exercicio04Service {
    public boolean verificarPalindromo(String palavra) {

        palavra = palavra.toLowerCase();

        String invertida = new StringBuilder(palavra).reverse().toString();

        return palavra.equals(invertida);
    }
}
