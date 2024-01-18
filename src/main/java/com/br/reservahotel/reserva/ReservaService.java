package com.br.reservahotel.reserva;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReservaService {
    private final ReservaRepository repository;

    public ReservaService(ReservaRepository repository) {
        this.repository = repository;
    }

    public List<Reserva> findAll() {
        return repository.findAll();
    }

    protected Reserva create(Reserva reserva) {
        return repository.save(reserva);
    }

    protected Reserva one(Long id) {
        return repository.findById(id).orElseThrow(() -> new ReservaNotFoundException(id));
    }

    protected Reserva update(Reserva reserva, Long id) {
        return repository.findById(id)
                .map(reservaDb -> {
                    reservaDb.setCheckIn(reserva.getCheckIn());
                    reservaDb.setCheckOut(reserva.getCheckOut());
                    reservaDb.setQuarto(reserva.getQuarto());
                    reservaDb.setUsuario(reserva.getUsuario());
                    reservaDb.setStatus(reserva.getStatus());
                    return repository.save(reservaDb);
                })
                .orElseGet(() -> {
                    reserva.setId(id);
                    return repository.save(reserva);
                });
    }

    protected void delete(Long id) {
        repository.deleteById(id);
    }
}
