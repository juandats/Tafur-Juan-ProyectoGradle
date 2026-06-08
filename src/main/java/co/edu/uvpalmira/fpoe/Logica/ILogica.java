/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.uvpalmira.fpoe.Logica;

import co.edu.uvpalmira.fpoe.jpalib.NonexistentEntityException;
import co.edu.uvpalmira.fpoe.modelo.Docente;
import java.sql.SQLIntegrityConstraintViolationException;
import java.util.List;

/**
 *
 * @author jucat
 */
public interface ILogica {
    
    public void crearDocente(Docente docente) throws SQLIntegrityConstraintViolationException, Exception ;
    
    public void modificarDocente (Docente docente) throws  NonexistentEntityException, Exception;
    
    public Docente buscarDocente(short nuip);
    
    public List<Docente> buscarDocentes();
}
