package org.itc;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;
import java.time.LocalDate;

@Table(name = "Computador")
public class Computador implements Recurso {
    @Id
    private Integer id;
    private String nombre;
    private LocalDate fechaIngreso;
    private boolean activo;
    private String estado = "Activo";
    private TipoComputador tipo;
    private String marca;
    private String modelo;

    public Computador() {
    }

    public Computador(String nombre, LocalDate fechaIngreso, boolean activo, TipoComputador tipo, String marca, String modelo) {
        this.nombre = nombre;
        this.fechaIngreso = fechaIngreso;
        this.activo = activo;
        this.tipo = tipo;
        this.marca = marca;
        this.modelo = modelo;
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

    public TipoComputador getTipo() {
        return tipo;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    @Override
    public String toString() {
        return "COMPUTADOR\n" +
                "Id=" + id + "\n" +
                "Nombre=" + nombre + "\n" +
                "FechaIngreso=" + fechaIngreso + "\n" +
                "Activo=" + activo + "\n" +
                "Tipo=" + tipo + "\n" +
                "Marca=" + marca + "\n" +
                "Modelo=" + modelo + "\n";
    }
}
