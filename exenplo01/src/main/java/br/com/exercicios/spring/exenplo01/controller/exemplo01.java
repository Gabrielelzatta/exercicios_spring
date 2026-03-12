package br.com.exercicios.spring.exenplo01.controller;


import br.com.exercicios.spring.exenplo01.service.Exenplo01Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/exemplo01")
public class exemplo01 {
    @Autowired
    Exenplo01Service exenplo01Service;
    @GetMapping
    public String getExenplo(){
        return "get:Exemplo01";
    }
   @GetMapping("/soma/{a}/{b}/{c}")
    public String soma(@PathVariable int a,@PathVariable int b,@PathVariable int c){
        return "a soma dos valores informados é "
                + exenplo01Service.soma(a,b,c);
   }
}
