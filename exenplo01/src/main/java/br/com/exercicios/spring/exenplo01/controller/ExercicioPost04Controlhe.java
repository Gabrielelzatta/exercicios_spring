package br.com.exercicios.spring.exenplo01.controller;

import br.com.exercicios.spring.exenplo01.entity.Evento;
import br.com.exercicios.spring.exenplo01.entity.EventoMensagem;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/evento")
public class ExercicioPost04Controlhe {
 @RequestMapping("mensagem")
 public EventoMensagem EventoMensagem(@RequestBody EventoMensagem EventoMensagem){
     return EventoMensagem;
 }
}
