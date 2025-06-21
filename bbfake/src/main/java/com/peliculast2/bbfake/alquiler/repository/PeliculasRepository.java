package com.peliculast2.bbfake.alquiler.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.peliculast2.bbfake.alquiler.entity.Peliculas;

@Repository
public interface PeliculasRepository extends JpaRepository<Peliculas, Long> {
    // Puedes agregar métodos personalizados si lo necesitas
}