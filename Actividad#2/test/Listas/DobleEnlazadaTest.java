/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Listas;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author User
 */
public class DobleEnlazadaTest {
    
    public DobleEnlazadaTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of tamaño method, of class DobleEnlazada.
     */
    @Test
    public void testTamaño() {
        System.out.println("tama\u00f1o");
        DobleEnlazada instance = new DobleEnlazada();
        int expResult = 0;
        int result = instance.tamaño();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Retornar method, of class DobleEnlazada.
     */
    @Test
    public void testRetornar() {
        System.out.println("Retornar");
        DobleEnlazada instance = new DobleEnlazada();
        Object expResult = null;
        Object result = instance.Retornar();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Insertar method, of class DobleEnlazada.
     */
    @Test
    public void testInsertar() {
        System.out.println("Insertar");
        Object pDato = null;
        int pos = 0;
        DobleEnlazada instance = new DobleEnlazada();
        instance.Insertar(pDato, pos);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Borrar method, of class DobleEnlazada.
     */
    @Test
    public void testBorrar() {
        System.out.println("Borrar");
        int pos = 0;
        DobleEnlazada instance = new DobleEnlazada();
        Object expResult = null;
        Object result = instance.Borrar(pos);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Buscar method, of class DobleEnlazada.
     */
    @Test
    public void testBuscar() {
        System.out.println("Buscar");
        Object pDato = null;
        DobleEnlazada instance = new DobleEnlazada();
        Object expResult = null;
        Object result = instance.Buscar(pDato);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Imprimir method, of class DobleEnlazada.
     */
    @Test
    public void testImprimir() {
        System.out.println("Imprimir");
        DobleEnlazada instance = new DobleEnlazada();
        instance.Imprimir();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
