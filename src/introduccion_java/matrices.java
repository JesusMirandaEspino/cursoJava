/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package introduccion_java;

/**
 *
 * @author jesus
 */
public class matrices {
    public static void main(String[] args) {
        final var columnas = 3;
        final var filas = 3;
        
        int[][] matriz = new int[3][3];
        
        var matriz2 = new int[][]{ 
                {11,12,13}, 
                {14,15,16}, 
                {17,18,19} 
            };
        
        matriz[0][0] = 1;
        matriz[0][1] = 2;
        matriz[0][2] = 3;
        matriz[1][0] = 4;
        matriz[1][1] = 5;
        matriz[1][2] = 6;
        matriz[2][0] = 7;
        matriz[2][1] = 8;
        matriz[2][2] = 9;
        
        for( var c = 0; c < matriz.length; c++ ){
            for( var f = 0; f < matriz[c].length; f++ ){
                System.out.println("valores colunma ["+ c + "], fila [" + f + "], :"   + matriz[c][f]);
            }
        }
        
        
        for( var c = 0; c < matriz2.length; c++ ){
            for( var f = 0; f < matriz2[c].length; f++ ){
                System.out.println("valores colunma ["+ c + "], fila [" + f + "], :"   + matriz2[c][f]);
            }
        }
        
    }
}
