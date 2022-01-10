package UD6EJERCICIOS.Articulo;

public class Articulo {

    public String nombre;
    public double precio;
    public int IVA = 21;
    public int cuantosQuedan;
    
    public double precioConIva(double p){
        
        double suma = (p * (double)IVA) / 100;
     
        double total = p + suma;
        return total;
    }
    
}
