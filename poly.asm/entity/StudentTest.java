package com.edusys.entity;

import static com.microsoft.sqlserver.jdbc.Geography.point;
import static com.sun.source.util.DocTrees.instance;
import static com.sun.source.util.JavacTask.instance;
import static com.sun.source.util.Trees.instance;

import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author Dell
 */
public class StudentTest {

    public StudentTest() {
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

    @Test
    public void testGetStudentCode() {
        Student instance = new Student();
        int expResult = 0;
        int result = instance.getStudentCode();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of setStudentCode method, of class Student.
     */
    @Test(expectedExceptions = Exception.class)
    public void testSetStudentCodeWithNegative() {
        System.out.println("getStudentCode");
        int studentCode = -11;
        Student instance = new Student();
        instance.setStudentCode(studentCode);
        // TODO review the generated test code and remove the default call to fail.
    }

    @Test(expectedExceptions = Exception.class)
    public void testSetStudentCodeWithZero() {
        System.out.println("getStudentCode");
        int studentCode = 0;
        Student instance = new Student();
        instance.setStudentCode(studentCode);
        // TODO review the generated test code and remove the default call to fail.
    }

    @Test
    public void testSetStudentCodeWithValid() {
        System.out.println("getStudentCode");
        int studentCode = 11;
        Student instance = new Student();
        instance.setStudentCode(studentCode);
        // TODO review the generated test code and remove the default call to fail.
        int actual = instance.getStudentCode();
        assertEquals(actual, studentCode);
    }

    /**
     * Test of getCourseCode method, of class Student.
     */
    @Test
    public void testGetCourseCode() {
        System.out.println("getCourseCode");
        Student instance = new Student();
        int expResult = 0;
        int result = instance.getCourseCode();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setCourseCode method, of class Student.
     */
    @Test(expectedExceptions = Exception.class)
    public void testSetCourseCodeWithNegative() {
        System.out.println("getStudentCode");
        int courseCode = -11;
        Student instance = new Student();
        instance.setCourseCode(courseCode);
        // TODO review the generated test code and remove the default call to fail.
    }

    @Test(expectedExceptions = Exception.class)
    public void testSetCourseCodeWithZero() {
        System.out.println("getStudentCode");
        int courseCode = 0;
        Student instance = new Student();
        instance.setCourseCode(courseCode);
        // TODO review the generated test code and remove the default call to fail.
    }

    @Test
    public void testSetCourseCodeWithValid() {
        System.out.println("getStudentCode");
        int courseCode = 11;
        Student instance = new Student();
        instance.setStudentCode(courseCode);
        // TODO review the generated test code and remove the default call to fail.
        int actual = instance.getStudentCode();
        assertEquals(actual, courseCode);
    }

    /**
     * Test of getLearnerCode method, of class Student.
     */
    @Test
    public void testGetLearnerCode() {
        System.out.println("getLearnerCode");
        Student instance = new Student();
        String expResult = null;
        String result = instance.getLearnerCode();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of setLearnerCode method, of class Student.
     */
    @Test
    public void testSetLearnerCode() {
        System.out.println("setLearnerCode");
        String learnerCode = "PS01638";
        Student instance = new Student();
        instance.setLearnerCode(learnerCode);

        // TODO review the generated test code and remove the default call to fail.
    }

    @Test(expectedExceptions = Exception.class)
    public void testSetLearnerCodeWithNegative() {
        System.out.println("getStudentCode");
        String learnerCode = "-PS01638";
        Student instance = new Student();
        instance.setLearnerCode(learnerCode);
        // TODO review the generated test code and remove the default call to fail.
    }

    @Test(expectedExceptions = Exception.class)
    public void testSetLearnerCodeWithZero() {
        System.out.println("getStudentCode");
        String learnerCode = null;
        Student instance = new Student();
        instance.setLearnerCode(learnerCode);
        // TODO review the generated test code and remove the default call to fail.
    }

    @Test
    public void testSetLearnerCodeWithValid() {
        System.out.println("getStudentCode");
        String learnerCode = "PS01638";
        Student instance = new Student();
        instance.setLearnerCode(learnerCode);
        // TODO review the generated test code and remove the default call to fail.
        int actual = instance.getStudentCode();
        assertEquals(actual, learnerCode);
    }

    /**
     * Test of getPoint method, of class Student.
     */
    @Test
    public void testGetPoint() {
        Student instance = new Student();
        float expResult = 0.0F;
        float result = instance.getPoint();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of setPoint method, of class Student.
     */
    @Test
    public void testSetPoint() {
        float point = 8;
        Student instance = new Student();
        instance.setPoint(point);
        // TODO review the generated test code and remove the default call to fail.
        float expected = 8;
        float result = instance.getPoint();
        assertEquals(expected, result, 0.0);
    }

    @Test
    public void testSetPointWithNegative() {
        float point = -8;
        Student instance = new Student();
        instance.setPoint(point);
    }

    @Test
    public void testSetPointWithPositive() {
        float point = 10;
        Student instance = new Student();
        instance.setPoint(point);
        float actual = instance.getPoint();

        assertEquals(actual, point);
    }

    @Test
    public void testSetPointWithZero() {
        float point = 0;
        Student instance = new Student();
        instance.setPoint(point);
        float actual = instance.getPoint();

        assertEquals(actual, point);
    }
}

