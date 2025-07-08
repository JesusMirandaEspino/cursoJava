/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parte2.maquinaSnacks;


import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author jesus
 */
public class Snacks {
    
    private static final List<Snack> snacks;
    
    static{
        snacks = new ArrayList<>();
        snacks.add( new Snack("Papas", 70) );
        snacks.add( new Snack("Refresco", 50) );
        snacks.add( new Snack("Sandwich", 120) );
    }
    
    public static void agregarSnack(Snack snack){
        snacks.add( snack );
    }
    
    public static void mostrarSnack(){
        var inventarioSnack = "";
        
        for( var snack: snacks ){
            inventarioSnack += snack.toString() + "\n";
        }
        
        System.out.println("----Snacks en el inventario----");
        System.out.println(inventarioSnack);
        
        
    }
    
    
    public static List<Snack> getSnacks(){
        return snacks;
    }
    
}
