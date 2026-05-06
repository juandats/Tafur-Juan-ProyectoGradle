/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.uvpalmira.fpoe.entidades;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

/**
 *
 * @author Sala Sistemas
 */

//Nota 1.0

@Entity
public class Estudiante extends Persona{
    
    
    @Column (nullable = false, unique = true)
    private short codigoEstudiante;
    
    @Column (nullable = false, unique = true)
    private Programa programa;
    
    
    //Constructor Vacio
    public Estudiante() {
    }
    
    
    public Estudiante(short codigoEstudiante, Programa programa, short nuip, String nombres, String apellidos, Genero genero) {
        super(nuip, nombres, apellidos, genero);
        this.codigoEstudiante = codigoEstudiante;
        this.programa = programa;
    }

    public short getCodigoEstudiante() {
        return codigoEstudiante;
    }

    public void setCodigoEstudiante(short codigoEstudiante) {
        this.codigoEstudiante = codigoEstudiante;
    }

    public Programa getPrograma() {
        return programa;
    }

    public void setPrograma(Programa programa) {
        this.programa = programa;
    }

   

    

    
    
    
    
    
    
}
