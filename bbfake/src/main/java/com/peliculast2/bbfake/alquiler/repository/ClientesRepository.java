package com.peliculast2.bbfake.alquiler.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.peliculast2.bbfake.alquiler.entity.Clientes;

@Repository
public interface ClientesRepository extends JpaRepository<Clientes, Long> {
    // Puedes agregar métodos personalizados si lo necesitas
}
