package lab2p2_luishenriquez;

public class Usuario {
    String nombre;
    String contrasena;
    String tipo;



    public Usuario(String nombre, String contrasena, String tipo) {
        this.nombre = nombre;
        this.contrasena = contrasena;
        this.tipo = tipo;
    }

    public Usuario() {
    }
    
        public String getTipo() {
        return tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getContrasena() {
        return contrasena;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Tipo: " + tipo;
    }
        
        
}
