package biz;

public class Hotel {

    private String correo;

    private int x;

    private int y;

    private String paginaWeb;

    private String nombreHotel;

    private Huesped huesped;

    private Habitacion habitacion;

    public Hotel() {
    }

    public Hotel(String correo, int x, int y, String paginaWeb, String nombreHotel, Huesped huesped, Habitacion habitacion) {
        this.correo = correo;
        this.x = x;
        this.y = y;
        this.paginaWeb = paginaWeb;
        this.nombreHotel = nombreHotel;
        this.huesped = huesped;
        this.habitacion = habitacion;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String getPaginaWeb() {
        return paginaWeb;
    }

    public void setPaginaWeb(String paginaWeb) {
        this.paginaWeb = paginaWeb;
    }

    public String getNombreHotel() {
        return nombreHotel;
    }

    public void setNombreHotel(String nombreHotel) {
        this.nombreHotel = nombreHotel;
    }

    public Huesped getHuesped() {
        return huesped;
    }

    public void setHuesped(Huesped huesped) {
        this.huesped = huesped;
    }

    public Habitacion getHabitacion() {
        return habitacion;
    }

    public void setHabitacion(Habitacion habitacion) {
        this.habitacion = habitacion;
    }

   
}
