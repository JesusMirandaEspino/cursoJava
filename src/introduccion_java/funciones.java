/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package introduccion_java;

/**
 *
 * @author jesus
 */
public class funciones {
    
    public static void saludar(String mensaje){
        System.out.println("Saludos, " + mensaje);
    }
    
    public static int suma(int num1,int num2){
        var  resultado = num1 + num2;
        return resultado;
        
    }
    
    
    public static void main(String[] args) {
        saludar("a todos");

        System.out.println("El resultado de la suma es: " + suma(1,2));
    }
    

    
}
