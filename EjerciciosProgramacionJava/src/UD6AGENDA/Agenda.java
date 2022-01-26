package UD6AGENDA;

import java.util.Arrays;

public class Agenda {
    private Contacto[] contactos;
    private int cuantos;
    
    public Agenda(){
        contactos = new Contacto[100];
        cuantos = 0;
    }
    
    public Contacto[] getContactos() {
        return contactos;
    }
    public int getCuantos(){
        return cuantos;
    }
    public void agregarContacto(Contacto c){
        contactos[cuantos] = c;
        cuantos++;
    }
    public void eliminarContacto(int n){
        for (int i = n; i < (cuantos-1); i++) {
            contactos[i] = contactos[i+1];
        }
    }
    public void imprimirTodos(){
        for (int i = 0; i < cuantos; i++) {
            contactos[i].imprimir();
        }
    }
    public int[] buscarContacto(String[] vector, String buscar){
        int[] vpos = new int[100];
        // Nº de posiciones encontradas
        int npos = 0;
        
        // Recorremos 'vector' buscando el texto 'buscar' en sus posiciones
        // Guardaremos en 'vpos' las posiciones que contengan 'buscar'
        for (int i = 0; i < cuantos; i++) {
            if (vector[i].toUpperCase().contains(buscar.toUpperCase())) {
                vpos[npos] = i;
                npos++;
            }
        }
        
        // Reducimod el tamaño de 'vpos' al mínimo y lo devolvemos
        vpos = Arrays.copyOf(vpos, npos);
        
        return vpos;
    }
}
