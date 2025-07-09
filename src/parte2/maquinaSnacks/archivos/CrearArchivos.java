/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parte2.maquinaSnacks.archivos;
import java.io.File;
import java.io.PrintWriter;
import java.io.FileWriter;
import java.io.IOException;


/**
 *
 * @author jesus
 */
public class CrearArchivos {
    public static void main(String[] args) {
        var nombreArchivo = "mi_archivo.txt";
        var archivo = new File(nombreArchivo);
        
        try{
            if( archivo.exists() ){
                System.out.println("El archivo ya existe");
            }else{
                var salida = new PrintWriter( new FileWriter( archivo ) );
                salida.close();
                System.out.println("Se ha creado el Archivo ");
            }
        }catch(IOException e){
            System.out.println("Ha ocurrido un Error: "+ e.getMessage());
            e.printStackTrace();
        }

    }
}
