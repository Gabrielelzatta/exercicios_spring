package br.com.exercicios.spring.copa_2026.repository;

import br.com.exercicios.spring.copa_2026.entiny.Copa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CopaRepositorio extends JpaRepository<Copa, Long> {

    Optional<Copa> findByAno(Integer ano);
}
