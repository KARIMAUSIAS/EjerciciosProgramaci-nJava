package UD9.ROMANOS;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class DESCIFRAR_CODIGO {

    public static void main(String[] args) {

        char[] abc, abcMin;
        Scanner in = new Scanner(System.in);
        char[] cifrLetras;
        char[] cifrLetras1;
        ArrayList<Integer> cuantos = new ArrayList();
        int cod, pos = 0, cont;

        String texto = "", texto1 = "", cifr = "";
        String otro = "", desc;

        try {
            // LEEMOS EL ABECEDARIO PARA USARLO MAS TARDE Y 
            //LO ALMACENAMOS EN UN VECTOR DE CHARS
            File f1 = new File("Documentos/abecedario.txt");
            Scanner s1 = new Scanner(f1);
            while (s1.hasNext()) {
                otro = otro + s1.nextLine();
            }
            s1.close();
            abc = otro.toCharArray();

            otro = "";
            
            f1 = new File("abcMin.txt");
            Scanner s2 = new Scanner(f1);
            while (s2.hasNext()) {
                otro = otro + s2.nextLine();
            }
            s2.close();
            abcMin = otro.toCharArray();


            System.out.println("Escribe el documento a descifrar");
            desc = in.nextLine();

            // LEEMOS LA CARTA CIFRADA Y CREAMOS UN DOCUMENTO DONDE 
            // GUARDAMEROS EL RESULTADO DESCIFRADO
            // ADEMAS DE GUARDAR LA CARTA CIFRADA EN CHARS
            File f = new File(desc);
            FileWriter res = new FileWriter("resultado.txt");
            Scanner lector = new Scanner(f);
            while (lector.hasNext()) {
                texto = texto + lector.nextLine() + "\n";
            }
            lector.close();
            
            //AQUI DESCIFRAMOS LA CLAVE DEL DOCUMENTO PARA PODER DESCIFRARLO
            texto1 = texto.toUpperCase();
            
            cifrLetras1 = texto1.toCharArray();
            cifrLetras = texto.toCharArray();

            for (int i = 0; i < abc.length; i++) {
                cont = 0;
                for (int j = 0; j < cifrLetras1.length; j++) {
                    if (cifrLetras1[j] == abc[i]) {
                        cont++;
                    }
                }
                cuantos.add(cont);
            }
            int max = cuantos.get(0);
            for (int i = 0; i < cuantos.size(); i++) {
                if (cuantos.get(i) > max) {
                    max = cuantos.get(i);
                    pos = i;
                }   
            }
            
            cod = abc[pos] - abc[0];
            System.out.println("La clave es: " + cod);
            pos = 0;
            
            // DESCIFRAMOS LA CARTA CON EL CODIGO QUE SE NOS DA 
            for (int i = 0; i < cifrLetras.length; i++) {

                for (int j = 0; j < abc.length; j++) {
                    if (cifrLetras[i] >= 65 && cifrLetras[i] <= 90) {
                        if (cifrLetras[i] == abc[j]) {
                            pos = j;
                        }
                    } else if (cifrLetras[i] >= 97 && cifrLetras[i] <= 122) {
                        if (cifrLetras[i] == abcMin[j]) {
                            pos = j;
                        }
                    }

                }
                for (int j = 1; j <= cod; j++) {
                    pos--;
                    if (pos == -1) {
                        pos = 25;
                    }
                }
                if (cifrLetras[i] >= 65 && cifrLetras[i] <= 90) {
                    cifrLetras[i] = abc[pos];
                } else if (cifrLetras[i] >= 97 && cifrLetras[i] <= 122) {
                    cifrLetras[i] = abcMin[pos];
                }
            }

            //GUARDAMOS LA CARTA DESCIFRADA
            for (int i = 0; i < cifrLetras.length; i++) {

                res.write(cifrLetras[i]);

            }
            res.close();
//
        } catch (Exception e) {
            System.out.println("ERROR" + e);
        }

    }

}
