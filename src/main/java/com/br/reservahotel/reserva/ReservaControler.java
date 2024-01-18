package com.br.reservahotel.reserva;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/reserva")
public class ReservaControler {

    private final ReservaService service;

    ReservaControler(ReservaService service) {
        this.service = service;
    }

    @PostMapping
    public void create(@RequestBody Reserva reserva) {
        this.service.create(reserva);
    }

    @GetMapping
    public List<Reserva> list() {
        return this.service.findAll();
    }

    @GetMapping("/{id}")
    public Reserva findOne(@PathVariable Long id) {
        return this.service.one(id);
    }

    @PutMapping("/{id}")
    public Reserva update(@RequestBody Reserva reserva, @PathVariable Long id) {
        return this.service.update(reserva, id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        this.service.delete(id);
    }
}
