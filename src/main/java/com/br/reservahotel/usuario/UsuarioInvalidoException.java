package com.br.reservahotel.usuario;

public class UsuarioInvalidoException extends RuntimeException{
    UsuarioInvalidoException(){
        super("Usuário não é valido");
    }
}
