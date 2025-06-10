package org.itc;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;
import java.time.LocalDate;

@Table(name = "Libro")
public class Libro implements Recurso {
    @Id
    private Integer id;
    private String nombre;
    private LocalDate fechaIngreso;
    private boolean activo;
    private String estado = "Activo";
    private String autor;
    private String editorial;
    private String isbn;

    public Libro() {
    }

    public Libro(String nombre, LocalDate fechaIngreso, boolean activo, String autor, String editorial, String isbn) {
        this.nombre = nombre;
        this.fechaIngreso = fechaIngreso;
        this.activo = activo;
        this.autor = autor;
        this.editorial = editorial;
        this.isbn = isbn;
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

    public String getAutor() {
        return autor;
    }

    public String getEditorial() {
        return editorial;
    }

    public String getIsbn() {
        return isbn;
    }

    @Override
    public String toString() {
        return "LIBRO\n" +
                "Id=" + id + "\n" +
                "Nombre=" + nombre + "\n" +
                "FechaIngreso=" + fechaIngreso + "\n" +
                "Activo=" + activo + "\n" +
                "Autor=" + autor + "\n" +
                "Editorial=" + editorial + "\n" +
                "ISBN=" + isbn + "\n";
    }
}
