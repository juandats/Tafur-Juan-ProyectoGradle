/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package co.edu.uvpalmira.fpoe.entidades;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;

/**
 *
 * @author Sala Sistemas
 */


public enum Genero {
    
    @Enumerated(EnumType.STRING)
    NO_ESPECIFICADO, FEMENINO, MASCULINO;
    
}
