package br.com.exercicios.spring.exenplo01.controller;

import br.com.exercicios.spring.exenplo01.entity.CadastroAluno;
import br.com.exercicios.spring.exenplo01.entity.Produto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/cadastro")
public class ExercicioPost01Controlhe {
    @PostMapping("CadastroAluno")
    public CadastroAluno CadastroAluno(@RequestBody CadastroAluno CadastroAluno){
        return CadastroAluno;
    }
}
