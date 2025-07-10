/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package parte2.maquinaSnacks.Snacks_Archivos.servicio;

import java.util.List;
import parte2.maquinaSnacks.Snacks_Archivos.dominio.Snack;

/**
 *
 * @author jesus
 */
public interface IServicesSnacks {
    void agregarSnack(Snack snack);
    
    void mostrarSnack();
    
    List<Snack> getSnacks();
    
}
