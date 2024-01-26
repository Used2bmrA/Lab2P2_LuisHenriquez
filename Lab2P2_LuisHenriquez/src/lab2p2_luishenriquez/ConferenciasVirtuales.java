package lab2p2_luishenriquez;

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

    @Override
    public String toString() {
        return "Conferencia virtual: " + "título: " + titulo + ", conferencista: " + conferencista + ", fecha: " + fecha + ", duracion: " + duracion + ", enlaced de acceso: " + enlaceDeAcceso;
    }
}
