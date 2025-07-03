/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package introduccion_java.aritmetica;

import introduccion_java.aritmetica.Aritmetica;

/**
 *
 * @author jesus
 */
public class pruebaAritmetica {
        public static void main(String[] args) {
        System.out.println("Creacion de clase y objetos tipo persona (poo)");
        var objeto1 = new Aritmetica(10, 5); 
        objeto1.sumar();
        objeto1.restar();
        
        var objeto2 = new Aritmetica(6,9); 
        objeto2.sumar();
        objeto2.restar();
    } 
}
