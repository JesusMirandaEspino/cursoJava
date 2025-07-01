/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package introduccion_java;

/**
 *
 * @author jesus
 */
public class cilclos {
    public static void main(String[] args) {
        var i = 1;
        while(i <= 20){
            if( i % 2 == 0 ){
                System.out.println(i);
            }
            i++;
        }
        
        
        do{
            System.out.println(i);
            i++;
        }while(i <= 40);
        
        
        for( var a = 1; a <= 10; a++ ){
            System.out.println("Desde ciclo for " + a);
        }
        
        var c = 0;
        var b = 1;
        while(b <= 5){
            c+=b;
            System.out.println(c);
            b++;
        }
        
        var l = 1;
        while(l < 10) {
            System.out.println(l + " - Hola Mundo");
            l++;
        }
        
    }
}
