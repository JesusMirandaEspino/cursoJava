/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package introduccion_java;

/**
 *
 * @author jesus
 */
public interface Traductor {
    void traducir();
    
    default void iniciarTraductor(){
        System.out.println("Iniciando Traductor...");
    }
}


class ingles implements Traductor{
    @Override
    public void traducir(){
        System.out.println("Traduzco a ingles");
    }
}



class Frances implements Traductor{
    @Override
    public void traducir(){
        System.out.println("Traduzco a Frances");
    }
    
    
    @Override
    public void iniciarTraductor(){
        System.out.println("Iniciando Traductor de Frances...");
    }
    
}


class pruebaTraductor{
    public static void main(String[] args) {
        Traductor ingles1 = new ingles();
        ingles1.iniciarTraductor();
        ingles1.traducir();
        
        Traductor frances1 = new Frances();
        frances1.iniciarTraductor();
        frances1.traducir();
        
    }
}

