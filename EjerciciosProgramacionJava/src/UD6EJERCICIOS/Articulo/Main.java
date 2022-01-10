package UD6EJERCICIOS.Articulo;

public class Main {

    public static void main(String[] args) {
        
        Articulo producto1 = new Articulo();
        
        producto1.nombre = "Bata";
        producto1.precio = 32.5;
        producto1.cuantosQuedan = 50;
        
        System.out.println(producto1.nombre + " - Precio: " + producto1.precio
        + " - IVA: " + producto1.IVA + " - PVP: " + 
                producto1.precioConIva(producto1.precio));
        
    }
    

}
