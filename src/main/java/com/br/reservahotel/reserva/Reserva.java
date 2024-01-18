package com.br.reservahotel.reserva;

import com.br.reservahotel.hotel.Hotel;
import com.br.reservahotel.quarto.Quarto;
import com.br.reservahotel.usuario.Usuario;
import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Reserva {

    @Id
    @GeneratedValue
    private Long id;

    private Integer status;

    private Date checkIn;
    private Date checkOut;

    @ManyToOne
    @JoinColumn(name = "id_quarto")
    private Quarto quarto;

    @ManyToOne
    @JoinColumn(name = "id_usuario")
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

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getCheckIn() {
        return checkIn;
    }

    public void setCheckIn(Date checkIn) {
        this.checkIn = checkIn;
    }

    public Date getCheckOut() {
        return checkOut;
    }

    public void setCheckOut(Date checkOut) {
        this.checkOut = checkOut;
    }

    public Quarto getQuarto() {
        return quarto;
    }

    public void setQuarto(Quarto quarto) {
        this.quarto = quarto;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
