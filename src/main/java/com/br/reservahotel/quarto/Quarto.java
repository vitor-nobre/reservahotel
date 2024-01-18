package com.br.reservahotel.quarto;

import com.br.reservahotel.hotel.Hotel;
import com.br.reservahotel.model.Entidade;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

@Entity
public class Quarto implements Entidade {

    @Id
    @GeneratedValue
    @PrimaryKeyJoinColumn
    private Long id;

    private String nome;

    private String endereco;

    @NotNull
    private String tipoQuarto;

    @ManyToOne
    @NotNull
    private Hotel hotel;

    public Quarto() {

    }

    public Quarto(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }

    public Long getId() {
        return id;
    }

    protected void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    protected void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    protected void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }

    public String getTipoQuarto() {
        return tipoQuarto;
    }

    public void setTipoQuarto(String tipoQuarto) {
        this.tipoQuarto = tipoQuarto;
    }

    @Override
    public boolean isValid() {
        return (tipoQuarto != null && nome != null);
    }
}
