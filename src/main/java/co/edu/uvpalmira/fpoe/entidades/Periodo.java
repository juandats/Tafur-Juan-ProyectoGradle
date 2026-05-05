/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.uvpalmira.fpoe.entidades;


import co.edu.uvpalmira.fpoe.jpalib.AbstractEntity;
import jakarta.persistence.Entity;
import java.time.Month;
import java.time.Year;


/**
 *
 * @author Sala Sistemas
 */

@Entity
class Periodo extends AbstractEntity{
    
    private Month MesInicio;
    private Month MesFinalizacion;
    
    private Year AñoInicio;
    private Year AñoFinalizacion;
    
    
    //Constructor Vacio
    public Periodo() {
    }
    
    
    public Periodo(Month MesInicio, Month MesFinalizacion, Year AñoInicio, Year AñoFinalizacion) {
        this.MesInicio = MesInicio;
        this.MesFinalizacion = MesFinalizacion;
        this.AñoInicio = AñoInicio;
        this.AñoFinalizacion = AñoFinalizacion;
    }
    
    
    
    
    
    
    
}
