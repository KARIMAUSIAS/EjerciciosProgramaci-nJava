package UD6EJERCICIOS.Rectangulo;

public class Rectangulo {

    private int x1, y1, x2, y2;
    private static final int min = 0;
    private static final int max = 100;

    public int perimetro() {
        int lado1 = Math.abs(this.x2 - this.x1);
        int lado2 = Math.abs(this.y2 - this.y1);

        int total = lado1 + lado2;
        return total;
    }

    public int area() {
        int lado1 = Math.abs(this.x2 - this.x1);
        int lado2 = Math.abs(this.y2 - this.y1);
        int total = lado1 * lado2;

        return total;
    }

    public Rectangulo(int x1, int y1, int x2, int y2) {

        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        
        
        setX1(x1);
        setY1(y1);
        setX2(x2);
        setY2(y2);

    }

    public static Rectangulo creaRectanguloAleatorio() {
        int a = (int) (Math.random() * (100 - 0 + 0));
        int b = (int) (Math.random() * (100 - 0 + 0));
        int c = (int) (Math.random() * (100 - 0 + 0));
        int d = (int) (Math.random() * (100 - 0 + 0));

        Rectangulo r = new Rectangulo(a, b, c, d);
        return r;
    }

    public void imprimir() {
        System.out.println("Punto 1: (" + this.x1 + "," + this.y1 + ")");
        System.out.println("Punto 2: (" + this.x2 + "," + this.y2 + ")");
    }

    public int getX1() {
        return x1;
    }

    public int getY1() {
        return y1;
    }

    public int getX2() {
        return x2;
    }

    public int getY2() {
        return y2;
    }

    public void setX1(int x1) {
        if (x1 < x2 && x1 >= min && x1 <= max) {
            this.x1 = x1;
        } else {
            System.err.println("ERROR");
        }

    }

    public void setY1(int y1) {
        if (y1 < y2 && y1 >= min && y1 <= max) {
            this.y1 = y1;
        } else {
            System.err.println("ERROR");
        }

    }

    public void setX2(int x2) {
        if (x2 >= min && x2 <= max) {
            this.x2 = x2;
        } else {
            System.err.println("ERROR");
        }
    }

    public void setY2(int y2) {
        if (y2 >= min && y2 <= max) {
            this.y2 = y2;
        } else {
            System.err.println("ERROR");
        }
    }

    public void setX1Y1(int x1, int y1) {
        setX1(x1);
        setY1(y1);
    }

    public void setX2Y2(int x2, int y2) {
        setX2(x2);
        setY2(y2);
    }

    public void setAll() {
        setX1(x1);
        setY1(y1);
        setX2(x2);
        setY2(y2);
    }
}
