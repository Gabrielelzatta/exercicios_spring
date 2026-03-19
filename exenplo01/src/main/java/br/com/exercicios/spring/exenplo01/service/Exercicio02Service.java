package br.com.exercicios.spring.exenplo01.service;

import org.springframework.stereotype.Service;

@Service
public class Exercicio02Service {
    public int romanoParaDecimal(String romano) {

        int total = 0;

        for (int i = 0; i < romano.length(); i++) {

            int atual = valor(romano.charAt(i));

            if (i + 1 < romano.length()) {
                int proximo = valor(romano.charAt(i + 1));

                if (atual < proximo) {
                    total -= atual;
                } else {
                    total += atual;
                }

            } else {
                total += atual;
            }
        }

        return total;
    }

    private int valor(char c) {
        switch (c) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
        }
        return 0;
    }
}

