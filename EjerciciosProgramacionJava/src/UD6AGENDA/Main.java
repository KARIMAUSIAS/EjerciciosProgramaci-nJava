package UD6AGENDA;


import java.util.Scanner;

public class Main {

    public static int menu() {

        System.out.println("1. Ver contactos");
        System.out.println("2. Agregar contacto.");
        System.out.println("3. Eliminar contacto.");
        System.out.println("4. Buscar por nombre.");
        System.out.println("5. Buscar por teléfono");
        System.out.println("6. Buscar por correo.");
        System.out.println("7. Búsqueda global.");
        System.out.println("8. Salir.");
        System.out.print("¿Opción? ");
        
        int opcion = pedirIntEnRango(1, 8);

        return opcion;
    }
    public static int pedirIntEnRango(int min, int max) {

        Scanner in = new Scanner(System.in);
        int valor;

        do {
            valor = in.nextInt();
            if (valor < min || valor > max) {
                System.out.println("AVISO: No válido. Debe ser entre " + min + " y " + max);
                System.out.print("Vuelve a intentarlo: ");
            }
        } while (valor < min || valor > max);

        return valor;
    }
    public static String pedirString() {
        Scanner in = new Scanner(System.in);
        return in.nextLine();
    }
        public static void main(String[] args) {

        // Variables auxiliares
        int opcion;     // opcion del menú
        String n, c, t; // nombre, correo y teléfono
        String buscar;  // término a buscar
        int pos;        // posicion
        int[] vpos;     // vector de posiciones

        Agenda agenda1 = new Agenda();
        
        // Bucle principal
        do {
            opcion = menu();

            switch (opcion) {
                case 1:
                    // Ver contactos
                    agenda1.imprimirTodos();
                    break;
                case 2:
                    // Añadir contacto
                    System.out.print("¿Nombre? ");
                    n = pedirString();
                    System.out.print("¿Teléfono? ");
                    t = pedirString();
                    System.out.print("¿Correo? ");
                    c = pedirString();
                    Contacto contacto1 = new Contacto(n, t, c);
                    agenda1.agregarContacto(contacto1);
                    break;
                case 3:
                    // Eliminar contacto
                    System.out.print("¿ID de contacto a eliminar? ");
                    pos = pedirIntEnRango(0, agenda1.getCuantos()-1);
                    agenda1.eliminarContacto(pos);
                    break;
                case 4:
                    // Buscar por nombre
                    System.out.print("¿Nombre? ");
                    buscar = pedirString();
                    vpos = buscarContactos(, buscar);
                    verContactosVector(vpos);
                    break;
                case 5:
                    // Buscar por teléfono
                    System.out.print("¿Teléfono? ");
                    buscar = pedirString();
                    vpos = buscarContactos(vt, buscar);
                    verContactosVector(vpos);
                    break;
                case 6:
                    // Buscar por correo
                    System.out.print("¿Correo? ");
                    buscar = pedirString();
                    vpos = buscarContactos(vc, buscar);
                    verContactosVector(vpos);
                    break;
                case 7:
                    // Búsqueda global
                    System.out.print("¿Término a buscar globalmente? ");
                    buscar = pedirString();
                    vpos = buscarGlobal(buscar);
                    verContactosVector(vpos);
                    break;
                case 8:
                    // Salir
                    System.out.println("¡Gracias! ¡Hasta la próxima!");
                    break;
                default:
                    System.out.println("Opción incorrecta.");
                    break;
            }

            System.out.println("");
        } while (opcion != 8);
    }

    
}
