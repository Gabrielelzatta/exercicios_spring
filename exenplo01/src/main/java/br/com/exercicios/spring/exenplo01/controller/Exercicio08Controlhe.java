package br.com.exercicios.spring.exenplo01.controller;

import br.com.exercicios.spring.exenplo01.service.Exercicio08Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/exercicio08")
public class Exercicio08Controlhe {
    @Autowired
    Exercicio08Service exercicio08Service;
    @GetMapping("medio")
    public String converterHorasParaMinutos(@RequestParam Double horas){
        return ""+exercicio08Service.converterHorasParaMinutos(horas);
    }
}
