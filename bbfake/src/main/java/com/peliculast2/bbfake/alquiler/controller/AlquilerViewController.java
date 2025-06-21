package com.peliculast2.bbfake.alquiler.controller;

import com.peliculast2.bbfake.alquiler.repository.ClientesRepository;
import com.peliculast2.bbfake.alquiler.repository.PeliculasRepository;
import com.peliculast2.bbfake.alquiler.repository.AlquilerRepository;
import com.peliculast2.bbfake.alquiler.entity.Alquiler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDate;

@Controller
public class AlquilerViewController {

    @Autowired
    private ClientesRepository clientesRepository;

    @Autowired
    private PeliculasRepository peliculasRepository;

    @Autowired
    private AlquilerRepository alquilerRepository;

    @GetMapping("/alquiler/nuevo")
    public String mostrarFormularioAlquiler(Model model) {
        model.addAttribute("clientes", clientesRepository.findAll());
        model.addAttribute("peliculas", peliculasRepository.findAll());
        return "formulario_alquiler";
    }

    @PostMapping("/alquiler/guardar")
    public String guardarAlquiler(
            @RequestParam("cliente") Long idCliente,
            @RequestParam("pelicula") Long idPelicula,
            @RequestParam("cantidad") Integer cantidad,
            @RequestParam("total") Double total
    ) {
        Alquiler alquiler = new Alquiler();
        alquiler.setIdCliente(idCliente);
        alquiler.setIdPelicula(idPelicula);
        alquiler.setCantidad(cantidad);
        alquiler.setTotal(total);
        alquiler.setFecha(LocalDate.now()); // Fecha del sistema

        alquilerRepository.save(alquiler);

        return "redirect:/";
    }

    @GetMapping("/alquileres/vista")
    public String vistaAlquileres(Model model) {
        model.addAttribute("listaAlquileres", alquilerRepository.findAll());
        return "listado_alquileres";
}
}
