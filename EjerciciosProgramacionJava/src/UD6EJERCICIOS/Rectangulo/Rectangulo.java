package UD6EJERCICIOS.Rectangulo;

public class Rectangulo {

    private int x1, y1, x2, y2;

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

        if (x2 > x1 && y2 > y1) {
            this.x1 = x1;
            this.y1 = y1;
            this.x2 = x2;
            this.y2 = y2;
        } else {
            System.err.println("ERROR");
        }

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
        if (x2 > x1) {
            this.x1 = x1;
        } else {
            System.err.println("ERROR");
        }

    }

    public void setY1(int y1) {
        if (y2 > y1) {
            this.y1 = y1;
        } else {
            System.err.println("ERROR");
        }
    }

    public void setX2(int x2) {
        this.x2 = x2;
    }

    public void setY2(int y2) {
        this.y2 = y2;
    }

    public void setX1Y1(int x1, int y1) {
        if (y2 > y1) {
            this.y1 = y1;
        } else {
            System.err.println("ERROR");
        }
        if (x2 > x1) {
            this.x1 = x1;
        } else {
            System.err.println("ERROR");
        }
    }

    public void setX2Y2(int x2, int y2) {
        this.y2 = y2;
        this.x2 = x2;
    }
    public void setAll(){
        if (y2 > y1) {
            this.y1 = y1;
        } else {
            System.err.println("ERROR y1");
        }
        if (x2 > x1) {
            this.x1 = x1;
        } else {
            System.err.println("ERROR x1");
        }
        this.y2 = y2;
        this.x2 = x2;
    }
}
