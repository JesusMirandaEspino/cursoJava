/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package introduccion_java;

/**
 *
 * @author jesus
 */
public class poo {
    String nombre;
    String apellido;
    int edad;
    String emial;
    String telefono;
    
    void mostrarPersona(){
        var valorEnLocal = "valor1";
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Variable local: " + valorEnLocal);
    }
    
    
    
    
    public static void main(String[] args) {
        System.out.println("Creacion de clase y objetos tipo persona (poo)");
        
        var objeto1 = new poo(); 
        objeto1.nombre = "Geralt";
        objeto1.apellido = "Ponce";
        objeto1.mostrarPersona();
        
        
        var objeto2 = new poo(); 
        objeto1.nombre = "Bob";
        objeto1.apellido = "Gato";
        objeto1.mostrarPersona();

    }

}
