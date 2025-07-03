/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package introduccion_java.claseabstrata;

/**
 *
 * @author jesus
 */
public class claseabstrata {
    public static void main(String[] args) {
        FiguraGeometrica nuevaFigura = new Rectangulo();
        nuevaFigura.dibujar();
        
        FiguraGeometrica nuevaFigura1 = new Circulo();
        nuevaFigura1.dibujar();
        
    }
}



    abstract class FiguraGeometrica{
        public abstract void dibujar();
    }
    
    
    class Rectangulo extends FiguraGeometrica{
        @Override
        public void dibujar(){
             System.out.println("Se como dibujar un rectangulo");

        }
    }



    class Circulo extends FiguraGeometrica{
        public void dibujar(){
             System.out.println("Se como dibujar un circulo");

        }
    }
