/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.uvpalmira.fpoe.modelo;

import co.edu.uvpalmira.fpoe.jpalib.AbstractEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;

/**
 *
 * @author jucat
 */

@Entity
@NamedQueries({
    @NamedQuery(name = "Docente.buscarPorNuip",
            query = "SELECT d from Docente d WHERE d.nuip = :nuip")
})


public class Docente extends AbstractEntity {
    
    @Column(nullable=false, unique=true, length = 100)
    private String profesion;
    
    @Column(nullable=false, unique=true, length=12)
    private short nuip;
    
    @Column(nullable=false, unique=false)
    private String nombres;
    
    @Column(nullable=false, unique=false)
    private String apellidos;
    
    @Column(nullable=false)
    private String genero;
    
    
    //Constructor Vacio

    public Docente() {
    }

    public Docente(String profesion, short nuip, String nombres, String apellidos, String genero) {
        this.profesion = profesion;
        this.nuip = nuip;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.genero = genero;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public short getNuip() {
        return nuip;
    }

    public void setNuip(short nuip) {
        this.nuip = nuip;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
    
    
    
    
           
    
}
