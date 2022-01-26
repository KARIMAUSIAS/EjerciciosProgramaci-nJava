package UD6AGENDA;

public class Contacto {

    private String nombre, telefono, correo;

   public Contacto(String nombre, String telefono, String correo){
       
       setNombre(nombre);
       setTelefono(telefono);
       setCorreo(correo);
   } 
   //SETTERS
   public void setNombre(String nombre){
       this.nombre = nombre;
   }
   public void setTelefono(String telefono){
       this.telefono = telefono;
   }
   public void setCorreo(String correo){
       this.correo = correo;
   }
   //GETTERS
   public String getNombre(){
       return nombre;
   }
   public String getTelefono(){
       return telefono;
   }
   public String getCorreo(){
       return correo;
   }
   
   //OTROS METODOS
   
   public void imprimir(){
       System.out.println(getAll());
   }
   public String getAll(){
       return "Nombre contacto: " + nombre + " telefono: " + telefono 
       + " correo: " + correo;
   }
   
}
