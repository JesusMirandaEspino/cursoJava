/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parte2;

import java.util.TreeSet;
import java.util.Set;

/**
 *
 * @author jesus
 */
public class setsDatos {
    public static void main(String[] args) {
        Set<String> conjunto = new TreeSet();
            conjunto.add("Bob");
            conjunto.add("Jesus");
            conjunto.add("Miriam");
            conjunto.add("Geralt");
            conjunto.add("Bob");
            conjunto.add("Geralt");
            conjunto.add("Miriam");
            conjunto.add("Bob2");
            
            conjunto.forEach( elemento -> {
                System.out.println("Nombre: " + elemento);
            });
        
            conjunto.forEach( System.out::println);
            
            conjunto.remove("Bob2");
            
            
            conjunto.forEach( System.out::println);
            
    }
}
