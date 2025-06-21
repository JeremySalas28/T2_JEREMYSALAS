package com.peliculast2.bbfake.alquiler.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.peliculast2.bbfake.alquiler.entity.Detalle_alquiler;
import com.peliculast2.bbfake.alquiler.entity.Detalle_alquiler.DetalleAlquilerId;

@Repository
public interface DetalleAlquilerRepository extends JpaRepository<Detalle_alquiler, DetalleAlquilerId> {
}