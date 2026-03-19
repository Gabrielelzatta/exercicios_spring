package br.com.exercicios.spring.exenplo01.service;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Service
public class Exercicio07Service {
    @GetMapping("/primo/{n}")
    public String verificarPrimo(@PathVariable int numero) {
        if (isPrimo(numero)) {
            return numero + " é um número primo.";
        } else {
            return numero + " não é um número primo.";
        }
    }

    private boolean isPrimo(int numero) {
        if (numero <= 1) return false;
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) return false;
        }
        return true;
    }
}
