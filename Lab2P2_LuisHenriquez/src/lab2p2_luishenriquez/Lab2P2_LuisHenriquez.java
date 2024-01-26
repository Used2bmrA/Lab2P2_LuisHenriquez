package lab2p2_luishenriquez;

import java.util.ArrayList;
import java.util.Date;
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
                            AgregarRecurso("Libros", recursos);
                            System.out.println("Libro agregado exitosamente.");
                            break;
                        case 2:
                            AgregarRecurso("Articulos", recursos);
                            System.out.println("Articulo agregado exitosamente.");
                            break;
                        case 3:
                            AgregarRecurso("Cursos en linea", recursos);
                            System.out.println("Curso en linea agregado exitosamente.");
                            break;
                        case 4:
                            AgregarRecurso("Conferencias virtuales", recursos);
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
                    System.out.println("¿Cómo desea buscar?\n"
                            + "1. Por nombre\n"
                            + "2. Por índice");
                    int seleccionUsuario = sc.nextInt();
                    sc.nextLine();
                    
                    switch (seleccionUsuario) {
                        case 1:
                            System.out.println("¿Qué tipo de recurso está buscando?\n"
                                    + "1. Libros\n"
                                    + "2. Articulos\n"
                                    + "3. Cursos en linea\n"
                                    + "4. Conferencias virtuales");
                            int tipo = sc.nextInt();
                            sc.nextLine();
                            switch (tipo) {
                                case 1:
                                    EliminarRecurso("Libros", recursos);
                                    break;
                                case 2:
                                    EliminarRecurso("Articulos", recursos);
                                    break;
                                case 3:
                                    EliminarRecurso("Cursos en linea", recursos);
                                    break;
                                case 4:
                                    EliminarRecurso("Conferencias virtuales", recursos);
                                    break;
                                default:
                                    System.out.println("Opción invalida, intente otra vez.");
                            }
                            
                            break;
                        case 2:
                            System.out.println("¿Qué recurso desea eliminar?");
                            ListarArreglo(recursos);
                            int eliminar = sc.nextInt() - 1;
                            sc.nextLine();
                            recursos.remove(eliminar);
                            

                            break;
                        default:
                            System.out.println("Opción invalida, intente otra vez.");
                    }

                    
                    break;
                case 4:
                    if (usuarioActual.getTipo().equals("estudiante") || usuarioActual.getTipo().equals("profesor")) {
                        System.out.println("No tiene acceso a esta función.");
                        break;
                    }
                    
                    System.out.println("¿Qué recurso desea editar?");
                    ListarArreglo(recursos);
                    int elegido = sc.nextInt() - 1;
                    sc.nextLine();
                    
                    
                                        
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

    private static void AgregarRecurso(String tipo, ArrayList lista) {
        if (tipo.equals("Libros")) {
            System.out.println("¿Cuál es el título del libro?");
            String titulo = sc.nextLine();
            System.out.println("¿Quién es el autor?");
            String autor = sc.nextLine();
            System.out.println("¿De qué género es el libro?");
            String genero = sc.nextLine();
            System.out.println("¿En qué año se publicó el libro?");
            String anoPublicacion = sc.nextLine();
            Libro nuevoLibro = new Libro(titulo, autor, genero, anoPublicacion, true);
            recursos.add(nuevoLibro);
            
        }else if(tipo.equals("Articulos")){
            System.out.println("¿Cuál es el título del libro?");
            String titulo = sc.nextLine();
            System.out.println("¿Quién es el autor?");
            String autor = sc.nextLine();
            System.out.println("¿Cuál es el tema del artículo?");
            String tema = sc.nextLine();
            System.out.println("¿En qué fecha se publicó el artículo? (dd/mm/yyyy)");
            String ingreso = sc.nextLine();
            String[] x = ingreso.split("/");
            int[] t = new int[3];
            for (int i = 0; i < x.length - 1; i++) {
                t[i] = Integer.parseInt(x[i]);
            }
            Date fecha = new Date(t[2] - 1900, t[1], t[0]);
            System.out.println("¿El artículo está disponible en linea? (1. Sí, 2. No)");
            int acceso = sc.nextInt();
            sc.nextLine();
            boolean accesoEnLinea;
            if (acceso == 1) {
                accesoEnLinea = true;
            }else{
                accesoEnLinea = false;
            }
            Articulos nuevoArticulo = new Articulos(titulo, autor, tema, fecha, accesoEnLinea);
            recursos.add(nuevoArticulo);
            
        }else if(tipo.equals("Cursos en linea")){
            System.out.println("¿Cuál es el título del curso?");
            String titulo = sc.nextLine();
            System.out.println("¿Quién es el instructor del curso?");
            String instructor = sc.nextLine();
            System.out.println("¿Cuál es la duración del curso en semanas?");
            int duracion = sc.nextInt();
            sc.nextLine();
            System.out.println("¿En qué plataforma se impartió el curso?");
            String plataforma = sc.nextLine();
            CursosEnLinea nuevoCursoEnLinea = new CursosEnLinea(titulo, instructor, duracion, plataforma);
            recursos.add(nuevoCursoEnLinea);
            
        }else if(tipo.equals("Conferencias virtuales")){
            System.out.println("¿Cuál es el título de la conferencia?");
            String titulo = sc.nextLine();
            System.out.println("¿Quién fue el conferencista?");
            String conferencista = sc.nextLine();
            System.out.println("¿En qué fecha se llevó a cabo la conferencia? (dd/mm/yyyy)");
            String ingreso = sc.nextLine();
            String[] x = ingreso.split("/");
            int[] t = new int[3];
            for (int i = 0; i < x.length - 1; i++) {
                t[i] = Integer.parseInt(x[i]);
            }
            Date fecha = new Date(t[2] - 1900, t[1], t[0]);
            System.out.println("¿Qué duración tuvo la conferencia?");
            int duracion = sc.nextInt();
            sc.nextLine();
            System.out.println("Ingrese el enlace de la conferencia:");
            String enlace = sc.nextLine();
            ConferenciasVirtuales nuevaConferencia = new ConferenciasVirtuales(titulo, conferencista, fecha, duracion, enlace);
            recursos.add(nuevaConferencia);
        }
        
    }

    private static void EliminarRecurso(String tipo, ArrayList lista) {
        System.out.println("¿Qué título desea eliminar?");
        String seleccion = sc.nextLine();
        
        if (tipo.equals("Libros")) {
            for (int i = 0; i < lista.size(); i++) {
                if (lista.get(i) instanceof Libro) {
                    if (((Libro) lista.get(i)).getTitulo().equalsIgnoreCase(seleccion)) {
                        lista.remove(i);
                    }
                }
            }
            System.out.println("El libro " + seleccion + " ha sido eliminado.");
            
        }else if(tipo.equals("Articulos")){
            
            for (int i = 0; i < lista.size(); i++) {
                if (lista.get(i) instanceof Articulos) {
                    if (((Articulos) lista.get(i)).getTitulo().equalsIgnoreCase(seleccion)) {
                        lista.remove(i);
                    }
                }
            }
            System.out.println("El articulo " + seleccion + " ha sido eliminado.");
            
        }else if(tipo.equals("Cursos en linea")){
            for (int i = 0; i < lista.size(); i++) {
                if (lista.get(i) instanceof CursosEnLinea) {
                    if (((CursosEnLinea) lista.get(i)).getTitulo().equalsIgnoreCase(seleccion)) {
                        lista.remove(i);
                    }
                }
            }
            System.out.println("El curso en linea " + seleccion + " ha sido eliminado.");
            
        }else if(tipo.equals("Conferencias virtuales")){
            for (int i = 0; i < lista.size(); i++) {
                if (lista.get(i) instanceof ConferenciasVirtuales) {
                    if (((ConferenciasVirtuales) lista.get(i)).getTitulo().equalsIgnoreCase(seleccion)) {
                        lista.remove(i);
                    }
                }
            }
            System.out.println("La conferencia virtual " + seleccion + " ha sido eliminado.");
        }
    }
    
}
