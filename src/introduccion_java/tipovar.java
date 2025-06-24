/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package introduccion_java;

/**
 *
 * @author jesus
 */
public class tipovar {
            public static void main(String[] args) {
            // Variables
            int edad2 = 36;
            var edad = 35;
            
            Double precio2 = 35.65;
            var precio = 35.65;
            
            String nombre2 = "Jesus";
            var nombre = "Jesus";
            
            boolean disponible2 = true;
            var disponible = true;
            
            char genero2 = 'F';
            var genero = 'M';
            
            
            var apellido = "Miranda";
            
            System.out.println(edad + " " + edad2);
            System.out.println(precio + " " + precio2);
            System.out.println(nombre + " " + nombre2);
            System.out.println(disponible + " " + disponible2);
            System.out.println(genero + " " + genero2);
            
            edad2 = 25;
            System.out.println(edad2);
            
            
            System.out.println(nombre + " " + apellido);
                    
            
    }
}
