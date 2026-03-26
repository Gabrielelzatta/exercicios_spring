package br.com.exercicios.spring.exenplo01.controller;

import br.com.exercicios.spring.exenplo01.entity.Emprestimo;
import br.com.exercicios.spring.exenplo01.entity.Equipamento;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/emprestimo")
public class ExercicioPost06Controlhe {
    @RequestMapping("sobre")
    public Emprestimo Emprestimo(@RequestBody Emprestimo Emprestimo){
        return Emprestimo;
    }

}
