/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.uvpalmira.fpoe.entidades;


import java.time.DayOfWeek;
import java.time.LocalTime;

/**
 *
 * @author Sala Sistemas
 */

//Nota 1.0

public class Horario {
    
    private LocalTime Hora_Inicio;
    private LocalTime Hora_Finalizacion;
    
    private DayOfWeek dayOfWeek;

    public Horario(LocalTime Hora_Inicio, LocalTime Hora_Finalizacion, DayOfWeek dayOfWeek) {
        this.Hora_Inicio = Hora_Inicio;
        this.Hora_Finalizacion = Hora_Finalizacion;
        this.dayOfWeek = dayOfWeek;
    }

    
    
            
    
}
