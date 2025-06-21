package com.peliculast2.bbfake.alquiler.controller;

import com.peliculast2.bbfake.alquiler.entity.Peliculas;
import com.peliculast2.bbfake.alquiler.repository.PeliculasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/peliculas")
public class PeliculasController {

    @Autowired
    private PeliculasRepository peliculasRepository;

    @GetMapping
    public List<Peliculas> listar() {
        return peliculasRepository.findAll();
    }

    // ...otros métodos REST...
}