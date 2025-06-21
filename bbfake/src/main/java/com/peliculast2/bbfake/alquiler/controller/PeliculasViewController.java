package com.peliculast2.bbfake.alquiler.controller;

import com.peliculast2.bbfake.alquiler.repository.PeliculasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PeliculasViewController {

    @Autowired
    private PeliculasRepository peliculasRepository;

    @GetMapping("/peliculas/vista")
    public String vistaPeliculas(Model model) {
        model.addAttribute("listaPeliculas", peliculasRepository.findAll());
        return "listado_peliculas";
    }
}
