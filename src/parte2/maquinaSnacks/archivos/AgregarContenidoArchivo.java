/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parte2.maquinaSnacks.archivos;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;


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
public class AgregarContenidoArchivo {
        
        public static void main(String[] args) {
        boolean anexar = false;
        var nombreArchivo = "mi_archivo.txt";
        var archivo = new File(nombreArchivo);

        
        try{
            
            anexar = archivo.exists();
            var salida = new PrintWriter( new FileWriter( archivo, anexar ) );
            var nuevoCOntenido = "Nuevo\nContenido";
            salida.println(nuevoCOntenido);
            salida.close();
            System.out.println("Se agrego contenido al archivo");
        }catch(Exception e){
            System.out.println("Ha ocurrido un Error al escribir el archivo: "+ e.getMessage());
            e.printStackTrace();
        }

    }
}
