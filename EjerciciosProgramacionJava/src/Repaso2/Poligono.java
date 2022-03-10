package Repaso2;

public class Poligono {
    
    private Punto[] punto;

    public Poligono(Punto[] punto) {
        this.punto = punto;
    }
    
    public void trasladar(int x, int y){
        
        for (int i = 0; i < 10; i++) {
            punto[i].setX(punto[i].getX()+x);
            punto[i].setY(punto[i].getY()+y);
        }
        
    }
    public void escalar(int x, int y){
        
    }
    public int numVertices(){
        
        return punto.length;
    }

    public void aString(){
        
        for (int i = 0; i < punto.length; i++) {
            punto[i].toString();
        }
    }
    public int perimetro(){
        int dX = 0;
        int dY = 0;
        int total = 0;
        
        for (int i = 0; i < punto.length; i +=2) {
            dX = 0;
            dY = 0;
            if (i == punto.length) {
                
            }else{
                dX = punto[i+1].getX() - punto[i].getX();
                dY = punto[i+1].getY() - punto[i].getY();
                dX *= dX;
                dY *= dY;
                total = dX + dY;
            }
        }
        
        return 0;
    }

}
