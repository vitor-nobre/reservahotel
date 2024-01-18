package com.br.reservahotel.reserva;

import com.br.reservahotel.model.Entidade;
import com.br.reservahotel.quarto.Quarto;
import com.br.reservahotel.usuario.Usuario;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

import java.util.Date;

@Entity
public class Reserva implements Entidade {

    @Id
    @GeneratedValue
    private Long id;

    @NotNull
    private Integer status;

    @NotNull
    private Date checkIn;

    @NotNull
    private Date checkOut;

    @ManyToOne
    @JoinColumn
    @NotNull
    private Quarto quarto;

    @ManyToOne
    @JoinColumn
    @NotNull
    private Usuario usuario;

    public Reserva() {
    }

    public Long getId() {
        return id;
    }

    protected void setId(Long id) {
        this.id = id;
    }

    public Integer getStatus() {
        return status;
    }

    protected void setStatus(Integer status) {
        this.status = status;
    }

    public Date getCheckIn() {
        return checkIn;
    }

    protected void setCheckIn(Date checkIn) {
        this.checkIn = checkIn;
    }

    public Date getCheckOut() {
        return checkOut;
    }

    protected void setCheckOut(Date checkOut) {
        this.checkOut = checkOut;
    }

    public Quarto getQuarto() {
        return quarto;
    }

    protected void setQuarto(Quarto quarto) {
        this.quarto = quarto;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    protected void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    @Override
    public boolean isValid() {
        return (this != null && checkIn != null && checkOut != null && status != null && usuario.isValid() && quarto.isValid());
    }
}
