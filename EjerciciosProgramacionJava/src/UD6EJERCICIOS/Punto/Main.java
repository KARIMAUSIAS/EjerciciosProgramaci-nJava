package UD6EJERCICIOS.Punto;

public class Main {

    public static void main(String[] args) {
        Punto p1 = new Punto(5,0);
        Punto p2 = new Punto(10,10);
        Punto p3 = new Punto(-3,7);

        System.out.println("(" + p1.getX() + "," + p1.getY() + ")");
        System.out.println("(" + p2.getX() + "," + p2.getY() + ")");
        System.out.println("(" + p3.getX() + "," + p3.getY() + ")");
        
        System.out.println(p1.distancia(p3));
        
        p1.desplaza(5, 3);
        
        p1.imprime();
        
        
        Punto p = Punto.creaPuntoAleatorio();
        
        p.imprime();
        
        
        
}

}
