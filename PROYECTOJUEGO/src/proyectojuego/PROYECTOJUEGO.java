package proyectojuego;

import java.util.Random;
import java.util.Scanner;

public class PROYECTOJUEGO {

    public static int[] cartas = new int[52];
    public static int[] fila1 = new int[13];
    public static int[] fila2 = new int[13];
    public static int[] fila3 = new int[13];
    public static int[] fila4 = new int[13];
    public static int[] fila5 = new int[13];
    public static int[] fila6 = new int[13];
    public static int[] fila7 = new int[13];
    public static int[] pila = new int[24];
    public static int[] monton1 = new int[13];
    public static int[] monton2 = new int[13];
    public static int[] monton3 = new int[13];
    public static int[] monton4 = new int[13];
    public static int primera = 1, segunda = 2, tercera = 3, cuarta = 4,
            quinta = 5, sexta = 6, septima = 7, cont1 = 0, cont2 = 1, cont3 = 2,
            cont4 = 3, cont5 = 4, cont6 = 5, cont7 = 6, cuentaPila = 0, m1 = 0, m2 = 0,
            m3 = 0, m4 = 0;

    public static int menu() {
        Scanner lector = new Scanner(System.in);
        System.out.println("Elige una opción: ");
        System.out.println("1. Mostrar Tablero \n"
                + "2. Mover carta a fila \n"
                + "3. Mover carta a monton \n"
                + "4. Sacar carta de la pila \n"
                + "5. Dejar de jugar");
        int opcion = lector.nextInt();

        return opcion;
    }

    public static void realizaAccion(int opcion) {
        switch (opcion) {
            case 1:
                mostrarTablero();
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                sacarCartaPila();
                break;
            case 5:
                System.out.println("Adios");
                break;
        }
    }

    public static void prepararCartas() {
        for (int i = 0; i < cartas.length; i++) {
            cartas[i] = i + 1;
        }
        for (int i = 0; i < monton1.length; i++) {
            monton1[i] = i + 1;
            monton2[i] = i + 1;
            monton3[i] = i + 1;
            monton4[i] = i + 1;
        }
    }

    public static void barajar() {
        Random r = new Random();
        for (int i = 0; i < cartas.length; i++) {
            int posAleatoria = r.nextInt(cartas.length);
            int temp = cartas[i];
            cartas[i] = cartas[posAleatoria];
            cartas[posAleatoria] = temp;
        }
    }

    public static void colocarEnTablero() {
        int cont = 0;
        for (int i = 0; i < primera; i++) {
            fila1[i] = cartas[cont];
            cont++;
        }
        for (int i = 0; i < segunda; i++) {
            fila2[i] = cartas[cont];
            cont++;
        }
        for (int i = 0; i < tercera; i++) {
            fila3[i] = cartas[cont];
            cont++;
        }
        for (int i = 0; i < cuarta; i++) {
            fila4[i] = cartas[cont];
            cont++;
        }
        for (int i = 0; i < quinta; i++) {
            fila5[i] = cartas[cont];
            cont++;
        }
        for (int i = 0; i < sexta; i++) {
            fila6[i] = cartas[cont];
            cont++;
        }
        for (int i = 0; i < septima; i++) {
            fila7[i] = cartas[cont];
            cont++;
        }
        for (int i = 0; i < pila.length; i++) {
            pila[i] = cartas[cont];
            cont++;
        }
    }

    public static void mostrarTablero() {
        System.out.print("Fila 1: ");
        for (int i = cont1; i < primera; i++) {
            System.out.print(fila1[i] + " ");
        }
        System.out.println("");
        System.out.print("Fila 2: ");
        for (int i = 0; i < segunda; i++) {
            if (i >= cont2) {
                System.out.print(fila2[i] + " ");
            } else {
                System.out.print("* ");
            }
        }
        System.out.println("");
        System.out.print("Fila 3: ");
        for (int i = 0; i < tercera; i++) {
            if (i >= cont3) {
                System.out.print(fila3[i] + " ");
            } else {
                System.out.print("* ");
            }
        }
        System.out.println("");
        System.out.print("Fila 4: ");
        for (int i = 0; i < cuarta; i++) {
            if (i >= cont4) {
                System.out.print(fila4[i] + " ");
            } else {
                System.out.print("* ");
            }
        }
        System.out.println("");
        System.out.print("Fila 5: ");
        for (int i = 0; i < quinta; i++) {
            if (i >= cont5) {
                System.out.print(fila5[i] + " ");
            } else {
                System.out.print("* ");
            }
        }
        System.out.println("");
        System.out.print("Fila 6: ");
        for (int i = 0; i < sexta; i++) {
            if (i >= cont6) {
                System.out.print(fila6[i] + " ");
            } else {
                System.out.print("* ");
            }
        }
        System.out.println("");
        System.out.print("Fila 7: ");
        for (int i = 0; i < septima; i++) {
            if (i >= cont7) {
                System.out.print(fila7[i] + " ");
            } else {
                System.out.print("* ");
            }
        }
        System.out.println("");
        System.out.print("Pila: ");
        for (int i = 0; i < cuentaPila; i++) {
            System.out.print(pila[i] + " ");
        }
        System.out.println("");
        System.out.print("Monton 1: ");
        for (int i = 0; i < m1; i++) {
            System.out.println(monton1[i] + " ");
        }
        System.out.println("");
        System.out.print("Monton 2: ");
        for (int i = 0; i < m2; i++) {
            System.out.println(monton2[i] + " ");
        }
        System.out.println("");
        System.out.print("Monton 3: ");
        for (int i = 0; i < m3; i++) {
            System.out.println(monton3[i] + " ");
        }
        System.out.println("");
        System.out.print("Monton 4: ");
        for (int i = 0; i < m4; i++) {
            System.out.print(monton4[i] + " ");
        }
        System.out.println("");
    }

    public static void sacarCartaPila() {
        if (cuentaPila == 24) {
            cuentaPila = 0;
        }
        cuentaPila++;
    }

    public static void elegirCarta() {
        Scanner lector = new Scanner(System.in);
        System.out.println("De donde quieres coger la carta: ");
        System.out.println("1. De una fila \n"
                + "2. De la pila");
        int elegir = lector.nextInt();
        switch (elegir) {
            case 1:
                System.out.println("De que fila: ");
                int fila = lector.nextInt();
                switch (fila) {
                    case 1:
                        
                        break;
                    case 2:
                        
                        break;
                    case 3:
                        
                        break;
                    case 4:
                        
                        break;
                    case 5:
                        
                        break;
                    case 6:
                        
                        break;
                    case 7:
                        
                        break;

                }
                break;
            case 2:
                
                break;
        }
    }

    public static void moverCartaMonton(int carta) {
        Scanner lector = new Scanner(System.in);
        System.out.println("A que montón quieres moverla: ");
        int monton = lector.nextInt();

        switch (monton) {
            case 1:
                if (monton1[m1] == carta) {
                    m1++;
                }
                break;
        }
    }

    public static void main(String[] args) {

        prepararCartas();
        barajar();
        colocarEnTablero();
        int opcion;
        do {
            opcion = menu();
            realizaAccion(opcion);
            System.out.println("");
        } while (opcion != 5);

    }

}
