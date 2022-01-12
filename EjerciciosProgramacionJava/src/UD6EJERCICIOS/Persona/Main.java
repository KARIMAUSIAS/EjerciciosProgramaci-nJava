package UD6EJERCICIOS.Persona;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner lector = new Scanner(System.in);
        
        Persona p1 = new Persona("Karim", "Rezgaoui Mourad", "123456X", 21);
        Persona p2 = new Persona("Kevin", "Blanco", "534533D", 17);
        
        
        
        System.out.println(p1.getNombre() + " " + p1.getApellidos() + " con DNI " + 
                p1.getDni() + " " + p1.esMayorEdad() + " " + p1.esJubilado());
        
        System.out.println(p2.getNombre() + " " + p2.getApellidos() + " con DNI " + 
                p2.getDni() + " " + p1.esMayorEdad() + " " + p1.esJubilado());
        
        p1.imprime();
        
        
    }
    
}
