package com.peliculast2.bbfake.alquiler.repository;

import com.peliculast2.bbfake.alquiler.entity.Alquiler;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlquilerRepository extends JpaRepository<Alquiler, Long> {
    // Puedes agregar métodos personalizados si lo necesitas
}
