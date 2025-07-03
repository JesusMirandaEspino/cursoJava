/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package introduccion_java.animal;

/**
 *
 * @author jesus
 */
public class animal {
    protected void comer(){
         System.out.println("Comer varias veces al dia");
    }
    
    protected void dormir(){
         System.out.println("Dormir varias veces al dia");
    }
    
    protected void hacerSonido(){
         System.out.println("hacer sonido");
    }
    
    
    
}


    
    abstract class FiguraGeometrica{
        public abstract void dibujar();
    }


class perro extends animal{
    public void ladrar(){
        System.out.println("Ladrar");
    }
  
    @Override
    protected void dormir(){
         System.out.println("Dormir 15 horas al dia");
         super.dormir();
    }
    
    @Override
    protected void hacerSonido(){
         System.out.println("Ladrar wau");
         super.dormir();
    }
}

class gato extends animal{

    @Override
    protected void dormir(){
         System.out.println("Dormir 15 horas al dia");
         super.dormir();
    }
    
    
    @Override
    protected void hacerSonido(){
         System.out.println("Miau");
         super.dormir();
    }
    
}


class pruebaAnimal{
    
    static void imprimirSonido(animal animal){
        animal.hacerSonido();
    }
 
    public static void main(String[] args) {
        var perro1 = new perro();
        imprimirSonido(perro1);

    } 
    
}


