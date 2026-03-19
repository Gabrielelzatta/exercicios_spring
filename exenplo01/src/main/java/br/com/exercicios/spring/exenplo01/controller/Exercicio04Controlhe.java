package br.com.exercicios.spring.exenplo01.controller;

import br.com.exercicios.spring.exenplo01.service.Exercicio03Service;
import br.com.exercicios.spring.exenplo01.service.Exercicio04Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/exercicio04")
public class Exercicio04Controlhe {

    @Autowired
    Exercicio04Service exercicio04Service;

    @GetMapping("palindromo")
    public String verificarPalindromo(@RequestParam String palavra){
        return exercicio04Service.verificarPalindromo(palavra)?
                "a palavra e um palindromo":
                "a palavra nao e um palindromo";
    }

}
