package com.edusys.entity;

import java.util.Date;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author Admin
 */
public class CourseTest {
    
    public CourseTest() {
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
     * Test of toString method, of class Course.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Course instance = new Course();
        String expResult = "";
        String result = instance.toString();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCourseCode method, of class Course.
     */
    @Test
    public void testGetCourseCode() {
 
        Course instance = new Course();
        String expResult = "";
        Integer result = instance.getCourseCode();
        assertEquals(result, expResult);
         
    }

    /**
     * Test of setCourseCode method, of class Course.
     */
    @Test
    public void testSetCourseCode() {
        Course instance = new Course();
        instance.setCourseCode(10);
        Integer expected = 10;
        assertEquals(expected, instance.getCourseCode());
    }

    /**
     * Test of getTime method, of class Course.
     */
    @Test
    public void testGetTime() {
         
        Course instance = new Course();
        int expResult=0;
        int result = instance.getTime();
        assertEquals(result, expResult);
         
    }

    /**
     * Test of setTime method, of class Course.
     */
    @Test
    public void testSetTime() {
        int time=10;
        Course instance = new Course();
        instance.setTime(time);
        int expected=10;
        int result =instance.getTime();
        assertEquals(expected, result);
        
    }
     @Test
    public void testSetTimeWithNegative() {
        int time=-10;
        Course instance = new Course();
         
      assertThrows(IllegalArgumentException.class, () -> instance.setTime(time));
        
    }

    /**
     * Test of getThematicCode method, of class Course.
     */
    @Test
    public void testGetThematicCode() {
         
        Course instance = new Course();
        String expResult = "";
        String result = instance.getThematicCode();
        assertEquals(result, expResult);
    }

    /**
     * Test of setThematicCode method, of class Course.
     */
    @Test
    public void testSetThematicCode_String() {
         
        String thematicCode = "JAV01";
        Course instance = new Course();
        instance.setThematicCode(thematicCode);
        String expected ="JAV01";
        assertEquals(expected,instance.getThematicCode());
    
    }

    /**
     * Test of getStaffCode method, of class Course.
     */
    @Test
    public void testGetStaffCode() {
         
        Course instance = new Course();
        String expResult = "";
        String result = instance.getStaffCode();
        assertEquals(result, expResult);
        
    }

    /**
     * Test of setStaffCode method, of class Course.
     */
    @Test
    public void testSetStaffCode() {
         
        String staffCode = "NV01";
        Course instance = new Course();
        instance.setStaffCode(staffCode);
         String expected ="NV01";
        assertEquals(expected,instance.getStaffCode());
    }

    /**
     * Test of getNote method, of class Course.
     */
    @Test
    public void testGetNote() {
        
        Course instance = new Course();
        String expResult = "";
        String result = instance.getNote();
        assertEquals(result, expResult);
         
    }

    /**
     * Test of setNote method, of class Course.
     */
    @Test
    public void testSetNote() {
        System.out.println("setNote");
        String note = "SV01";
        Course instance = new Course();
        instance.setNote(note);
         String expected ="SV01";
        assertEquals(expected,instance.getNote());
    }

    /**
     * Test of getTuition method, of class Course.
     */
    @Test
    public void testGetTuition() {
        
        Course instance = new Course();
        double expResult = 600 ;
          instance.setTuition(expResult);
        double result = instance.getTuition();
      
        assertEquals(result, expResult);
         
    }

    /**
     * Test of setTuition method, of class Course.
     */
    @Test
    public void testSetTuition() {
         
     double tuition=600;
        Course instance = new Course();
        instance.setTuition(tuition);
        double expected=600.0;
        Double result = instance.getTuition();
        
        assertEquals(expected,result,0.0);
    }
 @Test
    public void testSetTuitionWithNegative() {
         
     double tuition=-600 ;
        Course instance = new Course();
        
           assertThrows(IllegalArgumentException.class, () -> instance.setTuition(tuition));
    }
    @Test
    public void testSetTuitionWithLarge() {
         
     double tuition=60000000000d;
        Course instance = new Course();
        
           assertThrows(IllegalArgumentException.class, () -> instance.setTuition(tuition));
    }
    

    /**
     * Test of getKhaigiang method, of class Course.
     */
    @Test
    public void testGetKhaigiang() {
       
        Course instance = new Course();
        Date expResult = new Date(2020, 10, 01);
        instance.setKhaigiang(expResult);
        Date result = instance.getKhaigiang();
        assertEquals(result, expResult);
        
    }

    /**
     * Test of setKhaigiang method, of class Course.
     */
    @Test
    public void testSetKhaigiang() {
        System.out.println("setKhaigiang");
        Date khaigiang = null;
        Course instance = new Course();
        instance.setKhaigiang(khaigiang);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNgaytaoDate method, of class Course.
     */
    @Test
    public void testGetNgaytaoDate() {
       
        Course instance = new Course();
        Date expResult = null;
        Date result = instance.getNgaytaoDate();
        assertEquals(result, expResult);
         
    }

    /**
     * Test of setNgaytaoDate method, of class Course.
     */
    @Test
    public void testSetNgaytaoDate() {
        Course instance = new Course();
        Date expResult = new Date(2020, 10, 01);
        instance.setNgaytaoDate(expResult);
        Date result = instance.getNgaytaoDate();
        assertEquals(result, expResult);
    }
    @Test
    public void testSetNgaytaoDateNull() {
        Course instance = new Course();
        Date timenull = new Date(null);
       
         assertThrows(IllegalArgumentException.class, () -> instance.setNgaytaoDate(timenull));
    }

    /**
     * Test of setTuition method, of class Course.
     */
      

    /**
     * Test of setCourseCode method, of class Course.
     */
    
    
}

