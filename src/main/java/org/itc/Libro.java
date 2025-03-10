package org.itc;

public class Libro extends Recurso {
    private String autor;
    private String editorial;
    private int anio;

    public Libro(String nombre,String autor,String editoria,int anio){
        super();
        this.setNombre(nombre);
        this.autor =autor;
        this.editorial =editoria;
        this.anio = anio;
    }

    public String getAutor() {
        return autor;
    }

    public String getEditorial(){
        return editorial;
    }

    public int getanio(){
        return anio;
    }
    @Override
    public boolean coincideConCriterio(String criterio) {
        return super.coincideConCriterio(criterio) ||
                autor.equalsIgnoreCase(criterio) ||
                editorial.equalsIgnoreCase(criterio) ||
                Integer.toString(anio).equals(criterio);
    }

    @Override
    public String toString() {
        return "LIBRO\n" +
                "Nombre=" + getNombre() + "\n" +
                "FechaIngreso=" + getFechaIngreso() + "\n" +
                "Activo=" + isActivo() + "\n" +
                "Autor=" + autor + "\n" +
                "Editorial=" + editorial + "\n" +
                "Año=" + anio + "\n";
    }

}
