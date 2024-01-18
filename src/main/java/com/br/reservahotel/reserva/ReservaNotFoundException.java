package com.br.reservahotel.reserva;

public class ReservaNotFoundException extends RuntimeException {

    ReservaNotFoundException(Long id) {
        super("Could not find hotel " + id);
    }
}
