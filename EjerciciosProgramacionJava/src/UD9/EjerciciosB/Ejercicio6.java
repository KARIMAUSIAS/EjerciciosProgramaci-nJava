package UD9.EjerciciosB;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) throws FileNotFoundException, IOException {

        File f1 = new File("Documentos/pi-million.txt");
        Scanner lector = new Scanner(f1);
        Scanner in = new Scanner(System.in);
        String num;

        try {

            System.out.println("Escribe un numero");
            num = in.nextLine();
            
            String pi = lector.nextLine();
            
            if (pi.contains(num)) {
                System.out.println("ESTÁ");
            }else{
                System.out.println("NO ESTÁ");
            }
            

        } catch (Exception e) {
            System.out.println("ERROR: " + e);
        }

    }

}