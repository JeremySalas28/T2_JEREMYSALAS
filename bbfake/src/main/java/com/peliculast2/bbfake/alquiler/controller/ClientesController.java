package com.peliculast2.bbfake.alquiler.controller;

import com.peliculast2.bbfake.alquiler.entity.Clientes;
import com.peliculast2.bbfake.alquiler.repository.ClientesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/clientes")
public class ClientesController {

    @Autowired
    private ClientesRepository clientesRepository;

    @GetMapping
    public List<Clientes> listar() {
        return clientesRepository.findAll();
    }

    // ...otros métodos REST (crear, actualizar, eliminar)...
}
