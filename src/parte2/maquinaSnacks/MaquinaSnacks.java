/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parte2.maquinaSnacks;


import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jesus
 */
public class MaquinaSnacks {
    public static void main(String[] args) {
     maquinaSnacks();
            
    }
    
    
    public static void maquinaSnacks(){
        var salir = false;
        var consola = new Scanner(System.in);
        List<Snack> productos = new ArrayList();
        System.out.println("*** Maquina de Snacks ***");
        Snacks.mostrarSnack();
        
        while( !salir ){
        
            try{
                
                var opcion = mostrarMenu(consola);
                salir = ejecutarOpciones( opcion, consola, productos );
                
            }catch(Exception e ){
            
                System.out.println("Ocurrio un error " + e.getMessage());
            
            }
            finally{
                System.out.println(" ");
            }
        
        }
        
    }
    
    
    
    private static int mostrarMenu(Scanner consola){
        System.out.println(""" 
                           
                           Menu: 
                           1.- Comprar.
                           2.- Mostrar ticket.
                           3.- Agregar Nuevo Snack.
                           4.- Salir.
                           
                           
                           Elige una Opcion: \s""");
        
        return Integer.parseInt(consola.nextLine());
        
    }
    
    
    
    private static boolean ejecutarOpciones(int opcion, Scanner consola, List<Snack> productos ){
        var salir = false;
        
        switch(opcion){
            
            case 1 -> comprarSnack(consola, productos);
            case 2 -> mostrarTicket(productos);
            case 3 -> agregarSnacks(consola);
            case 4 -> {
                System.out.println("Regresa Pronto..");
                salir = true;
            }
        }
        
        
        return salir;
        
        
    }
    
    
    private static void comprarSnack(Scanner consola, List<Snack> productos){
        
        System.out.println("Que snack quieres comprar (id) ");
        
        var idSnack = Integer.parseInt(consola.nextLine());
        var snackEncontrado = false;
        
        for( var snack: Snacks.getSnacks() ){
            if( idSnack == snack.getIdSnack() ){
                productos.add(snack);
                System.out.println("Snack Agregado " + snack);
                snackEncontrado = true;
                break;
            }
        }
        
        if( !snackEncontrado ){
            System.out.println("Snack No encontrado Id: " + idSnack);
        }
        
    }
    
    
    
    
    private static void mostrarTicket(List<Snack> productos){
        var ticket = "*** Ticket de Venta ***";
        var total = 0.0;
        
        for( var producto:  productos){
            ticket+= "\n\t-"+ producto.getNombre() + "- $" + producto.getPrecio(); 
            total += producto.getPrecio();
        }
        System.out.println(ticket);
        System.out.println("\n\t-Total $" + total);
    
    }
    
    
    
    private static void agregarSnacks(Scanner consola){
        
        System.out.println("Nombre del Snack:  ");
        var nombre = consola.nextLine();
        System.out.println("Precio del Snack:  ");
        var precio = Double.parseDouble(consola.nextLine());
        
        Snacks.agregarSnack(new Snack(nombre, precio));
        
        
        System.out.println("El snack se ha agreado correctamente... ");
        
        
        Snacks.mostrarSnack();
    }
    
}
