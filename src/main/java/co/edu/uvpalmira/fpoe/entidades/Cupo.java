/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.uvpalmira.fpoe.entidades;

import co.edu.uvpalmira.fpoe.jpalib.AbstractEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;

/**
 *
 * @author Sala Sistemas
 */

@Entity
public class Cupo extends AbstractEntity {
    
    @Column (nullable = false)
    private short cantidad;
    
    private short disponibles;
    
    //Asociacion
    @ManyToOne
    private Programa programa;

    public Cupo(short cantidad, short disponibles, Programa programa) {
        this.cantidad = cantidad;
        this.disponibles = disponibles;
        this.programa = programa;
    }

    public short getCantidad() {
        return cantidad;
    }

    public void setCantidad(short cantidad) {
        this.cantidad = cantidad;
    }

    public short getDisponibles() {
        return disponibles;
    }

    public void setDisponibles(short disponibles) {
        this.disponibles = disponibles;
    }

    public Programa getPrograma() {
        return programa;
    }

    public void setPrograma(Programa programa) {
        this.programa = programa;
    }
    
    
    
    
    
    
}
