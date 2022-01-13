package UD6EJERCICIOS.Persona;

import java.util.Scanner;

public class Main {

    public static Persona crearPersona() {

        Scanner lector = new Scanner(System.in);
        System.out.println("Introduzca sus datos");
        String nombre = lector.nextLine();
        String apellidos = lector.nextLine();
        String dni = lector.nextLine();
        int edad = lector.nextInt();

        Persona p = new Persona(nombre, apellidos, dni, edad);
        return p;
    }

    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);

        Persona p1 = crearPersona();
        Persona p2 = crearPersona();

        System.out.println(p1.getNombre() + " " + p1.getApellidos() + " con DNI "
                + p1.getDni() + " " + p1.esMayorEdad() + " " + p1.esJubilado());

        System.out.println(p2.getNombre() + " " + p2.getApellidos() + " con DNI "
                + p2.getDni() + " " + p1.esMayorEdad() + " " + p1.esJubilado());

        p1.imprime();

    }

}
