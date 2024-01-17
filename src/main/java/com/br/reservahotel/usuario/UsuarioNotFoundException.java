package com.br.reservahotel.usuario;

public class UsuarioNotFoundException extends RuntimeException {

    UsuarioNotFoundException(Long id) {
        super("Could not find hotel " + id);
    }
}
