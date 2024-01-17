package com.br.reservahotel.quarto;

public class QuartoNotFoundException extends RuntimeException {

    QuartoNotFoundException(Long id) {
        super("Could not find hotel " + id);
    }
}
