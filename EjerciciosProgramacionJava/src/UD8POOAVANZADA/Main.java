package UD8POOAVANZADA;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Persona pe1 = new Persona("Karim","Rezgaoui","02/08/2001");
        Persona pe2 = new Persona("Kevin","Blanco","04/10/2003");
        Persona pe3 = new Persona("Mario","Tomas","22/07/2001");
        
        Profesor pr1 = new Profesor("Lionel","Tarazona","20/11/1970", 1200, "Programacion");
        Profesor pr2 = new Profesor("Emilio","Javaloyas","05/03/1960", 1500, "Sistemas");
        Profesor pr3 = new Profesor("Marc","Tarazon","10/02/1997", 1000, "Bases de datos");
        
        Alumno al1 = new Alumno("Carlos","Sancho","23/03/1990","3",4.5 );
        Alumno al2 = new Alumno("Carlos","Lazaro","30/09/2003","2",7.5 );
        Alumno al3 = new Alumno("Lucas","Giyori","01/01/2003","2",8 );
        
        ArrayList<Persona> personas = new ArrayList();
        
        personas.add(pe1);
        personas.add(pe2);
        personas.add(pe3);
        
        personas.add(pr1);
        personas.add(pr2);
        personas.add(pr3);
        
        personas.add(al1);
        personas.add(al2);
        personas.add(al3);
        
        for (int i = 0; i < personas.size(); i++) {
            personas.get(i).mostrar();
        }
        
        
    }
}
