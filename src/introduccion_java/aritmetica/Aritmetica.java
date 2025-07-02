/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package introduccion_java.aritmetica;

/**
 *
 * @author jesus
 */
public class Aritmetica {
    
    private int operando1;
    private int operando2;
    
    public Aritmetica(){

    }
    
    public Aritmetica(int operando1, int operando2){
        this.operando1 = operando1;
        this.operando2 = operando2;
    }
    
    public void sumar(){
        var suma = this.operando1 + this.operando2;
         System.out.println("Suma: " + suma);
    }
    
    
    public void restar(){
        var resta = this.operando1 - this.operando2;
         System.out.println("Resta: " + resta);
    }
    
   public int getOperando1(){
       return this.operando1;
   }

   public void setOperando1(int operando1){
       this.operando1 = operando1;
   }
   
   public int getOperando2(){
       return this.operando2;
   }

   public void setOperando2(int operando2){
       this.operando2 = operando2;
   } 
   
}
