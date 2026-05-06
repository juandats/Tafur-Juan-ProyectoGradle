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
public class Programa extends AbstractEntity{
    
    @Column (nullable = false)
    private short codigo;
    
    @Column (nullable = false)
    private String nombre;
    
    //Asociaciones
    private Cupo cupo;
    private Estudiante estudiante;

    
    //Constructor Vacio para funcionamiento del JPA
    public Programa() {
    }
    

    public Programa(short codigo, String nombre, Cupo cupo, Estudiante estudiante) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.cupo = cupo;
        this.estudiante = estudiante;
    }

    public short getCodigo() {
        return codigo;
    }

    public void setCodigo(short codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Cupo getCupo() {
        return cupo;
    }

    public void setCupo(Cupo cupo) {
        this.cupo = cupo;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    
   
   
}
