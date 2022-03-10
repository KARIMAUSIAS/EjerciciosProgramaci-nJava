package EjerciciosC;


public class Ejer2 {
    
    public static void enviarMensaje(String correo) throws Exception{
        int posArroba;
        if (correo.contains("@")) {
            throw new Exception("No tiene el @");
        }
        posArroba = correo.indexOf("@");
        int posPunto = correo.indexOf(".");
        
    }

    public static void main(String[] args) {
        
        
        
    }
}
