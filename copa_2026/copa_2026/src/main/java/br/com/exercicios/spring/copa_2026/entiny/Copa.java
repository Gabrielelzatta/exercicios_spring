package br.com.exercicios.spring.copa_2026.entiny;

import br.com.exercicios.spring.copa_2026.entiny.enuns.Status;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Copa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer ano;
    private String local;
    private Integer quantidadeDeSelecoes;
    private Integer dureacao;
    private LocalDate dataInicio;
    private LocalDate dataFin;
    @Enumerated(EnumType.STRING)
    private Status status;
}
