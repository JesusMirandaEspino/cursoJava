/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parte2.maquinaSnacks.Snacks_Archivos.servicio;

import java.io.File;
import java.io.PrintWriter;
import java.util.List;
import java.util.ArrayList;
import parte2.maquinaSnacks.Snacks_Archivos.dominio.Snack;
import java.io.FileWriter;
import java.nio.file.Files;
import java.nio.file.Paths;


/**
 *
 * @author jesus
 */
public class ServicioSnacksArchivo implements IServicesSnacks{
    private final String NOMBRE_ARCHIVO = "snacks.txt";
    private List<Snack> snacks = new ArrayList<>();
    
    
    public ServicioSnacksArchivo(){
         var archivo = new File(NOMBRE_ARCHIVO);
         var existe = false;
         
         
        try{
            existe = archivo.exists();
            if(existe){
               this.snacks = this.obtenerSnacks();
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
    
    public void cargarSnacksIniciales(){
        this.agregarSnack( new Snack("Papas", 70.0) );
        this.agregarSnack( new Snack("Soda", 50.0) );
        this.agregarSnack( new Snack("Sandwich", 120.0) );
    }
    
    @Override
    public void agregarSnack(Snack snack){
        this.snacks.add(snack);
        
        this.agregarSnackArchivo(snack);
        
    }
    
    private void agregarSnackArchivo(Snack snack){
        
        boolean anexar = false;
        var archivo = new File(NOMBRE_ARCHIVO);

        try{
            anexar = archivo.exists();
            var salida = new PrintWriter( new FileWriter( archivo, anexar ) );
            salida.println(snack.escribirSnack());
            salida.close();
            
        }catch(Exception e){
            System.out.println("Ha ocurrido un Error al escribir el archivo: "+ e.getMessage());
            e.printStackTrace();
        }
        
    }
    
    
    private List<Snack> obtenerSnacks(){
        var snacks = new ArrayList<Snack>();
        
        
        try{
            List<String> lineas = Files.readAllLines(Paths.get(NOMBRE_ARCHIVO));
            
            for( String linea: lineas ){
                String[] lineaSnack =  linea.split(",");
                var idSnack = lineaSnack[0];
                var nombre = lineaSnack[1];
                var precio =  Double.parseDouble(lineaSnack[2]);
                
                var snack = new Snack( nombre, precio );
                snacks.add(snack);
            }
            
        }catch(Exception e){
            System.out.println("Ha ocurrido un Error al leer el archivo: "+ e.getMessage());
            e.printStackTrace();
        }
        
        return snacks;
    
    }
    
    
    @Override
    public void mostrarSnack(){
        
        System.out.println("----Snacks en el inventario----");
        var inventarioSnack = "";
        
        for( var snack: this.snacks ){
            inventarioSnack += snack.toString() + "\n";
        }
        
        
        System.out.println(inventarioSnack);
        
    }
    
    @Override
    public List<Snack> getSnacks(){
        return this.snacks;
    }
    
}
