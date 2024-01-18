package com.br.reservahotel.usuario;

public class UsuarioNotFoundException extends RuntimeException {

    UsuarioNotFoundException(Long id) {
        super("Could not find usuário " + id);
    }

    UsuarioNotFoundException() {
        super("Could not find usuário ");
    }
}
