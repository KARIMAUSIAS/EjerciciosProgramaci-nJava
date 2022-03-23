package UD9.EjerciciosB;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        File f1 = new File("Documentos/usa_nombres.txt");
        File f2 = new File("Documentos/usa_apellidos.txt");
        File f3 = new File("Documentos/usa_personas.txt");
        
        ArrayList<String> nombre = new ArrayList();
        ArrayList<String> apellidos = new ArrayList();
        
        String texto;

        try {
            // lee y guarda los nombres en un array
            Scanner lector = new Scanner(f1);
            while (lector.hasNext()) {
                texto = lector.nextLine();
                nombre.add(texto);
            }
            lector.close();
            // lee y guarda los apellidos en un array
            lector = new Scanner(f2);
            while (lector.hasNext()) {
                texto = lector.nextLine();
                apellidos.add(texto);
            }
            lector.close();
            // Crea cuantos nombres quiera el usuario
            System.out.println("¿Cuantos nombres quieres generar?");
            int cuantos = in.nextInt();
            FileWriter writer = new FileWriter(f3);
            for (int i = 0; i < cuantos; i++) {
                int random1 = (int)(Math.random()*((nombre.size()-1)+0) + 0);
                int random2 = (int)(Math.random()*((apellidos.size()-1)+0) + 0);
                writer.write(nombre.get(random1) + " " + apellidos.get(random2) + "\n");
            }
            writer.close();
            
            //leemos el file3
            lector = new Scanner(f3);
            while (lector.hasNext()) {
                texto = lector.nextLine();
                System.out.println(texto);
            }
            lector.close();
            
            
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }

}
