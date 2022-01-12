package UD6EJERCICIOS.Articulo;

public class Articulo {

    private String nombre;
    private double precio;
    private int IVA = 21;
    private int cuantosQuedan;

    public double getPVP() {

        double suma = (this.precio * (double) IVA) / 100;

        double total = this.precio + suma;
        return total;
    }

    public double getPVPDescuento(double p, int d) {

        double suma = (this.precio * (double) IVA) / 100;

        double total = this.precio + suma;
        total -= d;
        return total;
    }

    public boolean vender(int x) {
        if (x > this.cuantosQuedan) {
            if (this.cuantosQuedan == 0) {
                System.out.println("NO QUEDAN EXISTENCIAS");
                return false;
            } else {
                this.cuantosQuedan = this.cuantosQuedan + (this.cuantosQuedan - x);
                return false;
            }
        } else {
            this.cuantosQuedan -= x;
            return true;
        }
    }
    public boolean almacenar(int x){
        this.cuantosQuedan += x;
        return true;
    }

    public void imprimir(){
        System.out.println(this.nombre + " - Precio: " + this.precio
        + " - IVA: " + this.IVA + " - PVP: " + this.getPVP());
    }
    public Articulo(String nombre, double precio, int cuantosQuedan) {
        if (precio >= 0) {
            this.precio = precio;
        } else {
            System.err.println("ERROR, PRECIO NEGATIVO!!!!");
        }
        if (cuantosQuedan >= 0) {
            this.cuantosQuedan = cuantosQuedan;
        } else {
            System.err.println("ERROR, STOCK NEGATIVO!!!!");
        }
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getIVA() {
        return IVA;
    }

    public int getCuantos() {
        return cuantosQuedan;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(double precio) {
        if (precio >= 0) {
            this.precio = precio;
        } else {
            System.err.println("ERROR, PRECIO NEGATIVO!!!!");
        }

    }

    public void setCuantos(int cuantosQuedan) {
        if (cuantosQuedan >= 0) {
            this.cuantosQuedan = cuantosQuedan;
        } else {
            System.err.println("ERROR, STOCK NEGATIVO!!!!");
        }

    }
}
