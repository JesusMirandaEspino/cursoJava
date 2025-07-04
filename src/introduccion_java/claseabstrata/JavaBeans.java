/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package introduccion_java.claseabstrata;

import java.io.Serializable;

/**
 *
 * @author jesus
 */
public class JavaBeans {
        public static void main(String[] args) {
            Persona nuevaPersona = new Persona();
            
            nuevaPersona.setNombre("Geralt");
            nuevaPersona.setApellido("Pönce");
            
            nuevaPersona.toString();
    }
}


class Persona implements Serializable {
    private String nombre;
    private String apellido;
    
    
    public Persona(){}

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + '}';
    }
    
    
    
    
}
