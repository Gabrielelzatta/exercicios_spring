package br.com.exercicios.spring.copa_2026.service;

import br.com.exercicios.spring.copa_2026.entiny.Copa;
import br.com.exercicios.spring.copa_2026.repository.CopaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CopaService {

    @Autowired
    private CopaRepositorio copaRepositorio;
    public Copa salvarCopa (Copa copa){
        Optional <Copa> copaSalvaPorAno = copaRepositorio.findByAno(copa.getAno());
        if(copaSalvaPorAno.isPresent()){
            throw new RuntimeException("ja existe uma copa nesse ano");
        }
        if(copa.getAno() % 4 != 2){
            throw new RuntimeException("o ano da copa não e valido");
        }
        return copaRepositorio.save(copa);
    }
    public List<Copa>buscarTodasAsCopas(){

        return copaRepositorio.findAll();
    }
    public String deletarCopa(long id){
        Optional<Copa> copa = copaRepositorio.findById(id);
        if (copa.isPresent()){
            copaRepositorio.deleteById(id);
            return "copa deletada com sucesso?";
        }else {
            return "copa não encontrada com esse ID: "+id;
        }
    }
    public Copa editarCopa(Long id, Copa copaAtualizada){
        Optional<Copa> copa = copaRepositorio.findById(id);
        if(copa.isPresent()){
            Copa copaExistente=copa.get();
            copaExistente.setLocal(copaAtualizada.getLocal() != null ?
                    copaAtualizada.getLocal() : copaExistente.getLocal());

            copaExistente.setDataInicio(copaAtualizada.getDataInicio() != null ?
                    copaAtualizada.getDataInicio() : copaExistente.getDataInicio());

            copaExistente.setDataFin(copaAtualizada.getDataFin() != null ?
                    copaAtualizada.getDataFin() : copaExistente.getDataFin());

            copaExistente.setDureacao(copaAtualizada.getDureacao() != null ?
                    copaAtualizada.getDureacao() : copaExistente.getDureacao());

            copaExistente.setQuantidadeDeSelecoes(copaAtualizada.getQuantidadeDeSelecoes() != null ?
                    copaAtualizada.getQuantidadeDeSelecoes() : copaExistente.getQuantidadeDeSelecoes());
            return copaRepositorio.save(copaExistente);
        }else{
            throw new RuntimeException("copa não encontrada para o ID " +id);
        }
    }
}
