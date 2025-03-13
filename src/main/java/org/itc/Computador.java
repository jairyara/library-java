package org.itc;


public class Computador extends Recurso{
    private String marca;
    private String modelo;
    private String sistemaOperativo;

    public Computador(String marca,String modelo,String sistemaOperativo){
        this.marca = marca;
        this.modelo= modelo;
        this.sistemaOperativo = sistemaOperativo;

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

    @Override
    public boolean coincideConCriterio(String criterio) {
        return super.coincideConCriterio(criterio) ||
                marca.equalsIgnoreCase(criterio) ||
                modelo.equalsIgnoreCase(criterio) ||
                sistemaOperativo.equalsIgnoreCase(criterio);
    }

    @Override
    public String toString() {
        return "COMPUTADOR\n" +
                "Nombre=" + getNombre() + "\n" +
                "FechaIngreso=" + getFechaIngreso() + "\n" +
                "Activo=" + isActivo() + "\n" +
                "Marca=" + marca + "\n" +
                "Modelo=" + modelo + "\n" +
                "SistemaOperativo=" + sistemaOperativo + "\n";
    }
}
