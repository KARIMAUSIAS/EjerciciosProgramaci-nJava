package UD6EJERCICIOS.Persona;


public class Persona {

    private final String dni;
    private String nombre, apellidos;
    private int edad;
    private static final int mayoriaEdad = 18;

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

    public int diferenciaEdad(Persona p) {
        int e = Math.abs(this.edad - p.edad);

        return e;
    }

    public static boolean validarDNI(String dni) {
        char[] d = dni.toCharArray();
        int cont = 0;
        for (int i = 0; i < d.length; i++) {
            if (Character.isDigit(d[i]) == true) {
                cont++;
            }
        }
        if (cont == 8) {
            return true;
        } else {
            return false;
        }
    }
    

    public void imprime() {
        System.out.println(this.nombre + " " + this.apellidos + " con DNI "
                + this.dni + " edad " + this.edad);
    }

    public Persona(String nombre, String apellidos, String dni, int edad) {

        if (Persona.validarDNI(dni) == true) {
            this.dni = dni;
        } else {
            System.err.println("DNI NO VALIDO");
            this.dni = null;
        }
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

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
