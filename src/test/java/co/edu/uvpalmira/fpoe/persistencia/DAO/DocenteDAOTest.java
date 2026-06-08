/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package co.edu.uvpalmira.fpoe.persistencia.DAO;

import co.edu.uvpalmira.fpoe.modelo.Docente;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jucat
 */
public class DocenteDAOTest {
    
    private DocenteDAO docenteDAO;
    private short nuip;
    
    public DocenteDAOTest() {
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("DocentePU");
        this.docenteDAO = new DocenteDAO(emf);
        
        
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Test
    public void test(){
        
        try{
            System.out.print("Insertar");
            Docente doc = new Docente("Profesor", (short)1114239159, "Antonio", "Velez", "Hombre");
            docenteDAO.create(doc);
            this.nuip = doc.getNuip();
            System.out.println(this.nuip);
            
        } catch (Exception ex){
            Logger.getLogger(DocenteDAOTest.class.getName()).log(Level.SEVERE, null, ex);
            fail();
        }
        
        
    }

    /**
     * Test of buscarPorNuip method, of class DocenteDAO.
     *
    @Test
    public void testBuscarPorNuip() {
        System.out.println("buscarPorNuip");
        short nuip = 0;
        DocenteDAO instance = null;
        Docente expResult = null;
        Docente result = instance.buscarPorNuip(nuip);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    */
}
