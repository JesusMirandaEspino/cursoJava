/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parte2.maquinaSnacks.archivos;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.FileReader;
import java.io.BufferedReader;

/**
 *
 * @author jesus
 */
public class LeerArchivo {
        public static void main(String[] args) {
        var nombreArchivo = "mi_archivo.txt";
        var archivo = new File(nombreArchivo);
        
        try{
            var entrada = new BufferedReader( new FileReader(archivo) );
            var linea = entrada.readLine();
            
            while(linea != null){
                System.out.println(linea);
                linea = entrada.readLine();
                
            }
            entrada.close();
            
        }catch(Exception e){
            System.out.println("Ha ocurrido un Error al leer el archivo: "+ e.getMessage());
            e.printStackTrace();
        }

    }
}
