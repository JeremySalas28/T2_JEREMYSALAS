package com.peliculast2.bbfake.alquiler.controller;

import com.peliculast2.bbfake.alquiler.entity.Alquiler;
import com.peliculast2.bbfake.alquiler.repository.AlquilerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/alquileres")
public class AlquilerController {

    @Autowired
    private AlquilerRepository alquilerRepository;

    @GetMapping
    public List<Alquiler> listar() {
        return alquilerRepository.findAll();
    }

    @GetMapping("/{id}")
    public Alquiler obtener(@PathVariable Long id) {
        return alquilerRepository.findById(id).orElse(null);
    }

    @PostMapping
    public Alquiler crear(@RequestBody Alquiler alquiler) {
        return alquilerRepository.save(alquiler);
    }

    @PutMapping("/{id}")
    public Alquiler actualizar(@PathVariable Long id, @RequestBody Alquiler alquiler) {
        alquiler.setId(id);
        return alquilerRepository.save(alquiler);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        alquilerRepository.deleteById(id);
    }
}