package aceptaelreto;

import java.util.Scanner;

public class holamundo {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        
        int cont = 0;
        
        int n = lector.nextInt();
        
        while (cont != n) {
            System.out.println("Hola Mundo.");
            cont++;
        }
        
    }
    
}
