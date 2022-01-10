package UD6EJERCICIOS.Persona;

public class Persona {

    public String dni;
    public String nombre;
    public String apellidos;
    public int edad;
    
    public void MayorEdad(int e){
        
        if (e >= 18) {
            System.out.println("es mayor de edad");
        }else{
            System.out.println("no es mayor de edad");
        }
}
    
}
