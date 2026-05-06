/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.uvpalmira.fpoe.entidades;


import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Sala Sistemas
 */

//Nota 1.0


public class Tabulado {

    private List<Matricula> Matricula = new ArrayList<>();
    
    //Asociacion
    private Estudiante estudiante;

    public Tabulado(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public List<Matricula> getMatricula() {
        return Matricula;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }
    
    
        
    
    
}
