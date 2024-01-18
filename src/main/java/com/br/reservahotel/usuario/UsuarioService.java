package com.br.reservahotel.usuario;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {
    private final UsuarioRepository repository;

    public UsuarioService(UsuarioRepository repository) {
        this.repository = repository;
    }

    protected List<Usuario> findAll() {
        return repository.findAll();
    }

    protected Usuario create(Usuario usuario) {
        return repository.save(usuario);
    }

    protected Usuario one(Long id) {
        return repository.findById(id).orElseThrow(() -> new UsuarioNotFoundException(id));
    }

    protected Usuario update(Usuario usuario, Long id) {
        return repository.findById(id)
                .map(usuarioDb -> {
                    usuarioDb.setNome(usuario.getNome());
                    usuarioDb.setEmail(usuario.getEmail());
                    usuarioDb.setTelefone(usuario.getTelefone());
                    return repository.save(usuarioDb);
                })
                .orElseGet(() -> {
                    usuario.setId(id);
                    return repository.save(usuario);
                });
    }

    protected void delete(Long id) {
        repository.deleteById(id);
    }
}
