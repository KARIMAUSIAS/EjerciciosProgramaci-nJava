package UD9.EjerciciosB;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Ejercicio7 {

    public static void main(String[] args) throws FileNotFoundException, IOException {

        File f1 = new File("Documentos/Libros/lazarillo.txt");
        Scanner lector = new Scanner(f1);
        Scanner in = new Scanner(System.in);
        String[] texto = new String[10000];
        String texto1 = "";
        

        int palabras = 0, lineas = 0, caracteres = 0;

        try {
            while (lector.hasNext()) {
                texto1 = lector.nextLine() + "\n";
                lineas++;
            }
            texto = texto1.split(" ");
            palabras = texto.length;
            System.out.println(lineas + " " + palabras);

        } catch (Exception e) {
            System.out.println("ERROR: " + e);
        }

    }

}