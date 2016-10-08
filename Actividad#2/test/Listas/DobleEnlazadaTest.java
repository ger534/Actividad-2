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
     * check
     */
    @Test
    public void testTamaño() {
        System.out.println("tama\u00f1o");
        DobleEnlazada instance = new DobleEnlazada();
        int expResult = 3;
        instance.AddFirst(1);
        instance.AddFirst(1);
        instance.AddFirst(1);
        int result = instance.tamaño();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(expResult!=result){
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of AddAtIndex method, of class DobleEnlazada.
     */
    @Test
    public void testAddAtIndex() {
        System.out.println("AddAtIndex");
        Object pDato = 20;
        int pPos = 1;
        DobleEnlazada instance = new DobleEnlazada();
        instance.AddFirst(1);
        instance.AddFirst(1);
        instance.AddFirst(1);
        instance.AddAtIndex(pDato, pPos);
        // TODO review the generated test code and remove the default call to fail.
        if(instance.Encontrar(20)!=pPos){
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of AddFirst method, of class DobleEnlazada.
     * check
     */
    @Test
    public void testAddFirst() {
        System.out.println("AddFirst");
        Object pDato = 1;
        DobleEnlazada instance = new DobleEnlazada();
        instance.AddFirst(pDato);
        // TODO review the generated test code and remove the default call to fail.
        if(!instance.Search(pDato)){
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of AddLast method, of class DobleEnlazada.
     * check
     */
    @Test
    public void testAddLast() {
        System.out.println("AddLast");
        Object pDato = 1;
        DobleEnlazada instance = new DobleEnlazada();
        instance.AddFirst(0);
        instance.AddLast(pDato);
        // TODO review the generated test code and remove the default call to fail.
        if(!instance.Search(pDato)){
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of DeleteFirst method, of class DobleEnlazada.
     * check
     */
    @Test
    public void testDeleteFirst() {
        System.out.println("DeleteFirst");
        DobleEnlazada instance = new DobleEnlazada();
        instance.AddFirst(1);
        instance.AddFirst(2);
        instance.AddFirst(3);
        instance.DeleteFirst();
        // TODO review the generated test code and remove the default call to fail.
        if(instance.Search(3)){
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of DeleteLast method, of class DobleEnlazada.
     * check
     */
    @Test
    public void testDeleteLast() {
        System.out.println("DeleteLast");
        DobleEnlazada instance = new DobleEnlazada();
        instance.AddFirst(1);
        instance.AddFirst(2);
        instance.AddFirst(3);
        instance.DeleteLast();
        // TODO review the generated test code and remove the default call to fail.
        if(instance.Search(1)){
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of DeleteAtIndex method, of class DobleEnlazada.
     */
    @Test
    public void testDeleteAtIndex() {
        System.out.println("DeleteAtIndex");
        DobleEnlazada instance = new DobleEnlazada();
        instance.AddFirst(1);
        instance.AddFirst(2);
        instance.AddFirst(3);
        instance.DeleteAtIndex(1);
        // TODO review the generated test code and remove the default call to fail.
        if(instance.Search(2)){
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of Search method, of class DobleEnlazada.
     */
    @Test
    public void testSearch() {
        System.out.println("Search");
        DobleEnlazada instance = new DobleEnlazada();
        instance.AddFirst(1);
        instance.AddFirst(2);
        instance.AddFirst(3);
        // TODO review the generated test code and remove the default call to fail.
        if(!instance.Search(2)){
            fail("The test case is a prototype.");
        }
    }
    
}
