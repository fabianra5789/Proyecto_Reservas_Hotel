package biz;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

public class Reserva implements Serializable {

   

    private Cliente cliente;

    private Consumo consumo;

    private Trabajador trabajador;

    private int costoReserva;

    private Date fechaEntrada;

    private Date fechaSalida;

   private ArrayList<Huesped> huesped= new ArrayList<Huesped>();

    public Reserva(Cliente cliente, Consumo consumo, Trabajador trabajador, int costoReserva, Date fechaEntrada, Date fechaSalida ) {
        this.cliente = cliente;
        this.consumo = consumo;
        this.trabajador = trabajador;
        this.costoReserva = costoReserva;
        this.fechaEntrada = fechaEntrada;
        this.fechaSalida = fechaSalida;
        
    }


    public Reserva() {
    }

    
   
    
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Consumo getConsumo() {
        return consumo;
    }

    public void setConsumo(Consumo consumo) {
        this.consumo = consumo;
    }

    public Trabajador getTrabajador() {
        return trabajador;
    }

    public void setTrabajador(Trabajador trabajador) {
        this.trabajador = trabajador;
    }

    public int getCostoReserva() {
        return costoReserva;
    }

    public void setCostoReserva(int costoReserva) {
        this.costoReserva = costoReserva;
    }

    public Date getFechaEntrada() {
        return fechaEntrada;
    }

    public void setFechaEntrada(Date fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    public Date getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(Date fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public ArrayList<Huesped> getHuesped() {
        return huesped;
    }

    public void setHuesped(ArrayList<Huesped> huesped) {
        this.huesped = huesped;
    }

    

    @Override
    public String toString() {
        return  "TRABAJADOR:(" + (trabajador) + ")| CLIENTE:(" + (cliente) + ")| HUESPED:(" + (huesped) + ")| CONSUMO:(" + (consumo) + ")| FECHA ENTRADA:(" + (fechaEntrada) + ")| FECHA SALIDA:(" + (fechaSalida) + ")| COSTO RESERVA:(" + (costoReserva) + ")";
    }

   
}
