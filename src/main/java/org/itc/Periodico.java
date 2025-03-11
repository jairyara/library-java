package org.itc;

import java.time.LocalDate;

public class Periodico extends Recurso{
    private int id;
    private LocalDate fechaPublicacion;
    private String editorial;

    public Periodico(LocalDate fechaPublicacion,String editorial, int id){
        super();
        this.id = id;
        this.fechaPublicacion = fechaPublicacion;
        this.editorial = editorial;
    }

    public int getId() {
        return id;
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
                "Id=" + id + "\n" +
                "Nombre=" + getNombre() + "\n" +
                "FechaIngreso=" + getFechaIngreso() + "\n" +
                "Activo=" + isActivo() + "\n" +
                "FechaPublicacion=" + fechaPublicacion + "\n" +
                "Editorial=" + editorial + "\n";
    }
    
}
