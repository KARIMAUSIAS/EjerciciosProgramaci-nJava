package UD9.EjerciciosB;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ejercicio3 {
    
    public static void main(String[] args) throws FileNotFoundException, IOException{
        
        File f1 = new File("Documentos/usa_personas.txt");
        File f2 = new File("Documentos/usa_personas_sorted.txt");
        String texto;
        ArrayList<String> personas = new ArrayList();
        
        try {
            
            // Leer y cargamos en ArrayList
            Scanner lector = new Scanner(f1);
            while (lector.hasNext()) {
                texto = lector.nextLine();
                personas.add(texto);
            }
            lector.close();
            
            // ordenamos
            Collections.sort(personas);
            
            // escribimos en fichero
            FileWriter writer = new FileWriter(f2);
            for (int i = 0; i < personas.size(); i++) {
                writer.write(personas.get(i) + "\n");
            }
            writer.close();
            
            // comprobamos si esta bien
            Scanner lector2 = new Scanner(f2);
            while (lector2.hasNext()) {
                texto = lector2.nextLine();
                System.out.println(texto);
            }
            lector2.close();
            
        } catch (Exception e) {
            System.out.println("ERROR: " + e);
        }
        
    }

}
