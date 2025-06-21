package com.peliculast2.bbfake.alquiler.entity;

import jakarta.persistence.*;
import java.io.Serializable;

@Entity
@IdClass(Detalle_alquiler.DetalleAlquilerId.class)
public class Detalle_alquiler {

    @Id
    @ManyToOne
    @JoinColumn(name = "id_alquiler", nullable = false)
    private Alquiler alquiler;

    @Id
    @ManyToOne
    @JoinColumn(name = "id_pelicula", nullable = false)
    private Peliculas pelicula;

    @Column(nullable = false)
    private Integer cantidad;

    public Detalle_alquiler() {}

    public Detalle_alquiler(Alquiler alquiler, Peliculas pelicula, Integer cantidad) {
        this.alquiler = alquiler;
        this.pelicula = pelicula;
        this.cantidad = cantidad;
    }

    public Alquiler getAlquiler() {
        return alquiler;
    }

    public void setAlquiler(Alquiler alquiler) {
        this.alquiler = alquiler;
    }

    public Peliculas getPelicula() {
        return pelicula;
    }

    public void setPelicula(Peliculas pelicula) {
        this.pelicula = pelicula;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "Detalle_alquiler [alquiler=" + (alquiler != null ? alquiler.getId() : null) +
               ", pelicula=" + (pelicula != null ? pelicula.getId_pelicula() : null) +
               ", cantidad=" + cantidad + "]";
    }

    // Clase estática para la clave compuesta
    public static class DetalleAlquilerId implements Serializable {
        private Long alquiler;
        private Long pelicula;

        public DetalleAlquilerId() {}

        public DetalleAlquilerId(Long alquiler, Long pelicula) {
            this.alquiler = alquiler;
            this.pelicula = pelicula;
        }

        // Getters y setters (recomendado para JPA)
        public Long getAlquiler() {
            return alquiler;
        }

        public void setAlquiler(Long alquiler) {
            this.alquiler = alquiler;
        }

        public Long getPelicula() {
            return pelicula;
        }

        public void setPelicula(Long pelicula) {
            this.pelicula = pelicula;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            DetalleAlquilerId that = (DetalleAlquilerId) o;
            return java.util.Objects.equals(alquiler, that.alquiler) &&
                   java.util.Objects.equals(pelicula, that.pelicula);
        }

        @Override
        public int hashCode() {
            return java.util.Objects.hash(alquiler, pelicula);
        }
    }
}