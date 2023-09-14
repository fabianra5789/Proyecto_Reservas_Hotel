/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biz;

import java.io.Serializable;

/**
 *
 * @author fabianra5789
 */
public class Habitacion implements Serializable {
    private String estadoHabitacion;
    private int pisoHabitacion;
    private int numeroHabitacion;
    private int costoHabitacion;
    private String descripcionHabitacion;

    public Habitacion(String estadoHabitacion, int pisoHabitacion, int numeroHabitacion, int costoHabitacion, String descripcionHabitacion) {
        this.estadoHabitacion = estadoHabitacion;
        this.pisoHabitacion = pisoHabitacion;
        this.numeroHabitacion = numeroHabitacion;
        this.costoHabitacion = costoHabitacion;
        this.descripcionHabitacion = descripcionHabitacion;
    }

    public Habitacion() {
    }

    public String getEstadoHabitacion() {
        return estadoHabitacion;
    }

    public void setEstadoHabitacion(String estadoHabitacion) {
        this.estadoHabitacion = estadoHabitacion;
    }

    public int getPisoHabitacion() {
        return pisoHabitacion;
    }

    public void setPisoHabitacion(int pisoHabitacion) {
        this.pisoHabitacion = pisoHabitacion;
    }

    public int getNumeroHabitacion() {
        return numeroHabitacion;
    }

    public void setNumeroHabitacion(int numeroHabitacion) {
        this.numeroHabitacion = numeroHabitacion;
    }

    public int getCostoHabitacion() {
        return costoHabitacion;
    }

    public void setCostoHabitacion(int costoHabitacion) {
        this.costoHabitacion = costoHabitacion;
    }

    public String getDescripcionHabitacion() {
        return descripcionHabitacion;
    }

    public void setDescripcionHabitacion(String descripcionHabitacion) {
        this.descripcionHabitacion = descripcionHabitacion;
    }

    @Override
    public String toString() {
        return  "Estado:" + estadoHabitacion + ", Piso:" + pisoHabitacion + ", Numero:" + numeroHabitacion + ", Costo:" + costoHabitacion + ", Descripcion:" + descripcionHabitacion + "";
    }
    
    
    
}
