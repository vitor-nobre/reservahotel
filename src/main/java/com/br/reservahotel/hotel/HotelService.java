package com.br.reservahotel.hotel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class HotelService {
    private final HotelRepository repository;

    public HotelService(HotelRepository repository) {
        this.repository = repository;
    }

    protected List<Hotel> findAll() {
        return repository.findAll();
    }

    protected Hotel create(Hotel hotel) {
        return repository.save(hotel);
    }

    protected Hotel one(Long id) {
        return repository.findById(id).orElseThrow(() -> new HotelNotFoundException(id));
    }

    protected Hotel update(Hotel hotel, Long id) {
        return repository.findById(id)
                .map(hotelDb -> {
                    hotelDb.setNome(hotel.getNome());
                    hotelDb.setEndereco(hotel.getEndereco());
                    return repository.save(hotelDb);
                })
                .orElseGet(() -> {
                    hotel.setId(id);
                    return repository.save(hotel);
                });
    }

    protected void delete(Long id) {
        repository.deleteById(id);
    }
}
