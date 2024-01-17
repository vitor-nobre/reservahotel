package com.br.reservahotel.hotel;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hotel")
public class HotelControler {

    private HotelService service;

    HotelControler(HotelService service){
        this.service = service;
    }
    @PostMapping
    public void create(@RequestBody Hotel hotel){
        this.service.create(hotel);
    }

    @GetMapping
    public List<Hotel> list(){
        return this.service.findAll();
    }

    @GetMapping("/{id}")
    public Hotel findOne(@PathVariable Long id){
        return this.service.one(id);
    }

    @PutMapping("/{id}")
    public void update(@RequestBody Hotel hotel,@PathVariable Long id){
        this.service.update(hotel,id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        this.service.delete(id);
    }
}
