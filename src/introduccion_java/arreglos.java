/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package introduccion_java;

/**
 *
 * @author jesus
 */
public class arreglos {
     public static void main(String[] args) {
         int[] arreglos= new int[3];
         var numeros = new int[9];
         int[] arreglos2= {1,2,3,4,5,6,7,8,9};
         var numeros = new int[9];
         
         arreglos[0] = 2;
         arreglos[1] = 4;
         arreglos[2] = 6;

  
         for(var i = 0; i < arreglos2.length; i++ ){
             System.out.println( arreglos2[i]);
             numeros[i] = (i + 1) * 10;
             System.out.println( numeros[i]);
         }
         
         
    }
}
