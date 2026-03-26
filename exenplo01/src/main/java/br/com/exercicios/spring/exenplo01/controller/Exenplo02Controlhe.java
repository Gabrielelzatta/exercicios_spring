package br.com.exercicios.spring.exenplo01.controller;

import br.com.exercicios.spring.exenplo01.entity.Produto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/exenplo02")
public class Exenplo02Controlhe {
    @PostMapping("produto")
    public Produto cadastrarProduto(@RequestBody Produto produto){
        return produto;
    }
}
