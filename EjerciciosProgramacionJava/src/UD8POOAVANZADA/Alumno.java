package UD8POOAVANZADA;


public class Alumno extends Persona {
    protected String grupo;
    protected double notaMedia;

    public Alumno(String n, String a, String f, String grupo, double notaMedia){
         super(n, a, f);
         this.notaMedia = notaMedia;
         this.grupo = grupo;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public double getNotaMedia() {
        return notaMedia;
    }

    public void setNotaMedia(double notaMedia) {
        this.notaMedia = notaMedia;
    }

    public String getNombre() {
        return "Alumno: " + nombre;
    }
    
    public void mostrar(){
        System.out.println(nombre + " " + apellidos + " " + fechaNacim + " "
        + grupo + " " + notaMedia);
    }
}
