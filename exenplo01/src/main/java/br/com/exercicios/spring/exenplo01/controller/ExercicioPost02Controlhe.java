package br.com.exercicios.spring.exenplo01.controller;

import br.com.exercicios.spring.exenplo01.entity.Avaliacao;
import br.com.exercicios.spring.exenplo01.entity.CadastroAluno;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/notas")
public class ExercicioPost02Controlhe {
    @PostMapping("anota")
    public Avaliacao Avaliacao(@RequestBody Avaliacao Avaliacao){
        return Avaliacao;
    }
}
