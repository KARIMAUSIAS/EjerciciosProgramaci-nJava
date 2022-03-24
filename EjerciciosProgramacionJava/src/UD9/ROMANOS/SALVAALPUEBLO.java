
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class SALVAALPUEBLO {

    public static void main(String[] args) {

        ArrayList<String> cifrado = new ArrayList();
        char[] abc;
        Scanner in = new Scanner(System.in);
        char[] cifrLetras;
        int cod = 13, pos = 0;

        String texto = " ", cifr = "";
        String otro = "";

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
            
            System.out.println("Escribe el codigo.");
            cod = in.nextInt();
            
            // LEEMOS LA CARTA CIFRADA Y CREAMOS UN DOCUMENTO DONDE 
            // GUARDAMEROS EL RESULTADO DESCIFRADO
            // ADEMAS DE GUARDAR LA CARTA CIFRADA EN CHARS
            File f = new File("carta-cifrada.txt");
            FileWriter res = new FileWriter("resultado.txt");
            Scanner lector = new Scanner(f);
            while (lector.hasNext()) {
                texto = texto + lector.nextLine();
            }
            lector.close();
            System.out.println(texto);
            
            cifrLetras = texto.toCharArray();

            
            // DESCIFRAMOS LA CARTA CON EL CODIGO QUE SE NOS DA 
            for (int i = 0; i < cifrLetras.length; i++) {

                for (int j = 0; j < abc.length; j++) {
                    if (cifrLetras[i] == abc[j]) {
                        pos = j;
                    }
                }
                for (int j = 1; j <= cod; j++) {
                    pos--;
                    if (pos == -1) {
                        pos = 25;
                    }
                }
                if (cifrLetras[i]>=65 && cifrLetras[i]<=90) {
                    cifrLetras[i] = abc[pos];
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
