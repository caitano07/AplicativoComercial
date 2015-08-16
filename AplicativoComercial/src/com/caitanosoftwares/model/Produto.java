package com.caitanosoftwares.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.OneToMany;


@Entity
public class Produto {
    
    @Id
    @GeneratedValue
    int id;
    String descricao;
    @OneToMany
    Marca marca;
    double venda;
    double custo;
    double lucro;
    double margem;
    
    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }
    
    
}
