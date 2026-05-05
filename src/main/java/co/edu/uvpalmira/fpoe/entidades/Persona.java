/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.uvpalmira.fpoe.entidades;

import co.edu.uvpalmira.fpoe.jpalib.AbstractEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;

/**
 *
 * @author Sala Sistemas
 */

@Entity
public class Persona extends AbstractEntity{
    
    @Column (nullable = false, unique = true, length = 15)
    private short nuip;
    
    @Column (nullable = false)
    private String nombres;
    
    @Column (nullable = false)
    private String apellidos;
    
    private Genero genero;
    
    
    //Constructor Vacio
    public Persona() {
    }

    public Persona(short nuip, String nombres, String apellidos, Genero genero) {
        this.nuip = nuip;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.genero = genero;
    }

    public short getNuip() {
        return nuip;
    }

    public String getNombres() {
        return nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public Genero getGenero() {
        return genero;
    }

    
    
    
}
