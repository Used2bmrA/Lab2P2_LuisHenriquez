package lab2p2_luishenriquez;

import java.util.Date;

public class Libro {
    String titulo;
    String autor;
    String genero;
    String anoPublicacion;
    boolean disponible;

    public Libro(String titulo, String autor, String genero, String anoPublicacion, boolean disponible) {
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.anoPublicacion = anoPublicacion;
        this.disponible = disponible;
    }

    public String getTitulo() {
        return titulo;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setAnoPublicacion(String anoPublicacion) {
        this.anoPublicacion = anoPublicacion;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    @Override
    public String toString() {
        return "Libro: " + "título: " + titulo + ", autor: " + autor + ", género: " + genero + ", año de publicacion: " + anoPublicacion + ", disponible: " + disponible;
    }
    
    
}
