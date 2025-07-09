/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parte2.maquinaSnacks.archivos;

import java.util.List;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 *
 * @author jesus
 */
public class leerTodo {
    
        public static void main(String[] args) {
        var nombreArchivo = "mi_archivo.txt";

        
        try{
            List<String> lineas = Files.readAllLines(Paths.get(nombreArchivo));
            System.out.println("Contenido del archivo: ");
            for( String linea: lineas ){
                System.out.println(linea);
            }
            
        }catch(Exception e){
            System.out.println("Ha ocurrido un Error al leer el archivo: "+ e.getMessage());
            e.printStackTrace();
        }

    }
    
}
