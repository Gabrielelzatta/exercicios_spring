package br.com.exercicios.spring.exenplo01.controller;

import br.com.exercicios.spring.exenplo01.service.Exercicio05Service;
import br.com.exercicios.spring.exenplo01.service.Exercicio06Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/exercicio06")
public class Exercicio06Controlhe {
    @Autowired
    Exercicio06Service exercicio06Service;

    @GetMapping("medio")
    public String calcularMedia(@RequestParam double nota1,@RequestParam double nota2){
        return ""+exercicio06Service.calcularMedia(nota1,nota2);
    }
}
