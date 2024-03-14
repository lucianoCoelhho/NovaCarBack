package com.example.Spring.service;

import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Spring.entity.AluguelCarro;
import com.example.Spring.repository.AluguelCarroRepository;

@Service
public class AluguelCarroService {
    
    @Autowired
    private AluguelCarroRepository aluguelCarroRepository;

    public List<AluguelCarro> buscar(){
        return aluguelCarroRepository.findAll();
    }

    public AluguelCarro inserir(AluguelCarro aluguelCarro){
        AluguelCarro aluguelCarroNovo = aluguelCarroRepository.saveAndFlush(aluguelCarro);
        return aluguelCarroNovo;
    }

    public AluguelCarro alterar(AluguelCarro aluguelCarro){
        aluguelCarroRepository.findById(aluguelCarro.getId()).orElse(null);
        return null;
    }
    
    public void delete(long id){
        AluguelCarro aluguelCarro = aluguelCarroRepository.findById(id).get();
        aluguelCarroRepository.delete(aluguelCarro);
    }

}

