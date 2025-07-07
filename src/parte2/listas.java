/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parte2;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author jesus
 */
public class listas {
        public static void main(String[] args) {
            List<String> miLista = new ArrayList<>();
            
            List<String> nombres = Arrays.asList( "Bob", "Geralt", "Jesus", "Miriam" );
            
            
            miLista.add("Lunes");
            miLista.add("Martes");
            miLista.add("Miercoles");
            miLista.add("Jueves");
            miLista.add("Viernes");
            miLista.add("Sabado");
            miLista.add("Domigo");
            
            
            for(String elemento: miLista ){
                System.out.println("Dia: " + elemento);
            }
            
            
            miLista.forEach( elemento -> {
                System.out.println("Dia: " + elemento);
            });
            
            
            miLista.forEach( System.out::println);
            
            nombres.forEach( System.out::println);
   
    }
}
