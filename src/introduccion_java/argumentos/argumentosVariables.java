/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package introduccion_java.argumentos;

/**
 *
 * @author jesus
 */
public class argumentosVariables {
    public static void main(String[] args) {
        imprimirVariosParametros("Bob",1,2,3,4,5,6,7,9 );
    }
    
    static void imprimirVariosParametros(String nombre, int... numeros){
        
        System.out.println("Nombre: " + nombre);
        imprimirNumeros(numeros);
    }
    
    
    static void imprimirNumeros(int... numeros){
        for( int num : numeros ){
            System.out.println( num);
        }
    }
}
