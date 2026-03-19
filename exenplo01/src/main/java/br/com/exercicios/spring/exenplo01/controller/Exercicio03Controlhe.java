package br.com.exercicios.spring.exenplo01.controller;

import br.com.exercicios.spring.exenplo01.service.Exercicio02Service;
import br.com.exercicios.spring.exenplo01.service.Exercicio03Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/exercicio03")
public class Exercicio03Controlhe {
    @Autowired
    Exercicio03Service exercicio03Service;

    @GetMapping("fatorial")
    public String calcularFatorial(@RequestParam int numero){
        return ""+exercicio03Service.calcularFatorial(numero);
    }

}
