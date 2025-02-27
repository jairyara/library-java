package org.itc;
public class Computador extends Recurso{
    private String marca;
    private String modelo;
    private String sistemaOperativo;

    public Computador(String _marca,String _modelo,String _sistemaOperativo){
        marca = _marca;
        modelo= _modelo;
        sistemaOperativo = _sistemaOperativo;

    }
    public String getMarca(){
        return marca;
    }

    public String getModelo(){
        return modelo;
    }

    public String getSistemaOperativo(){
        return sistemaOperativo;
    }
    
    public boolean coincideConCriterio(String criterio) {
        // Verifica si el nombre coincide exactamente con el criterio
        return nombre.equals(criterio);  // Retorna true si coincide, false si no
    }
    public String toString(){
        return "Recurso[activo="+activo+",fechaIngreso="+fechaIngreso+"nombre="+nombre+"] ";
    }
}
