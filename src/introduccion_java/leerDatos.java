/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package introduccion_java;

import java.util.Scanner;

/**
 *
 * @author jesus
 */
public class leerDatos {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
         System.out.println("Introduce Tu mombre");
         var nombre =  scanner.nextLine();
         System.out.println("Introduce tu edad");
         var edad =  scanner.nextInt();
         System.out.println("Introduce tu altura");
         var altura =  scanner.nextDouble();
         
         System.out.println("El nombre introducido es: " + nombre);
         System.out.println("Tu edad es: " + edad);
         System.out.println("Tu altura es: " + altura);
         
         
         // Convertir datos enteros
         System.out.println("Introduce un numero");
         var enteroAString = scanner.nextLine();
         var enterado = Integer.parseInt(enteroAString);
         System.out.println("Entero es: " + enterado);
         
         System.out.println("Introduce un numero con decimal");
         var flotaAString = scanner.nextLine();
         var enteradoFlota = Float.parseFloat(flotaAString);
         System.out.println("tu flotante es: " + enteradoFlota);
         
         
         System.out.println("Introduce el mombre del empleado");
         var nombreEmpleado =  scanner.nextLine();
         System.out.println("Introduce la edad del empleado");
         var edadEmpleado = Integer.parseInt(scanner.nextLine());
         System.out.println("Introduce el salario del empleado");
         var salarioEmpleado = Double.parseDouble(scanner.nextLine());
         System.out.println("Introduce si es jefe de departamento");
         var isJefeDepartamento = Boolean.parseBoolean(scanner.nextLine());
         
         
         System.out.println("nombre es: " + nombreEmpleado);
         System.out.println("edad es: " + edadEmpleado);
         System.out.printf("salario es: $%.2f%n",salarioEmpleado);
         System.out.println("Es jefe: " + nombreEmpleado);
    }
}
