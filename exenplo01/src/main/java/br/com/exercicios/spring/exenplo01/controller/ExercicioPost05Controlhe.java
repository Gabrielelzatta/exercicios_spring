package br.com.exercicios.spring.exenplo01.controller;

import br.com.exercicios.spring.exenplo01.entity.Equipamento;
import br.com.exercicios.spring.exenplo01.entity.EventoMensagem;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("api/equipamentos")
public class ExercicioPost05Controlhe {
        @RequestMapping("fala")
        public Equipamento Equipamento(@RequestBody Equipamento Equipamento){
            return Equipamento;
        }

}
