package com.peliculast2.bbfake.alquiler.controller;

import com.peliculast2.bbfake.alquiler.entity.Clientes;
//import com.peliculast2.bbfake.alquiler.entity.Clientes;
import com.peliculast2.bbfake.alquiler.repository.ClientesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ClientesViewController {

    @Autowired
    private ClientesRepository clienteRepository;

    @GetMapping("/clientes/vista")
    public String vistaClientes(Model model) {
        System.out.println(clienteRepository.findAll()); // Verifica si imprime clientes
        model.addAttribute("clientes", clienteRepository.findAll());
        return "listado_clientes";
    }

    @GetMapping("/clientes/registro")
    public String mostrarFormularioRegistro(Model model) {
        model.addAttribute("cliente", new Clientes());
        return "registro_cliente";
    }

    @PostMapping("/clientes/registro")
    public String registrarCliente(@ModelAttribute("cliente") Clientes cliente) {
        clienteRepository.save(cliente);
        return "redirect:/clientes/vista";
    }

    // ...otros métodos...
}
