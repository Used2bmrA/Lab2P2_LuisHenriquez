package lab2p2_luishenriquez;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Articulos {
    String titulo;
    String autor;
    String tema;
    Date fecha;
    boolean accesoEnLinea;

    public String getTitulo() {
        return titulo;
    }

    public Articulos(String titulo, String autor, String tema, Date fecha, boolean accesoEnLinea) {
        this.titulo = titulo;
        this.autor = autor;
        this.tema = tema;
        this.fecha = fecha;
        this.accesoEnLinea = accesoEnLinea;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void setAccesoEnLinea(boolean accesoEnLinea) {
        this.accesoEnLinea = accesoEnLinea;
    }

    public void setSd(SimpleDateFormat sd) {
        this.sd = sd;
    }

    public boolean isAccesoEnLinea() {
        return accesoEnLinea;
    }
    
    SimpleDateFormat sd = new SimpleDateFormat("dd/MM/yyyy");

    @Override
    public String toString() {
        return "Articulo: " + "título: " + titulo + ", autor: " + autor + ", tema: " + tema + ", fecha: " + sd.format(fecha) + ", acceso en linea: " + accesoEnLinea;
    }
}
