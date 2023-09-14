package biz;

import java.io.Serializable;

public class Servicios implements Serializable {

    private String nombreServicio;

    private int costo;

    private String tipoServicio;

    public Servicios() {
    }

    public Servicios(String nombreServicio, int costo, String tipoServicio) {
        this.nombreServicio = nombreServicio;
        this.costo = costo;
        this.tipoServicio = tipoServicio;
    }

    public String getNombreServicio() {
        return nombreServicio;
    }

    public void setNombreServicio(String nombreServicio) {
        this.nombreServicio = nombreServicio;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public String getTipoServicio() {
        return tipoServicio;
    }

    public void setTipoServicio(String tipoServicio) {
        this.tipoServicio = tipoServicio;
    }

    @Override
    public String toString() {
        return    nombreServicio + ", costo:" + costo + ", tipo:" + tipoServicio + "";
    }
    
    
    
}
