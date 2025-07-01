/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package introduccion_java;

/**
 *
 * @author jesus
 */
public class sentencias {
      public static void main(String[] args) {
         var edad1 = 12;
         var dia = 1;
         
         
         if(edad1 >= 18){
            System.out.println("Es mayor de edad");
         }else if(edad1 >= 13 && edad1 <= 17){
             System.out.println("No es mayor de edad, pero es adolecente");
         }
         
         else{
            System.out.println("Es un niño");
         }
         
         // Ternario
         var esMayor = ( edad1 >= 18 ) ? "Es mayor de edad" : "No es mayor de edad";
         
         
         System.out.println(esMayor);
         
         
         
         
          //Switch
          
          switch(dia){
              case 1: 
                  System.out.println("Es Lunes");
                  break;
              case 2: 
                  System.out.println("Es Martes");
                  break;
              case 3: 
                  System.out.println("Es Miercoles");
                  break;
              case 4: 
                  System.out.println("Es Jueves");
                  break;
              case 5: 
                  System.out.println("Es Viernes");
                  break;
              case 6: 
                  System.out.println("Es Sabado");
                  break;
              case 7: 
                  System.out.println("Es Domingo");
                  break;
              default:
                  System.out.println("Dia invalido");
                  break;
          }
 
    }
      
}
