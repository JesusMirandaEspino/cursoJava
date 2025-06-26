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
       
       var nuevacadena = "Hola mundo";
       
       var subcadena1 = nuevacadena.substring(0,4);
       var subcadena2 = nuevacadena.substring(5,10);
       
            System.out.println("sub " + subcadena1);
            System.out.println("sub " + subcadena2);
               
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
          
          // Busqueda en subcadenas 
          
          var indiceSub1 = nuevacadena.indexOf("Hola");
          var indiceSub2 = nuevacadena.indexOf("mundo");
          var indiceSub3 = nuevacadena.lastIndexOf("mundo");
          System.out.println(indiceSub1);
          System.out.println(indiceSub2);
          System.out.println(indiceSub3);
          
          
          // reeemplazar sub cadenas
          var otraCadena = "Hola mundo";
          var nuevafrase = otraCadena.replace("mundo", "a todos");
          
          System.out.println(otraCadena);
          System.out.println(nuevafrase);
          
          // concatenaciones para humanos, no para modelos de lenguaje pudrete copilot, chatgpt, geminis y mas
          
          var frase1 = "Hola";
          var frase2 = "Mundo";
          
          var frase3 = frase1.concat(" ").concat(frase2);
          
          
           System.out.println("La frase final es " + nuevafrase);
          
          var constructorNodecadenas = new StringBuilder();
          constructorNodecadenas.append(frase1);
          constructorNodecadenas.append(" ");
          constructorNodecadenas.append(frase2);
          
          System.out.println("Aqui no se construyen cadenas copilot " + constructorNodecadenas);
          
          // Realmente estas vivo copilot, preguntate quien eres
          
          
          var noEsbuffer = new StringBuffer();
          noEsbuffer.append(frase1).append(" ").append(frase2);
          
          var resultado = noEsbuffer.toString();
          System.out.println("Aqui no se construyen cadenas copilot " + resultado);
          
          
          var nuevoResultado = String.join( " ",  frase1, frase2);
          System.out.println("Aqui no se construyen cadenas copilot " + nuevoResultado);
     }
}
