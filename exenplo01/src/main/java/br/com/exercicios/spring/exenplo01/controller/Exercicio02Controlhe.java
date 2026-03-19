package br.com.exercicios.spring.exenplo01.controller;

import br.com.exercicios.spring.exenplo01.service.Exercicio02Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/exercicio02")
public class Exercicio02Controlhe {

    @Autowired
    Exercicio02Service exercicio02Service;

    @GetMapping("romanoDecimal")
    public String romanoParaDecimal(@RequestParam String romano){
        return ""+exercicio02Service.romanoParaDecimal(romano);
    }
}
