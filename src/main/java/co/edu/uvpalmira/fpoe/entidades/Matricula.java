/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.uvpalmira.fpoe.entidades;


import java.time.LocalDateTime;
/**
 *
 * @author Sala Sistemas
 */

class Matricula {
    
    //Asociacion
    private Curso curso;
    
    private LocalDateTime FechaRealizada;
    private LocalDateTime FechaCancelacion;

    public Matricula(Curso curso, LocalDateTime FechaRealizada, LocalDateTime FechaCancelacion) {
        this.curso = curso;
        this.FechaRealizada = FechaRealizada;
        this.FechaCancelacion = FechaCancelacion;
    }

    public Curso getCurso() {
        return curso;
    }

    public LocalDateTime getFechaRealizada() {
        return FechaRealizada;
    }

    public LocalDateTime getFechaCancelacion() {
        return FechaCancelacion;
    }
    
    

   
    
    
    
}
