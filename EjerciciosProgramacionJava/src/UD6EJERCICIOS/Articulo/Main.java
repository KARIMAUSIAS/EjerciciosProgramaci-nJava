package UD6EJERCICIOS.Articulo;

public class Main {

    public static void main(String[] args) {
        
        Articulo producto1 = new Articulo("Bata", 32.5, 5, 1);
        
        System.out.println(producto1.getNombre() + " - Precio: " + producto1.getPrecio()
        + " - IVA: " + producto1.getIVA() + " - PVP: " + 
                producto1.getPVP());
        
        System.out.println(producto1.vender(6));
        
        producto1.imprimir();
    }
    

}
