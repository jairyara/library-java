package org.itc;

import java.time.LocalDate;

public class Periodico extends Recurso{
    private LocalDate fechaPublicacion;
    private String editorial;

    public Periodico(LocalDate _fechaPublicacion,String _editorial){
        super();
        this.fechaPublicacion = fechaPublicacion;
        this.editorial = editorial;
    }

    @Override
    public boolean coincideConCriterio(String criterio) {
        return super.coincideConCriterio(criterio) ||
                fechaPublicacion.toString().contains(criterio) ||
                editorial.equalsIgnoreCase(criterio);
    }
    @Override
    public String toString() {
        return "PERIODICO\n" +
                "Nombre=" + getNombre() + "\n" +
                "FechaIngreso=" + getFechaIngreso() + "\n" +
                "Activo=" + isActivo() + "\n" +
                "FechaPublicacion=" + fechaPublicacion + "\n" +
                "Editorial=" + editorial + "\n";
    }
    
}
