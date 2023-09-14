package biz;

import java.io.Serializable;

public class Productos implements Serializable {

    private int idProducto;

    private String nombreProducto;

    private int costoProducto;

   

    public Productos() {
    }

    public Productos(int idProducto, String nombreProducto, int costoProducto, String descripcionProducto) {
        this.idProducto = idProducto;
        this.nombreProducto = nombreProducto;
        this.costoProducto = costoProducto;
       
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public int getCostoProducto() {
        return costoProducto;
    }

    public void setCostoProducto(int costoProducto) {
        this.costoProducto = costoProducto;
    }

   

    @Override
    public String toString() {
        return  "ID:" + idProducto + ", " + nombreProducto +", " + " Costo:" + costoProducto  + "";
    }
   
   
   
}
