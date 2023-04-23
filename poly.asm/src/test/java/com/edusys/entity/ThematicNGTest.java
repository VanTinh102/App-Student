/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package com.edusys.entity;

import org.powermock.core.classloader.annotations.PrepareForTest;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author nongn
 */
public class ThematicNGTest {

    public ThematicNGTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }

    /**
     * Test of toString method, of class Thematic.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Thematic instance = new Thematic();
        String expResult = "";
        String result = instance.toString();
        assertEquals(result, expResult);

    }

    /**
     * Test of getThematicCode method, of class Thematic.
     */
    @Test
    public void testGetThematicCode() {
        System.out.println("getThematicCode");
        Thematic instance = new Thematic();
        String expResult = "";
        String result = instance.getThematicCode();
        assertEquals(result, expResult);
    }

    /**
     * Test of getThematicName method, of class Thematic.
     */
    @Test
    public void testGetThematicName() {
        System.out.println("getThematicName");
        Thematic instance = new Thematic();
        String expResult = "";
        String result = instance.getThematicName();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAvatar method, of class Thematic.
     */
    @Test
    public void testGetAvatar() {
        System.out.println("getAvatar");
        Thematic instance = new Thematic();
        String expResult = "";
        String result = instance.getAvatar();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNote method, of class Thematic.
     */
    @Test
    public void testGetNote() {
        System.out.println("getNote");
        Thematic instance = new Thematic();
        String expResult = "";
        String result = instance.getNote();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTuition method, of class Thematic.
     */
    @Test
    public void testGetTuition() {
        System.out.println("getTuition");
        Thematic instance = new Thematic();
        Double expResult = 0.0;
        Double result = instance.getTuition();
        assertEquals(result, expResult, 0.0);

    }

    /**
     * Test of getTime method, of class Thematic.
     */
    @Test
    public void testGetTime() {
        System.out.println("getTime");
        Thematic instance = new Thematic();
        Integer expResult = null;
        Integer result = instance.getTime();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setThematicCode method, of class Thematic.
     */
    @Test
    public void testSetThematicCode() {
        String maCD = "JAV01";
        Thematic instance = new Thematic();
        instance.setThematicCode(maCD);
        String expResult = "JAV01";
        String result = instance.getThematicCode();
        assertEquals(result, expResult);
    }

    /**
     * Test of getThematicName method, of class Thematic.
     */
    @Test
    public void testSetThematicName() {
        String name = "java beants";
        Thematic instance = new Thematic();
        instance.setThematicName(name);
        String expResult = "java beants";
        String result = instance.getThematicName();
        assertEquals(result, expResult);

    }

    /**
     * Test of getAvatar method, of class Thematic.
     */
    @Test
    public void testSetAvatar() {
        String hinh = "image.jpg";
        Thematic instance = new Thematic();
        instance.setAvatar(hinh);
        String expResult = "image.jpg";
        String result = instance.getAvatar();
        assertEquals(result, expResult);

    }

    /**
     * Test of getNote method, of class Thematic.
     */
    @Test
    public void testSetNote() {
        System.out.println("getNote");
        String note = "";
        Thematic instance = new Thematic();
        instance.setNote(note);
        String expResult = "";
        String result = instance.getNote();
        assertEquals(result, expResult);

    }

    /**
     * Test of setTuition method, of class Thematic.
     */
    @Test
    public void testSetTuition() {
        System.out.println("setTuition");
        Double tuition = 300.0;
        Thematic instance = new Thematic();
        instance.setTuition(tuition);
        Double expected = 300.0;
        Double result = instance.getTuition();
        assertEquals(expected, result, 0.0);
    }

    @Test
    public void testSetTuitionWithNegative() {
        System.out.println("setTuition");
        double tuition = -300.0;
        Thematic instance = new Thematic();
        assertThrows(IllegalArgumentException.class, () -> instance.setTuition(tuition));
    }

    /**
     * Test of setTime method, of class Thematic.
     */
    @Test
    public void testSetTime() {
        System.out.println("setTime");
        int time = -100;
        Thematic instance = new Thematic();
        assertThrows(IllegalArgumentException.class, () -> instance.setTime(time));
       
    }

}
