package UD6EJERCICIOS.Articulo;

import java.util.Scanner;

public class Articulo {

    private String nombre;
    private double precio;
    private static final int[] IVA = {21, 10, 4};
    private int cuantosQuedan;
    private int tipo;

    public double getPVP() {
        
        double suma = 0;
        switch (tipo) {
            case 1:
                suma = (this.precio * (double) IVA[0]) / 100;
                break;
            case 2:
                suma = (this.precio * (double) IVA[1]) / 100;
                break;
            case 3:
                suma = (this.precio * (double) IVA[2]) / 100;
                break;
        }

        return this.precio + suma;
    }

    public double getPVPDescuento(double p, int d) {

        return (getPVP() - d);
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

    public boolean almacenar(int x) {
        this.cuantosQuedan += x;
        return true;
    }

    public void imprimir() {
        System.out.println(this.nombre + " - Precio: " + this.precio
                + " - IVA: " + this.IVA + " - PVP: " + this.getPVP());
    }

    public Articulo(String nombre, double precio, int cuantosQuedan, int tipo) {
        setPrecio(precio);
        setCuantos(cuantosQuedan);
        setNombre(nombre);
        setTipo(tipo);
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getTipo() {
        return tipo;
    }

    public int getIVA() {
        switch (tipo) {
            case 1:
                return IVA[0];
            case 2:
                return IVA[1];
            case 3:
                return IVA[2];
        }
        return 0;
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
    public void setTipo(int tipo) {
        if (tipo > 0 && tipo < 4) {
            this.tipo = tipo;
        } else {
            System.err.println("ERROR, NO ES UN TIPO VALIDO!!!!");
        }

    }
    
}
