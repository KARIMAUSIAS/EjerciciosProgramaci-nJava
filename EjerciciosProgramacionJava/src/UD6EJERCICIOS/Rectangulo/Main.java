package UD6EJERCICIOS.Rectangulo;

public class Main {

    public static void main(String[] args) {

        Rectangulo rect1 = new Rectangulo(0,0,5,5);
        Rectangulo rect2 = new Rectangulo(7,9,2,3);

        System.out.println("Los lados del primer rectangulo son de " + Math.abs(rect1.getX1() - rect1.getX2())
                + " y " + Math.abs(rect1.getY2() - rect1.getY1()));
        
        System.out.println("Los lados del segundo rectangulo son de " + Math.abs(rect2.getX1() - rect2.getX2())
                + " y " + Math.abs(rect2.getY2() - rect2.getY1()));
        
        System.out.println("El perimetro de los rectangulos son de: " + 
                rect1.perimetro() + " y "+ rect2.perimetro());
        
        System.out.println("El area de los rectangulos son de: " + rect1.area() + " y " + rect2.area());

        rect1.imprimir();
        
        rect1.setX1(25);
    }

}
