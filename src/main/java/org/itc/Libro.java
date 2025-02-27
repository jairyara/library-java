package org.itc;

public class Libro extends Recurso {
    private String autor;
    private String editorial;
    private int anio;

    public Libro(String _nombre,String _autor,String _editoria,int _anio){
        nombre =_nombre;
        autor =_autor;
        editorial =_editoria;
        anio = _anio;
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
    public boolean coincideConCriterio(String criterio) {
        // Verifica si el nombre coincide exactamente con el criterio
        return nombre.equals(criterio);  // Retorna true si coincide, false si no
    }
    public String toString(){
        return "Recurso[activo="+activo+",fechaIngreso="+fechaIngreso+"nombre="+nombre+"] ";
    }
}
