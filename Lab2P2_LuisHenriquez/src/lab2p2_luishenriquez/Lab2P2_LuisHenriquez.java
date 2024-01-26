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
        
        do {
            System.out.println("Ingrese su nombre de usuario:");
            String nombreUsuario = sc.nextLine();
            
            System.out.println("¿Qué desea realizar?\n"
                    + "1. Listar recursos \n"
                    + "2. Agregar recursos\n"
                    + "3. Eliminar recursos\n"
                    + "4. Modificar recursos\n"
                    + "5. Salir\n");
            op = sc.nextInt();
            sc.nextLine();
            switch (op) {
                case 1:
                    ListarRecursos();
                    break;
                case 2:
                    
                    
                    break;
                case 3:
                    
                    break;
                case 4:
                    
                    break;
                case 5:
                    
                    break;
                default:
                    System.out.println("Opción invalida, intente otra vez.");
            }
        } while (op != 5);
    }

    private static void ListarRecursos() {
        String impresion = "";
        for (int i = 0; i < recursos.size(); i++) {
            impresion += (i + 1) + ". " + recursos.get(i) + ".\n";
        }
        System.out.println(impresion);
    }
    
}
