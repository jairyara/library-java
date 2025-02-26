package org.itc;

import java.time.LocalDateTime;

abstract class Recurso {
    protected String nombre;
    protected LocalDateTime fechaIngreso;
    protected boolean activo;

    public Recurso(String _nombre,LocalDateTime _fechaIngreso,boolean _activo){
        nombre = _nombre;
        fechaIngreso = _fechaIngreso;
        activo = _activo;
    }

    public String getNombre(){
        return nombre;
    }

    public LocalDateTime getFechaIngreso(){
        return fechaIngreso;        
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
            activo = false;  // Cambia el estado a inactivo
            System.out.println("El usuario ha sido dado de baja.");
        } else {
            System.out.println("El usuario ya está inactivo.");
        }
    } 
    public boolean coincideConCriterio(String criterio) {
        // Verifica si el nombre coincide exactamente con el criterio
        return nombre.equals(criterio);  // Retorna true si coincide, false si no
    }
    
    public String toString(){
        return "Recurso[activo="+activo+",fechaIngreso="+fechaIngreso+"nombre="+nombre+"] ";
    }

}

