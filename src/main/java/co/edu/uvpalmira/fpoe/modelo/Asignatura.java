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
 * @author Sala Sistemas
 */

@Entity
@NamedQueries({
    @NamedQuery(name = "Asignatura.buscarPorCodigo", 
            query = "SELECT a from Asignatura a WHERE a.codigoAsignatura = :codigoAsignatura"),
    
    @NamedQuery(name = "Asignatura.buscarPorEscuela", 
            query = "Select a From Asignatura a WHERE a.codigoAsignatura LIKE :prefijo")
})
public class Asignatura extends AbstractEntity{
    
    @Column (nullable = false, unique = true, length = 10)
    private String codigoAsignatura;
    
    @Column (nullable = false, unique = false, length = 7100)
    private String nombres;
    
     @Column (nullable = false)
    private byte creditos;
    
     @Column (nullable = false)
    private byte intensidadHoraria;
     
    //Constructor Vacio

    public Asignatura() {
    }
    

    public Asignatura(String codigoAsignatura, String nombres, byte creditos,  byte intensidadHoraria) {
        this.codigoAsignatura = codigoAsignatura;
        this.nombres = nombres;
        this.creditos = creditos;
        this.intensidadHoraria = intensidadHoraria;
    }

    public String getCodigoAsignatura() {
        return codigoAsignatura;
    }

    public void setCodigoAsignatura(String codigoAsignatura) {
        this.codigoAsignatura = codigoAsignatura;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public short getCreditos() {
        return creditos;
    }

    public void setCreditos(byte creditos) {
        this.creditos = creditos;
    }

    public short getIntensidadHoraria() {
        return intensidadHoraria;
    }

    public void setIntensidadHoraria(byte intensidadHoraria) {
        this.intensidadHoraria = intensidadHoraria;
    }
    
    
    
    
    
    
}
