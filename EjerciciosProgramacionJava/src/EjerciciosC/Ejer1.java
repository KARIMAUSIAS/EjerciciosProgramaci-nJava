package EjerciciosC;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejer1 {

    public static void imprimePositivo(int p) throws Exception {

        if (p < 0) {
            throw new Exception("ERROR: El numero no es positivo");
        }

        System.out.println(p);

    }

    public static void imprimeNegativo(int n) throws Exception {

        if (n >= 0) {
            throw new Exception("ERROR: El numero no es negativo");
        }

        System.out.println(n);

    }

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int num = 0;
        boolean numeroCorrecto;
        for (int i = 0; i < 10; i++) {
            numeroCorrecto = false;
            do {
                try {
                    System.out.println("Escribe un numero");
                    int n = lector.nextInt();
                    num = n;
                    numeroCorrecto = true;
                } catch (InputMismatchException e) {
                    System.err.println("NO ES UN NUMERO");
                    lector.nextLine();
                }
            } while (numeroCorrecto != true);

            try {
                imprimePositivo(num);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
            try {
                imprimeNegativo(num);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

    }
}
