package br.com.exercicios.spring.exenplo01.controller;

import br.com.exercicios.spring.exenplo01.entity.CadastroAluno;
import br.com.exercicios.spring.exenplo01.entity.Evento;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/evento")
public class ExercicioPost03Controlhe {
    @PostMapping("canonico")
    public Evento Evento(@RequestBody Evento Evento){
        return Evento;
    }
}
