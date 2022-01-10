package UD6EJERCICIOS.Rectangulo;

public class Main {

    public static void main(String[] args) {

        Rectangulo rect1 = new Rectangulo();
        Rectangulo rect2 = new Rectangulo();

        rect1.x1 = 0;
        rect1.y1 = 0;
        rect1.x2 = 5;
        rect1.y2 = 5;
        rect2.x1 = 7;
        rect2.y1 = 9;
        rect2.x2 = 2;
        rect2.y2 = 3;        
        

        System.out.println("Los lados del primer rectangulo son de " + Math.abs(rect1.x2 - rect1.x1)
                + " y " + Math.abs(rect1.y2 - rect1.y1));
        
        System.out.println("Los lados del segundo rectangulo son de " + Math.abs(rect2.x2 - rect2.x1)
                + " y " + Math.abs(rect2.y2 - rect2.y1));
        
        System.out.println("El perimetro de los rectangulos son de: " + 
                rect1.perimetro(Math.abs(rect1.x2 - rect1.x1), Math.abs(rect1.y2 - rect1.y1)) + " y "
        + rect2.perimetro(Math.abs(rect2.x2 - rect2.x1), Math.abs(rect2.y2 - rect2.y1)));
        
        System.out.println("El area de los rectangulos son de: " + 
                rect1.area(Math.abs(rect1.x2 - rect1.x1), Math.abs(rect1.y2 - rect1.y1)) + " y "
        + rect2.area(Math.abs(rect2.x2 - rect2.x1), Math.abs(rect2.y2 - rect2.y1)));

    }

}
