package lab2p2_luishenriquez;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ConferenciasVirtuales {
    String titulo;
    String conferencista;
    Date fecha;
    int duracion;
    String enlaceDeAcceso;

    public String getTitulo() {
        return titulo;
    }

    public ConferenciasVirtuales(String titulo, String conferencista, Date fecha, int duracion, String enlaceDeAcceso) {
        this.titulo = titulo;
        this.conferencista = conferencista;
        this.fecha = fecha;
        this.duracion = duracion;
        this.enlaceDeAcceso = enlaceDeAcceso;
    }
    SimpleDateFormat sd = new SimpleDateFormat("dd/MM/yyyy");

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setConferencista(String conferencista) {
        this.conferencista = conferencista;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public void setEnlaceDeAcceso(String enlaceDeAcceso) {
        this.enlaceDeAcceso = enlaceDeAcceso;
    }

    public void setSd(SimpleDateFormat sd) {
        this.sd = sd;
    }

    @Override
    public String toString() {
        return "Conferencia virtual: " + "título: " + titulo + ", conferencista: " + conferencista + ", fecha: " + sd.format(fecha) + ", duracion: " + duracion + ", enlaced de acceso: " + enlaceDeAcceso;
    }
}
