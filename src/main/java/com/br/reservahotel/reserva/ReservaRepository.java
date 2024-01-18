package com.br.reservahotel.reserva;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Date;

public interface ReservaRepository extends JpaRepository<Reserva, Long> {

    @Query("select r from Reserva r where r.quarto.id = :quarto " +
            "and (r.checkIn between :checkIn and :checkOut) " +
            "and (r.checkOut between :checkIn and :checkOut) and r.status <> 1 ")
    Reserva verificaDisponibilidade(@Param("quarto") Long idQuarto, @Param("checkIn") Date checkIn, @Param("checkOut")Date checkOut);
}
