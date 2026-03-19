package br.com.exercicios.spring.exenplo01.controller;

import br.com.exercicios.spring.exenplo01.service.Exercicio03Service;
import br.com.exercicios.spring.exenplo01.service.Exercicio05Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/exercicio05")
public class Exercicio05Controlhe {
    @Autowired
    Exercicio05Service exercicio05Service;

    @GetMapping("tenperatura")
    public String celsiusParaFahrenheit(@RequestParam double celsius){
        return ""+exercicio05Service.celsiusParaFahrenheit(celsius);
    }
}
