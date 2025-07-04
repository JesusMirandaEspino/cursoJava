/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parte2.listaExepciones;

/**
 *
 * @author jesus
 */
public class ExcepcionesAritmetica {
    public static int division( int numerador,  int denominador ) throws Exception {
        
        if(denominador == 0)
            throw new Exception("Division entre cero");
        
        return numerador / denominador;
        
    }
}
