/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package web;

import co.edu.uvpalmira.fpoe.Logica.ILogica;
import co.edu.uvpalmira.fpoe.modelo.Docente;
import jakarta.enterprise.context.SessionScoped;
import jakarta.faces.application.FacesMessage;
import jakarta.faces.context.FacesContext;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import java.io.Serializable;
import java.sql.SQLIntegrityConstraintViolationException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jucat
 */

@Named(value = "docCtrl")
@SessionScoped
public class ControladorDocente implements Serializable {
    
    private Docente docente = new Docente ("Profesor", (short)1114239159, "Antonio", "Muñoz", "Hombre");
    
    @Inject 
    private ILogica logica;
    
    public Docente getDocente(){
        return docente;
    }
    
    public List<Docente> getDocentes(){
        return this.logica.buscarDocentes();
    }
    
    public void guardar(){
       try {

            this.logica.crearDocente(this.docente);

            FacesContext.getCurrentInstance().addMessage(
                    null,
                    new FacesMessage(
                            "El docente fue guardado exitosamente"
                    )
            );

            this.docente = new Docente();

        } catch (SQLIntegrityConstraintViolationException ex) {

            FacesContext.getCurrentInstance().addMessage(
                    null,
                    new FacesMessage(
                            FacesMessage.SEVERITY_ERROR,
                            "Error de restricciones",
                            ex.getLocalizedMessage()
                    )
            );

            Logger.getLogger(Docente.class.getName())
                    .log(Level.SEVERE, null, ex);

        } catch (Exception ex) {

            FacesContext.getCurrentInstance().addMessage(
                    null,
                    new FacesMessage(
                            FacesMessage.SEVERITY_ERROR,
                            "Error no identificado. Contacte con el desarrollador",
                            ex.getLocalizedMessage()
                    )
            );

            Logger.getLogger(Docente.class.getName())
                    .log(Level.SEVERE, null, ex);
        }
    }

    //Evento de Cancelar/Borrar 
    public void cancelEventHandler() {
        this.docente = new Docente();
        FacesContext.getCurrentInstance().addMessage(null,
                new FacesMessage("Formulario borrado."));
    }
}
