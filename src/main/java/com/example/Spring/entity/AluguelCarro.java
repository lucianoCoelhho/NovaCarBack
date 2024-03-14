package com.example.Spring.entity;

//import java.util.*;
import jakarta.persistence.*;

@Entity
@Table(name = "aluguel")
public class AluguelCarro {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long Id;

    private String image;
    private String name;
    private String descricaoCurta;
    private String descricaoDetalhada;
    private double valorAluguel;

    public long getId() {
        return this.Id;
    }

    public void setId(long Id) {
        this.Id = Id;
    }

    public String getImage() {
        return this.image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescricaoCurta() {
        return this.descricaoCurta;
    }

    public void setDescricaoCurta(String descricaoCurta) {
        this.descricaoCurta = descricaoCurta;
    }

    public String getDescricaoDetalhada() {
        return this.descricaoDetalhada;
    }

    public void setDescricaoDetalhada(String descricaoDetalhada) {
        this.descricaoDetalhada = descricaoDetalhada;
    }

    public double getValorAluguel() {
        return this.valorAluguel;
    }

    public void setValorAluguel(double valorAluguel) {
        this.valorAluguel = valorAluguel;
    }


}
