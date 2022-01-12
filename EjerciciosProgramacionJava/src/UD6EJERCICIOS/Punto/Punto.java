package UD6EJERCICIOS.Punto;

public class Punto {

    private int x,y;
    
    
    public Punto(int x, int y){
        
        this.x = x;
        this.y = y;
    }
    
    public int getX(){
        
        return x;
    }
    public int getY(){
        
        return y;
    }
    
    public void setX(int x){
        
        this.x = x;
    }
    public void setY(int y){
        
        this.y = y;
    }
    
    public void imprime(){
        System.out.println("(" + this.x + "," + this.y + ")");
    }
    public void setXY(int x, int y){
        this.x = x;
        this.y = y;
    }
    public void desplaza(int dx, int dy){
        this.x += dx;
        this.y += dy;
    }
    public int distancia(Punto p){
        int d = (int) Math.sqrt(Math.pow((p.x - this.x),2) + Math.pow((p.y - this.y),2));
        
        return d;
    }
}
