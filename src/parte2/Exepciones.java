/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parte2;

/**
 *
 * @author jesus
 */
public class Exepciones {
    public static void main(String[] args) {
                int valor1 = 10, valor2 = 0;
                
                try{
                    var resultado = valor1 / valor2;
                    System.out.println("Resultado: " + resultado);
                }catch( Exception e){
                    System.out.println("Ocurrio un error:  " + e);
                }    
    }
}
