package br.com.exercicios.spring.exenplo01.controller;

import br.com.exercicios.spring.exenplo01.service.Exercicio06Service;
import br.com.exercicios.spring.exenplo01.service.Exercicio07Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/exercicio07")
public class Exercicio07Controlhe {
    @Autowired
    Exercicio07Service exercicio07Service;
    @GetMapping("medio")
    public String verificarPrimo(@RequestParam int numero){
        return ""+exercicio07Service.verificarPrimo(numero);
    }
}
