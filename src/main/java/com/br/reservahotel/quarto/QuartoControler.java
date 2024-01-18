package com.br.reservahotel.quarto;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/quarto")
public class QuartoControler {

    private final QuartoService service;

    QuartoControler(QuartoService service) {
        this.service = service;
    }

    @PostMapping
    public void create(@RequestBody Quarto quarto) {
        this.service.create(quarto);
    }

    @GetMapping
    public List<Quarto> list() {
        return this.service.findAll();
    }

    @GetMapping("/{id}")
    public Quarto findOne(@PathVariable Long id) {
        return this.service.one(id);
    }

    @PutMapping("/{id}")
    public Quarto update(@RequestBody Quarto quarto, @PathVariable Long id) {
        return this.service.update(quarto, id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        this.service.delete(id);
    }
}
