package com.br.reservahotel.usuario;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Usuario")
public class UsuarioControler {

    private UsuarioService service;

    UsuarioControler(UsuarioService service) {
        this.service = service;
    }

    @PostMapping
    public void create(@RequestBody Usuario usuario) {
        this.service.create(usuario);
    }

    @GetMapping
    public List<Usuario> list() {
        return this.service.findAll();
    }

    @GetMapping("/{id}")
    public Usuario findOne(@PathVariable Long id) {
        return this.service.one(id);
    }

    @PutMapping("/{id}")
    public Usuario update(@RequestBody Usuario usuario, @PathVariable Long id) {
        return this.service.update(usuario, id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        this.service.delete(id);
    }
}
