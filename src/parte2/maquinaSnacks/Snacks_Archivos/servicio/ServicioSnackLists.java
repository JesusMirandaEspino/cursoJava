/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parte2.maquinaSnacks.Snacks_Archivos.servicio;


import parte2.maquinaSnacks.*;
import java.util.List;
import java.util.ArrayList;
import parte2.maquinaSnacks.Snacks_Archivos.dominio.Snack;

/**
 *
 * @author jesus
 */
public class ServicioSnackLists implements IServicesSnacks{
    
    private static final List<Snack> snacks;
    
    static{
        snacks = new ArrayList<>();
        snacks.add( new Snack("Papas", 70) );
        snacks.add( new Snack("Refresco", 50) );
        snacks.add( new Snack("Sandwich", 120) );
    }
    
    public void agregarSnack(Snack snack){
        snacks.add( snack );
    }
    
    public void mostrarSnack(){
        var inventarioSnack = "";
        
        for( var snack: snacks ){
            inventarioSnack += snack.toString() + "\n";
        }
        
        System.out.println("----Snacks en el inventario----");
        System.out.println(inventarioSnack);
        
        
    }
    
    
    public List<Snack> getSnacks(){
        return snacks;
    }
    
}
