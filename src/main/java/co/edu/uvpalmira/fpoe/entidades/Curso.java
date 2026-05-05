/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.uvpalmira.fpoe.entidades;

import co.edu.uvpalmira.fpoe.jpalib.AbstractEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Sala Sistemas
 */

@Entity
public class Curso extends AbstractEntity{
    
    @Column (nullable = false)
    private short grupo;
    
    private short totalCupos;
    
    
   //asociaciónes 
   private Periodo periodo;
   
   //Un Curso es asignado a un Docente
   @ManyToOne
   private Docente docente;
   
   //Relación: muchos cursos pueden ser de una misma Asignatura
   @ManyToOne
   private Asignatura asignatura;
   
   //Asociaciones
   @OneToMany
   private List<Horario> horarios = new ArrayList<>();
   
   //Un Curso tiene puede tener varios horarios
   @OneToMany
   private List<Cupo> cupos = new ArrayList<>();

   
   //Constructor Vacio 
    public Curso() {
    }

    public Curso(short grupo, short totalCupos, Periodo periodo, Asignatura asignatura, Horario horario) {
        this.grupo = grupo;
        this.totalCupos = totalCupos;
        this.periodo = periodo;
        this.docente = docente;
        this.asignatura = asignatura;
    }
   
   

    
   
   
   
   
    
}
