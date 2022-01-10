package UD6EJERCICIOS.Persona;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner lector = new Scanner(System.in);
        
        Persona p1 = new Persona();
        Persona p2 = new Persona();
        
        System.out.println("Persona 1");
        p1.dni = lector.nextLine();
        p1.nombre = lector.nextLine();
        p1.apellidos = lector.nextLine();
        p1.edad = lector.nextInt();
        
        lector.nextLine();
        
        System.out.println("Persona 2");
        p2.dni = lector.nextLine();
        p2.nombre = lector.nextLine();
        p2.apellidos = lector.nextLine();
        p2.edad = lector.nextInt();
        
        System.out.print(p1.nombre + " " + p1.apellidos + " con DNI " + 
                p1.dni + " ");
        p1.MayorEdad(p1.edad);
        
        System.out.print(p2.nombre + " " + p2.apellidos + " con DNI " + 
                p2.dni + " ");
        p2.MayorEdad(p2.edad);
        
    }
    
}
