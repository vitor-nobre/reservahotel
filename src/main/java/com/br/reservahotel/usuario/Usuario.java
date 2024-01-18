package com.br.reservahotel.usuario;

import com.br.reservahotel.model.Entidade;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

@Entity
public class Usuario implements Entidade {

    @Id
    @GeneratedValue
    @PrimaryKeyJoinColumn
    private Long id;

    private String nome;

    private String email;

    private Integer telefone;

    public Usuario() {

    }

    public Usuario(String nome) {
        this.nome = nome;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getTelefone() {
        return telefone;
    }

    public void setTelefone(Integer telefone) {
        this.telefone = telefone;
    }

    public boolean isValid() {
        return (this != null && nome != null && email != null && telefone != null);
    }
}
