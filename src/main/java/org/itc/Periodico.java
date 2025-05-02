package org.itc;

import org.springframework.data.annotation.Id;
import java.time.LocalDate;

public class Periodico implements Recurso {
    @Id
    private Integer id;
    private String nombre;
    private LocalDate fechaIngreso;
    private boolean activo;
    private String estado = "Activo";
    private String editorial;
    private LocalDate fechaPublicacion;

    public Periodico() {
    }

    public Periodico(String nombre, LocalDate fechaIngreso, boolean activo, String editorial, LocalDate fechaPublicacion) {
        this.nombre = nombre;
        this.fechaIngreso = fechaIngreso;
        this.activo = activo;
        this.editorial = editorial;
        this.fechaPublicacion = fechaPublicacion;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public LocalDate getFechaIngreso() {
        return fechaIngreso;
    }

    @Override
    public boolean isActivo() {
        return activo;
    }

    @Override
    public void darDeBaja() {
        if (activo) {
            activo = false;
            estado = "inactivo";
        }
    }

    public String getEditorial() {
        return editorial;
    }

    public LocalDate getFechaPublicacion() {
        return fechaPublicacion;
    }

    @Override
    public String toString() {
        return "PERIÓDICO\n" +
                "Id=" + id + "\n" +
                "Nombre=" + nombre + "\n" +
                "FechaIngreso=" + fechaIngreso + "\n" +
                "Activo=" + activo + "\n" +
                "Editorial=" + editorial + "\n" +
                "FechaPublicacion=" + fechaPublicacion + "\n";
    }
}
