package UD9.EjerciciosB;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) throws FileNotFoundException, IOException {

        File f1;
        File f2 = new File("Documentos/diccionario.txt");
        Scanner lector;
        FileWriter writer;

        String texto;
        ArrayList<String> personas = new ArrayList();

        try {

            f1 = new File("Diccionario");
            f1.mkdir();

            for (int i = 'A'; i < 'Z'; i++) {
                lector = new Scanner(f2);
                String letra = Character.toString(i);
                f1 = new File("Diccionario/" + letra + ".txt");
                writer = new FileWriter(f1);
                
                while (lector.hasNext()) {
                    texto = lector.nextLine();
                    //System.out.println(texto + "\n");
                    if (texto.startsWith(letra.toLowerCase())) {
                        writer.write(texto + "\n");
                    }
                }
                
                writer.close();
                lector.close();
            }


        } catch (Exception e) {
            System.out.println("ERROR: " + e);
        }

    }

}
