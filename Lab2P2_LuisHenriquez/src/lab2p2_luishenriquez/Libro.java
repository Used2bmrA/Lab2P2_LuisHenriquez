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

    @Override
    public String toString() {
        return "Libro: " + "título: " + titulo + ", autor: " + autor + ", género: " + genero + ", año de publicacion: " + anoPublicacion + ", disponible: " + disponible;
    }
    
    
}
