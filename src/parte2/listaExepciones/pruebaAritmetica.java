/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parte2.listaExepciones;

/**
 *
 * @author jesus
 */
public class pruebaAritmetica {
    public static void main(String[] args) {
        try{
            var resultado = ExcepcionesAritmetica.division(2, 0);
            System.out.println("Resultado: " + resultado);
        }catch( Exception e){
            System.out.println("Ocurrio un error:  " + e);
        } finally{
            System.out.println("Se revizo la division");
        }
        
        
    }
}
