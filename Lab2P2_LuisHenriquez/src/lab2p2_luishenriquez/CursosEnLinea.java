package lab2p2_luishenriquez;

public class CursosEnLinea {
    String titulo;
    String instructor;
    int duracionSemanas;
    String plataformaDeEnsenanza;

    public String getTitulo() {
        return titulo;
    }

    public CursosEnLinea(String titulo, String instructor, int duracionSemanas, String plataformaDeEnsenanza) {
        this.titulo = titulo;
        this.instructor = instructor;
        this.duracionSemanas = duracionSemanas;
        this.plataformaDeEnsenanza = plataformaDeEnsenanza;
    }

    @Override
    public String toString() {
        return "Curso en linea: " + "título: " + titulo + ", instructor: " + instructor + ", duracion en semanas: " + duracionSemanas + ", plataforma de ensenanza: " + plataformaDeEnsenanza;
    }
}
