package biz;

import java.io.Serializable;
import java.util.ArrayList;

public class Consumo implements Serializable {

    private ArrayList<Productos> productos= new ArrayList<Productos>();

    private int costoFinal;

    private ArrayList<Servicios> servicios= new ArrayList<Servicios>();

    public Consumo(Productos producto, int costoFinal, Servicios servicios) {
        
        this.costoFinal = costoFinal;
        
    }

    public Consumo() {
    }

    public ArrayList<Productos> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Productos> productos) {
        this.productos = productos;
    }

    

    public int getCostoFinal() {
        return costoFinal;
    }

    public void setCostoFinal(int costoFinal) {
        this.costoFinal = costoFinal;
    }

    public ArrayList<Servicios> getServicios() {
        return servicios;
    }

    public void setServicios(ArrayList<Servicios> servicios) {
        this.servicios = servicios;
    }

   

    @Override
    public String toString() {
        return  "Producto:" + productos  + ", Servicio:" + servicios + "";
    }

    
    
}
