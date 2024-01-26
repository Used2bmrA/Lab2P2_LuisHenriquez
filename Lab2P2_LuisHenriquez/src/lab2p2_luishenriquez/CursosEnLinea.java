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

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }

    public void setDuracionSemanas(int duracionSemanas) {
        this.duracionSemanas = duracionSemanas;
    }

    public void setPlataformaDeEnsenanza(String plataformaDeEnsenanza) {
        this.plataformaDeEnsenanza = plataformaDeEnsenanza;
    }

    @Override
    public String toString() {
        return "Curso en linea: " + "título: " + titulo + ", instructor: " + instructor + ", duracion en semanas: " + duracionSemanas + ", plataforma de ensenanza: " + plataformaDeEnsenanza;
    }
}
