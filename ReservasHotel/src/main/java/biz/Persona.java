package biz;

public abstract class Persona {

    private int idPersona;

    private String nombrePersona;

    private int tipoDocumento;

    private int telefono;

    public Persona() {
    }

    public Persona(int idPersona, String nombrePersona, int tipoDocumento, int telefono) {
        this.idPersona = idPersona;
        this.nombrePersona = nombrePersona;
        this.tipoDocumento = tipoDocumento;
        this.telefono = telefono;
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

   

    
}
