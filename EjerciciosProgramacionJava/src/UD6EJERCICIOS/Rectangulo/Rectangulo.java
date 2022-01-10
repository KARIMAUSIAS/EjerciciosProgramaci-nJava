package UD6EJERCICIOS.Rectangulo;


public class Rectangulo {

    public int x1, y1, x2, y2;
    
    public int perimetro(int lado1, int lado2){
        
        int total = lado1 + lado2;
        return total;
    }
    
    public int area(int lado1, int lado2){
        
        int total = lado1 * lado2;
        
        return total;
    }
    
}
