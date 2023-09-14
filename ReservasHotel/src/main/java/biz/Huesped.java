package biz;

import java.io.Serializable;

public class Huesped implements Serializable{

    private String nombrePersona;

    private int documento;

    private Habitacion habitaciones = new Habitacion();

    public Huesped() {

    }

    public Huesped(String nombrePersona, int documento) {
        this.nombrePersona = nombrePersona;
        this.documento = documento;
    }

    public String getNombrePersona() {
        return nombrePersona;
    }

    public void setNombrePersona(String nombrePersona) {
        this.nombrePersona = nombrePersona;
    }

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public Habitacion getHabitaciones() {
        return habitaciones;
    }

    public void setHabitaciones(Habitacion habitaciones) {
        this.habitaciones = habitaciones;
    }

    @Override
    public String toString() {
        return  "Nombre:" + nombrePersona + ", Documento:" + documento + ", Habitacion:" + habitaciones + '}';
    }



}
