package biz;

import java.io.Serializable;

public class Cliente extends Persona implements Serializable {

    private int codigoCliente;
    private int idPersona;

    private String nombrePersona;

    private int tipoDocumento;

    private int telefono;

    public Cliente(int codigoCliente) {
        this.codigoCliente = codigoCliente;
    }

   
    public Cliente() {
    }

    public int getCodigoCliente() {
        return codigoCliente;
    }

    public void setCodigoCliente(int codigoCliente) {
        this.codigoCliente = codigoCliente;
    }

    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
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
        return  "Codigo:" + codigoCliente  + ", Nombre:" + nombrePersona + ", Documento:" + tipoDocumento + ", Telefono:" + telefono + "";
    }

    
    
}
