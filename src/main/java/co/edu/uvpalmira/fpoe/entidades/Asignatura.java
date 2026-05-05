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
public class Asignatura  extends AbstractEntity{
    
    @Column (nullable = false, unique = true, length = 25)
    private short codigoAsignatura;
    
    @Column (nullable = false, unique = true, length = 100)
    private String nombres;
    
     @Column (nullable = false)
    private short creditos;
    
     @Column (nullable = false)
    private short intensidadHoraria;
     
    //Constructor Vacio

    public Asignatura() {
    }
    

    public Asignatura(short codigoAsignatura, String nombres, short creditos, short intensidadHoraria) {
        this.codigoAsignatura = codigoAsignatura;
        this.nombres = nombres;
        this.creditos = creditos;
        this.intensidadHoraria = intensidadHoraria;
    }
    
    
    
    
}
