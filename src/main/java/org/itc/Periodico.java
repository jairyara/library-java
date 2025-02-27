package org.itc;

import java.time.LocalDate;

public class Periodico extends Recurso{
    private LocalDate fechaPublicacion;
    private String editorial;

    public Periodico(LocalDate _fechaPublicacion,String _editorial){
        fechaPublicacion = _fechaPublicacion;
        editorial = _editorial;
    }

    public boolean coincideConCriterio(String criterio) {
        // Verifica si el nombre coincide exactamente con el criterio
        return nombre.equals(criterio);  // Retorna true si coincide, false si no
    }
    public String toString(){
        return "Recurso[activo="+activo+",fechaIngreso="+fechaIngreso+"nombre="+nombre+"] ";
    }
}
