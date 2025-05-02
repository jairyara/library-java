package org.itc;

import java.time.LocalDateTime;

public abstract class Recurso {
    private String nombre;
    private LocalDateTime fechaIngreso;
    private boolean activo;
    private String estado ="Activo";

    public Recurso() {
        this.nombre = nombre;
        this.fechaIngreso = fechaIngreso;
        this.activo = activo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre(){
        return nombre;
    }

    public LocalDateTime getFechaIngreso(){
        return fechaIngreso;        
    }

    public String getEstado() {
        return estado;
    }

    public boolean isActivo() {
        return activo;
    }
    
   
    public void comprobarEstado(){
        if (activo) {
            System.out.println("el estado esta activo");
        }else{
            System.out.println("E estado no esta activo");
        }
    }

    public void darDeBaja() {
        if (activo) {
            activo = false;
            estado ="inactivo";  // Cambia el estado a inactivo
            System.out.println("El usuario ha sido dado de baja.");
        } else {
            System.out.println("El usuario ya está inactivo.");
        }
    }

    public boolean coincideConCriterio(String criterio) {
        if (nombre == null || criterio == null) {
            return false;
        }
        return nombre.trim().equalsIgnoreCase(criterio.trim());
    }

    @Override
    public String toString() {
        return "RECURSO\n" +
                "Nombre=" + nombre + "\n" +
                "FechaIngreso=" + fechaIngreso + "\n" +
                "Activo=" + activo + "\n";
    }

}

