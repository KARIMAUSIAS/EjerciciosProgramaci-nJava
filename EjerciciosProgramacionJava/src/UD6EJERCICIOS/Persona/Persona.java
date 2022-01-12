package UD6EJERCICIOS.Persona;

public class Persona {

    private String dni, nombre, apellidos;
    private int edad;

    public boolean esMayorEdad() {

        if (this.edad >= 18) {
            return true;
        } else {
            return false;
        }
    }
    public boolean esJubilado() {

        if (this.edad >= 65) {
            return true;
        } else {
            return false;
        }
    }
    public int diferenciaEdad(Persona p){
        int e =Math.abs(this.edad - p.edad);
        
        return e;
    }

    public void imprime(){
        System.out.println(this.nombre + " " + this.apellidos + " con DNI " + 
                this.dni + " edad " +this.edad);
    }
    public Persona(String nombre, String apellidos, String dni, int edad) {

        this.dni = dni;
        this.apellidos = apellidos;
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad){
        this.edad = edad;
    }
    public void setDni(String dni){
        this.dni = dni;
    }
    public void setApellidos(String apellidos){
        this.apellidos = apellidos;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
}
