package biz;

import java.io.Serializable;

public class Trabajador extends Persona implements Serializable {

    private int idTrabajador;
   

    private String nombrePersona;

    private int tipoDocumento;

    private int telefono;

    public Trabajador() {
    }

    public Trabajador(int idTrabajador, String nombrePersona, int tipoDocumento, int telefono) {
        this.idTrabajador = idTrabajador;
        this.nombrePersona = nombrePersona;
        this.tipoDocumento = tipoDocumento;
        this.telefono = telefono;
    }

    
    public int getIdTrabajador() {
        return idTrabajador;
    }

    public void setIdTrabajador(int idTrabajador) {
        this.idTrabajador = idTrabajador;
    }

    public String getNombrePersona() {
        return nombrePersona;
    }

    public void setNombrePersona(String nombrePersona) {
        this.nombrePersona = nombrePersona;
    }

    public int getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(int tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "ID:" + idTrabajador + ", Nombre y Apellido:" + nombrePersona + ", Documento:" + tipoDocumento + ", Telefono:" + telefono + "";
    }

    

}
