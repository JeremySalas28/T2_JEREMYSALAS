package com.peliculast2.bbfake.alquiler.controller;

import com.peliculast2.bbfake.alquiler.entity.Detalle_alquiler;
import com.peliculast2.bbfake.alquiler.entity.Detalle_alquiler.DetalleAlquilerId;
import com.peliculast2.bbfake.alquiler.repository.DetalleAlquilerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/detalles-alquiler")
public class DetalleAlquilerController {

    @Autowired
    private DetalleAlquilerRepository detalleAlquilerRepository;

    @GetMapping
    public List<Detalle_alquiler> listar() {
        return detalleAlquilerRepository.findAll();
    }

    @GetMapping("/{alquilerId}/{peliculaId}")
    public Detalle_alquiler obtener(@PathVariable Long alquilerId, @PathVariable Long peliculaId) {
        DetalleAlquilerId id = new DetalleAlquilerId(alquilerId, peliculaId);
        return detalleAlquilerRepository.findById(id).orElse(null);
    }

    @PostMapping
    public Detalle_alquiler crear(@RequestBody Detalle_alquiler detalle) {
        return detalleAlquilerRepository.save(detalle);
    }

    @PutMapping("/{alquilerId}/{peliculaId}")
    public Detalle_alquiler actualizar(@PathVariable Long alquilerId, @PathVariable Long peliculaId, @RequestBody Detalle_alquiler detalle) {
        // No es necesario setear el ID si el JSON ya lo trae correctamente
        return detalleAlquilerRepository.save(detalle);
    }

    @DeleteMapping("/{alquilerId}/{peliculaId}")
    public void eliminar(@PathVariable Long alquilerId, @PathVariable Long peliculaId) {
        DetalleAlquilerId id = new DetalleAlquilerId(alquilerId, peliculaId);
        detalleAlquilerRepository.deleteById(id);
    }
}
