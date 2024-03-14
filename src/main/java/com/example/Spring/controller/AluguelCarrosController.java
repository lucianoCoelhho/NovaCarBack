package com.example.Spring.controller;

import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Spring.entity.AluguelCarro;
import com.example.Spring.service.AluguelCarroService;

@RestController
@RequestMapping("/aluguel")
@CrossOrigin(origins = "*")
public class AluguelCarrosController {
    
    @Autowired
    private AluguelCarroService aluguelCarroService;

    @GetMapping("/get")
    public List<AluguelCarro> buscar(){
        return aluguelCarroService.buscar();
    }

    @PostMapping("/post")
    public AluguelCarro inserir(@RequestBody AluguelCarro aluguelCarro){
        return aluguelCarroService.inserir(aluguelCarro);
    }

    @PutMapping("/put")
    public AluguelCarro alterar(@RequestBody AluguelCarro aluguelCarro){
        return aluguelCarroService.alterar(aluguelCarro);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> delete(@PathVariable("id") long id){
        aluguelCarroService.delete(id);
        return ResponseEntity.ok().build();
    }

}
