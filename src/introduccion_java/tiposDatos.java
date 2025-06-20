/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package introduccion_java;

/**
 *
 * @author jesus
 */
public class tiposDatos {
        public static void main(String[] args) {
        byte tipoByte = 127;
        short tipoShort = 32000;
        int tipoInt = 1234567890;
        long tipoLong = 1234567890123548345L; // Letra L o l opcional
        /**  byte tipoByteInt = (byte)128; **/
        System.out.println("Dato tipo Byte = " + tipoByte);
        System.out.println("Dato tipo Short = " + tipoShort);
        System.out.println("Dato tipo Int = " + tipoInt);
        System.out.println("Dato tipo Long = " + tipoLong);
        
        // Flotantes
        float tipoFloat = 3.14F;
        double tipoDouble = 3.1415D; // letra opcional
        
        System.out.println("Dato tipo Float = " + tipoFloat);
        System.out.println("Dato tipo Double = " + tipoDouble);
        
        // character
        char tipoChar = 'M';
        
        System.out.println("Dato tipo Char = " + tipoChar);
        
        tipoChar = 65;
        
        System.out.println("Dato tipo Char = " + tipoChar);
        
        // Boolean
        
        boolean tipoBoolean = false;
        System.out.println("Dato tipo Boolean = " + tipoBoolean);
        
        //  Tipos object o tipo de referencia
        
        String nombre = null;
        System.out.println("Dato tipo String (null) = " + nombre);
        
        nombre = "Geralt Hakim";
        System.out.println("Dato tipo String (null) = " + nombre);
        
        
    }
}
