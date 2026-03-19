package br.com.exercicios.spring.exenplo01.controller;

import br.com.exercicios.spring.exenplo01.service.Exercicio09Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/exercicio09")
public class Exercicio09Controlhe {
    @Autowired
    Exercicio09Service exercicio09Service;
    @GetMapping("triangolho")
    public String calcularAreaTriangulo(@RequestParam Double base ,@RequestParam Double altura){
        return ""+exercicio09Service.calcularAreaTriangulo(base , altura);
    }
}
