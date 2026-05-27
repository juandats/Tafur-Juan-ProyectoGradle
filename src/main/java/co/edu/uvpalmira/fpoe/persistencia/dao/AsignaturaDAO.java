/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.uvpalmira.fpoe.persistencia.dao;

import co.edu.uvpalmira.fpoe.modelo.Asignatura;
import co.edu.uvpalmira.fpoe.jpalib.AbstractDAO;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;


/**
 *
 * @author Sala Sistemas
 */
public class AsignaturaDAO extends AbstractDAO<Asignatura> {

    public AsignaturaDAO(EntityManagerFactory emf) {
        super(Asignatura.class, emf);
    }

    public Asignatura buscarPorCodigo(String codigoAsignatura) {

        EntityManager em = super.getEntityManager();
        return (Asignatura) em.createNamedQuery("Asignatura.buscarPorCodigo")
                .setParameter("codigoAsignatura", codigoAsignatura)
                .getSingleResult();
    }

    public <List> Asignatura buscarPorEscuela(String codigoEscuela) {

        EntityManager em = super.getEntityManager();
        return (Asignatura) em.createNamedQuery("Asignatura.buscarPorEscuela")
                .setParameter("prefijo", codigoEscuela)
                .getResultList();
    }

}
