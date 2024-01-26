package lab2p2_luishenriquez;

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

    @Override
    public String toString() {
        return "Articulo: " + "título: " + titulo + ", autor: " + autor + ", tema: " + tema + ", fecha: " + fecha + ", accesoEnLinea: " + accesoEnLinea;
    }
}
