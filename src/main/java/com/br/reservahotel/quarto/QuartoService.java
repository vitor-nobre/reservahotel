package com.br.reservahotel.quarto;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuartoService {
    private final QuartoRepository repository;

    public QuartoService(QuartoRepository repository) {
        this.repository = repository;
    }

    protected List<Quarto> findAll() {
        return repository.findAll();
    }

    protected Quarto create(Quarto hotel) {
        return repository.save(hotel);
    }

    protected Quarto one(Long id) {
        return repository.findById(id).orElseThrow(() -> new QuartoNotFoundException(id));
    }

    protected Quarto update(Quarto quarto, Long id) {
        return repository.findById(id)
                .map(quartoDb -> {
                    quartoDb.setNome(quarto.getNome());
                    quartoDb.setEndereco(quarto.getEndereco());
                    return repository.save(quartoDb);
                })
                .orElseGet(() -> {
                    quarto.setId(id);
                    return repository.save(quarto);
                });
    }

    protected void delete(Long id) {
        repository.deleteById(id);
    }
}
