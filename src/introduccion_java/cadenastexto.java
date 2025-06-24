/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package introduccion_java;

/**
 *
 * @author jesus
 */
public class cadenastexto {
    public static void main(String[] args) {
        var cadena1 = "Hola";
        var cadena2 = new String("Mundo");
        var cadena3 = cadena1 + " " + cadena2;
        var cadena4 = """
                      Este
                      es un
                      texto
                      multilinea
                      """;
        
       var cadenaJ1 = "Java";
       var cadenaJ2 = "Java";
       var cadenaJ3 = new String("Java");
        
            System.out.println(cadena1);
            System.out.println(cadena2);
            System.out.println(cadena3);
            System.out.println(cadena4);
            
            System.out.println(cadena1.charAt(0));
            System.out.println(cadena1.charAt(1));
            System.out.println(cadena1.charAt(2));
            System.out.println(cadena1.charAt(3));
            
            
            System.out.println(cadenaJ1 == cadenaJ2);
            System.out.println(cadenaJ1 == cadenaJ3);
            System.out.println(cadenaJ1.equals(cadenaJ3));
            
            
         var largoCadena = cadenaJ1.length();
         System.out.println(largoCadena);
         
         
         var cadenaRara = cadena1.replace('o', '0');
         System.out.println(cadenaRara);           
            
         
         var cadenaMayuscula = cadena1.toUpperCase();
         System.out.println(cadenaMayuscula); 
         
          var cadenaMinuscula = cadenaMayuscula.toLowerCase();
         System.out.println(cadenaMinuscula); 
         
         var cadena5 = " hola a todos  ";
          System.out.println(cadena5);
          System.out.println(cadena5.trim()); 
    }
}
