package br.com.exercicios.spring.copa_2026.controlhe;

import br.com.exercicios.spring.copa_2026.entiny.Copa;
import br.com.exercicios.spring.copa_2026.service.CopaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

@RestController
@RequestMapping("api/copa")
public class copaControlhe {

    @Autowired
    private CopaService copaService;
    @PostMapping
    public Copa cadasrarCopa(@RequestBody Copa copa){

        return copaService.salvarCopa(copa);
    }

    @GetMapping()
    public List<Copa>buscarTodasAsCopas(){

        return copaService.buscarTodasAsCopas();
    }
    @DeleteMapping()
    public String deletarCopa (@RequestParam Long id){
        return copaService.deletarCopa(id);
        // ?id=1
    }
    @PutMapping("troca")
    public Copa editarCopa(@RequestParam Long id, @RequestBody Copa copaAtualizada){
        return copaService.editarCopa(id, copaAtualizada);
    }
}

