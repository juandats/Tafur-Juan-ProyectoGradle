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

@Entity 
public class Docente extends Persona {
    
    @Column(nullable = false, length = 100)
    private String profesion;
    
    
    public Docente(String profesion, short nuip, String nombres, String apellidos, Genero genero) {
        super(nuip, nombres, apellidos, genero);
        this.profesion = profesion;
    } 
}
