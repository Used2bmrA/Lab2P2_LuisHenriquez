package lab2p2_luishenriquez;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab2P2_LuisHenriquez {
    
static Scanner sc = new Scanner (System.in);
static ArrayList recursos = new ArrayList<>();
static ArrayList<Usuario> usuarios = new ArrayList<>();

    public static void main(String[] args) {
        Usuario bibliotecario = new Usuario("Aida", "1234", "bibliotecario");
        Usuario profesor = new Usuario("Claudia", "4321", "profesor");
        Usuario estudiante = new Usuario("Rito", "1111", "estudiante");
        usuarios.add(bibliotecario);
        usuarios.add(profesor);
        usuarios.add(estudiante);
        
        System.out.println("Bienvenido a mi laboratorio.");
        int op = 0;
        String contraUsuario = "";
        String contraIngresada = "1";
        Usuario usuarioActual = new Usuario();
        
        do {
            while (!contraUsuario.equals(contraIngresada)) {
                System.out.println("Elija su usuario:");
                ListarArreglo(usuarios);
                int seleccion = sc.nextInt() - 1;
                sc.nextLine();
                contraUsuario = ((Usuario) usuarios.get(seleccion)).getContrasena();

                System.out.println("Ingrese su contraseña:");
                contraIngresada = sc.nextLine();

                if (!contraUsuario.equals(contraIngresada)) {
                    System.out.println("Contraseña invalida. Vuelva a intentar.\n");
                }

                usuarioActual = (Usuario) usuarios.get(seleccion);
            }

            
            
            System.out.println("¿Qué desea realizar?\n"
                    + "1. Listar recursos \n"
                    + "2. Agregar recursos\n"
                    + "3. Eliminar recursos\n"
                    + "4. Modificar recursos\n"
                    + "5. Salir");
            op = sc.nextInt();
            sc.nextLine();
            
            switch (op) {
                case 1:
                    ListarArreglo(recursos);
                    
                    break;
                case 2:
                    if (usuarioActual.getTipo().equals("estudiante")) {
                        System.out.println("No tiene acceso a esta función.");
                    }
                    
                    System.out.println("¿Qué recurso desea agregar?\n"
                            + "1. Libros\n"
                            + "2. Articulo\n"
                            + "3. Cursos en linea\n"
                            + "4. Conferencias virtuales");
                    int choice = sc.nextInt();
                    sc.nextLine();
                    
                    switch (choice) {
                        case 1:
                            AgregarRecurso("Libros");
                            System.out.println("Libro agregado exitosamente.");
                            break;
                        case 2:
                            AgregarRecurso("Articulos");
                            System.out.println("Articulo agregado exitosamente.");
                            break;
                        case 3:
                            AgregarRecurso("Cursos en linea");
                            System.out.println("Curso en linea agregado exitosamente.");
                            break;
                        case 4:
                            AgregarRecurso("Conferencias virtuales");
                            System.out.println("Conferencia virtual agregado exitosamente.");
                            break;
                        default:
                            System.out.println("Opción invalida. Intente otra vez.");
                    }
                    
                    
                    break;
                case 3:
                    if (usuarioActual.getTipo().equals("estudiante") || usuarioActual.getTipo().equals("profesor")) {
                        System.out.println("No tiene acceso a esta función.");
                        break;
                    }
                    
                    
                    break;
                case 4:
                    if (usuarioActual.getTipo().equals("estudiante") || usuarioActual.getTipo().equals("profesor")) {
                        System.out.println("No tiene acceso a esta función.");
                        break;
                    }
                    
                    break;
                case 5:
                    System.out.println("Adiós.");
                    break;
                default:
                    System.out.println("Opción invalida, intente otra vez.");
            }
        } while (op != 5);
    }

    private static void ListarArreglo(ArrayList lista) {
        String impresion = "";
        for (int i = 0; i < lista.size(); i++) {
            impresion += (i + 1) + ". " + lista.get(i).toString() + ".\n";
        }
        System.out.println(impresion);
    }

    private static void AgregarRecurso(String tipo) {
        if (tipo.equals("Libros")) {
            
        }else if(tipo.equals("Articulos")){
            
        }else if(tipo.equals("Cursos en linea")){
            
        }else if(tipo.equals("Conferencias virtuales")){
            
        }
        
    }
    
}
