/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parte2.maquinaSnacks.Snacks_Archivos.servicio;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.List;
import java.util.ArrayList;
import parte2.maquinaSnacks.Snacks_Archivos.dominio.Snack;

/**
 *
 * @author jesus
 */
public class ServicioSnacksArchivo implements IServicesSnacks{
    private final String NOMBRE_ARCHIVO = "snacks.txt";
    private List<Snack> snacks = new ArrayList<>();
    
    
    private ServicioSnacksArchivo(){
         var archivo = new File(NOMBRE_ARCHIVO);
         var existe = false;
         
         
        try{
            existe = archivo.exists();
            if(existe){
               //this.snacks.obtenerSnacks();
            }else{
                 var salida = new PrintWriter( new FileWriter( archivo ) );
                 salida.close();
            }
            
        }catch(Exception e){
            System.out.println("Ha ocurrido un Error al crear el archivo: "+ e.getMessage());
            e.printStackTrace();
        }
        
        if(!existe) cargarSnacksIniciales();
         
    }
    
    @Override
    public void agregarSnack(Snack snack){
    }
    
    @Override
    public void mostrarSnack(){
    }
    
    @Override
    public List<Snack> getSnacks(){
    }
    
}
