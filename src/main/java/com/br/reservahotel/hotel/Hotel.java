package com.br.reservahotel.hotel;

import com.br.reservahotel.model.Entidade;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.validation.constraints.NotNull;

@Entity
public class Hotel implements Entidade {

    @Id
    @GeneratedValue
    @PrimaryKeyJoinColumn
    private Long id;

    @NotNull
    private String nome;

    @NotNull
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

    @Override
    public boolean isValid() {
        return (nome != null && endereco != null);
    }
}
