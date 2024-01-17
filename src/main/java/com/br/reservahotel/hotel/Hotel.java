package com.br.reservahotel.hotel;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Hotel {

    @Id
    @GeneratedValue
    private Long id;

    private String nome;

    private String endereco;

    public Hotel() {

    }

    public Hotel(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}
