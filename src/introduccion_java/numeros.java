/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package introduccion_java;
import java.util.Random;

/**
 *
 * @author jesus
 */
public class numeros {
        public static void main(String[] args) {
            Random randomNumber = new Random();
            var numeroEntero = randomNumber.nextInt(10);
            var numeroFlotante = randomNumber.nextFloat();
            var numeroEntero1 = randomNumber.nextInt(10) + 1;
            
            
            var nombre = "Geralt";
            var edad = 100;
            var salario = 1000000.3521;
            
            var mensaje = String.format("Nombre es %s, Edad: %d, Salario: %.2f", nombre, edad, salario);
            var nuevo_mensaje = """
                                %nDetalle Persona:\s
                                -----------------
                                \t Nombre: %s
                                \t Edad: %d
                                \t Salario: %.2f
                                """.formatted(nombre, edad, salario);
            
            
            System.out.println("Numero aleatorio: " + numeroEntero);
            System.out.println("Numero aleatorio: " + numeroEntero1);
            System.out.println("Numero aleatorio: " + numeroFlotante);
            
            
            
            
            System.out.println(mensaje);
            System.out.printf("Nombre es %s, Edad: %d, Salario: %.2f%n", nombre, edad, salario);
            System.out.println(nuevo_mensaje);
    }
}
