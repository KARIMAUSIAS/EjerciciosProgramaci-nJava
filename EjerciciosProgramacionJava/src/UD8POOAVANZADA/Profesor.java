package UD8POOAVANZADA;

 class Profesor extends Persona{
     
     protected double salario;
     protected String especialidad;

     public Profesor(String n, String a, String f, double salario, String especialidad){
         super(n, a, f);
         this.salario = salario;
         this.especialidad = especialidad;
     }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
     
    public String getNombre() {
        return "Profesor: " + nombre;
    }
    public void mostrar(){
        System.out.println(nombre + " " + apellidos + " " + fechaNacim + " " 
                + salario + " " + especialidad);
    }
}
