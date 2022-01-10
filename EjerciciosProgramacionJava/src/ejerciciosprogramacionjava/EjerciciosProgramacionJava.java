package ejerciciosprogramacionjava;

import java.util.Scanner;

public class EjerciciosProgramacionJava {

    public static int menu() {
        Scanner lector = new Scanner(System.in);
        System.out.println("Elige una opción: ");
        System.out.println("1. Suma (A + B)\n"
                + "2. Resta (A - B)\n"
                + "3. Multiplicación (A * B)\n"
                + "4. División (A / B)\n"
                + "5. Área de un rectángulo (Base x Altura)\n"
                + "6. Área de un triángulo equilátero (Base x Altura / 2)\n"
                + "7. Área de un círculo (Pi x R²)\n"
                + "8. Seno, Coseno y Tangente (de X)\n"
                + "9. Salir.");
        int opcion = lector.nextInt();

        return opcion;
    }

    public static int pedirInt(int min, int max) {
        Scanner lector = new Scanner(System.in);
        int num;
        do {
            System.out.println("Introduce un numero entre " + min + " y " + max);
            num = lector.nextInt();
            if (num < min || num > max) {
                System.out.println("ERROR, introduce un numero valido.");
            }
        }while(num < min || num > max);
                return num;
    }

    public static void realizaOperacion(int opcion) {
        Scanner lector = new Scanner(System.in);
        switch (opcion) {
            case 1:
                suma();
                break;
            case 2:
                resta();
                break;
            case 3:
                mult();
                break;
            case 4:
                div();
                break;
            case 5:
                areaRectangulo();
                break;
            case 6:
                areaTriangulo();
                break;
            case 7:
                areaCirculo();
                break;
            case 8:
                calcSinCosTan();
                break;
            case 9:
                System.out.println("Adios");
                break;
        }
    }

    public static void suma() {
        Scanner lector = new Scanner(System.in);
        System.out.println("Numero 1: ");
        int num1 = lector.nextInt();
        System.out.println("Numero 2: ");
        int num2 = lector.nextInt();
        System.out.println(num1 + num2);
    }

    public static void resta() {
        Scanner lector = new Scanner(System.in);
        System.out.println("Numero 1: ");
        int num1 = lector.nextInt();
        System.out.println("Numero 2: ");
        int num2 = lector.nextInt();
        System.out.println(num1 - num2);
    }

    public static void mult() {
        Scanner lector = new Scanner(System.in);
        System.out.println("Numero 1: ");
        int num1 = lector.nextInt();
        System.out.println("Numero 2: ");
        int num2 = lector.nextInt();
        System.out.println(num1 * num2);
    }

    public static void div() {
        Scanner lector = new Scanner(System.in);
        System.out.println("Numero 1: ");
        int num1 = lector.nextInt();
        System.out.println("Numero 2: ");
        int num2 = lector.nextInt();
        System.out.println(num1 / num2);
    }
    public static void areaRectangulo(){
        System.out.println("Escribe la base del rectangulo:");
        int base = pedirInt(0, 1000000);
        System.out.println("Escribe la altura del rectangulo:");
        int altura = pedirInt(0, 1000000);
        System.out.println(base * altura);
    }
    public static void areaTriangulo(){
        System.out.println("Escribe la base del rectangulo:");
        int base = pedirInt(0, 1000000);
        System.out.println("Escribe la altura del rectangulo:");
        int altura = pedirInt(0, 1000000);
        System.out.println((base * altura) / 2);
    }
    public static void areaCirculo(){
        System.out.println("Escribe el radio del circulo:");
        int radio = pedirInt(0, 1000000);
        System.out.println((radio * radio) * 3.14);
    }
    public static void calcSinCosTan(){
        System.out.println("Escribe un numero:");
        double x = pedirInt(-360, 360);
        System.out.println(Math.sin(x) + " Seno");
        System.out.println(Math.cos(x) + " Coseno");
        System.out.println(Math.tan(x) + " Tangente");
    }
    

    public static void main(String[] args) {
        int opcion;
        do {
            opcion = menu();
            realizaOperacion(opcion);
            System.out.println("");
        } while (opcion != 9);
    }

}
