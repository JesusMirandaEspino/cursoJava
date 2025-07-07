/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parte2;


import java.util.Map;
import java.util.HashMap;

/**
 *
 * @author jesus
 */
public class Mapa {
        public static void main(String[] args) {
            Map<String, String> persona = new HashMap<>();
            persona.put("nombre", "Bob");
            persona.put("Tipo", "GatoLoco");
            persona.put("Edad", "31");
            persona.put("Edad2", "31");
            persona.put("Edad", "31");
            
            persona.entrySet().forEach(System.out::println);
            
            persona.put("Edad", "35");
            persona.remove("Edad2");
            
            persona.entrySet().forEach(System.out::println);
            
            
           persona.forEach( (key, value) -> System.out.println("Clave: " + key + " Valor: " + value));
            
    }
}
