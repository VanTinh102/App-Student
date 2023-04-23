package com.edusys.DAOTest;

import com.edusys.entity.Student;
import com.edusys.utils.JdbcHelper;
import com.edusys.DAO.StudentDAO;
import java.util.ArrayList;
import java.util.List;
import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.mockito.ArgumentMatchers;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.testng.PowerMockTestCase;
import org.testng.Assert.*;
import static org.testng.Assert.*;
import org.testng.IObjectFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.ObjectFactory;
import org.testng.annotations.Test;

/**
 *
 * @author Dell
 */
@PrepareForTest({JdbcHelper.class, StudentDAO.class})
//@RunWith(PowerMockRunner.class)

public class StudentDAOTest {

    StudentDAO studentDAO;
    StudentDAO studentDAOspy;

    public StudentDAOTest() {
    }

    @ObjectFactory
    public IObjectFactory getObjectFactory() {
        return new org.powermock.modules.testng.PowerMockObjectFactory();
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
        studentDAO = new StudentDAO();
        PowerMockito.mockStatic(JdbcHelper.class);
        studentDAOspy = PowerMockito.spy(new StudentDAO());
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }

    /**
     * Test of insert method, of class StudentDAO.
     */

    @Test(expectedExceptions = Exception.class)
    public void testInsertWithNullModel() {
        Student entity = null;
        studentDAO.insert(entity);

        // TODO review the generated test code and remove the default call to fail.
    }

    @Test(expectedExceptions = Exception.class)
    public void testInsertWithEmptyModel() {
        Student entity = new Student();        
        studentDAO.insert(entity);
        // TODO review the generated test code and remove the default call to fail.
    }

    @Test
    public void testInsertWithValidModel() {
        Student entity = new Student();
        entity.setCourseCode(1);
        entity.setLearnerCode("PS01638");
        entity.setStudentCode(1052);
        entity.setPoint(6);
        StudentDAO instance = new StudentDAO();
        instance.insert(entity);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of update method, of class StudentDAO.
     */
    @Test(expectedExceptions = Exception.class)
    public void testUpdateWithNullModel() {
        Student entity = null;
        studentDAO.update(entity);
    }

    @Test(expectedExceptions = Exception.class)
    public void testUpdateWithEmptyModel() {
        Student entity = new Student();
        studentDAO.update(entity);
    }

    @Test()
    public void testUpdateWithValidModel() {
        Student entity = new Student();
        entity.setCourseCode(1);
        entity.setLearnerCode("PS01638");
        entity.setStudentCode(1052);
        entity.setPoint(6);
        studentDAO.update(entity);
    }

    /**
     * Test of selectAll method, of class StudentDAO.
     */
    @Test
    public void testSelectAll() throws Exception {
        String sql = "SELECT * ";
        Student student = new Student();
        List<Student> expResult = new ArrayList<>();
        expResult.add(student);
        PowerMockito.doReturn(expResult).when(studentDAOspy, "select", ArgumentMatchers.anyString());
        Student result = (Student) studentDAOspy.selectAll();
        Assert.assertThat(result, CoreMatchers.is(expResult));

    }

    /**
     * Test of selectBySql method, of class StudentDAO.
     */
    @Test(expectedExceptions = Exception.class)
    public void testSelectBySqlWithValidSQL() throws Exception {
        String sql = "SELECT * FROM HocVien";
        Student student = new Student();
        List<Student> expResult = new ArrayList<>();
        expResult.add(student);
        PowerMockito.doReturn(expResult).when(studentDAOspy, "select", ArgumentMatchers.anyString());
        Student result = (Student) studentDAOspy.selectBySql(sql, student);
        Assert.assertThat(result, CoreMatchers.is(expResult));
    }

    @Test(expectedExceptions = Exception.class)
    public void testSelectBySQLWithNotFoundSQL() throws Exception {
        String sql = null;
        Student student = new Student();
        List<Student> expResult = new ArrayList<>();
        expResult.add(student);
        PowerMockito.doReturn(expResult).when(studentDAOspy, "select", ArgumentMatchers.anyString());
        Student result = (Student) studentDAOspy.selectBySql(sql, student);
        Assert.assertThat(result, CoreMatchers.is(expResult));

    }

    /**
     * Test of delete method, of class StudentDAO.
     */
    @Test
    public void testDeleteWithNullId() {

        Integer id = 0;
        studentDAO.delete(id);
        // TODO review the generated test code and remove the default call to fail.
    }

    @Test(expectedExceptions = Exception.class)
    public void testDeleteWithEmptyId() {
        Integer id = null;
        studentDAO.delete(id);
        // TODO review the generated test code and remove the default call to fail.
    }

    @Test
    public void testDeleteWithValidId() {
        Integer id = 12;
        studentDAO.delete(id);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of selectById method, of class StudentDAO.
     */
    @Test(expectedExceptions = Exception.class)
    public void testSelectByIdWithValidID() throws Exception {
        System.out.println("selectById");
        Integer id = 01;
        Student expectedResult = new Student();
        List<Student> resultList = new ArrayList<>();
        resultList.add(expectedResult);
        PowerMockito.doReturn(resultList).when(studentDAOspy, "select", ArgumentMatchers.anyString(), ArgumentMatchers.any());
        Student result = studentDAOspy.selectById(id);
        Assert.assertThat(result, CoreMatchers.is(expectedResult));
    }

    @Test(expectedExceptions = Exception.class)
    public void testSelectByIdWithNotFoundID() throws Exception {
        System.out.println("selectById");
        Integer id = -1;
        Student expectedResult = null;
        List<Student> resultList = new ArrayList<>();
//        resultList.add(expectedResult);
        PowerMockito.doReturn(resultList).when(studentDAOspy, "select", ArgumentMatchers.anyString(), ArgumentMatchers.any());
        Student result = studentDAOspy.selectById(id);
        Assert.assertThat(result, CoreMatchers.is(expectedResult));
    }

    /**
     * Test of selectByCourse method, of class StudentDAO.
     */
    @Test(expectedExceptions = Exception.class)
    public void testSelectByCourse() throws Exception {
         int courseId = 2;
        Student student = new Student();
        List<Student> expResult = new ArrayList<>();
        expResult.add(student);
        PowerMockito.doReturn(expResult).when(studentDAOspy, "select", ArgumentMatchers.anyString());
        Student result = (Student) studentDAOspy.selectByCourse(courseId);
        Assert.assertThat(result, CoreMatchers.is(expResult));

    }
 @Test(expectedExceptions = Exception.class)
    public void testSelectByCourseWithNotFoundCourse() throws Exception {
         int courseId = -1;
        Student student = new Student();
        List<Student> expResult = new ArrayList<>();
        expResult.add(student);
        PowerMockito.doReturn(expResult).when(studentDAOspy, "select", ArgumentMatchers.anyString());
        Student result = (Student) studentDAOspy.selectByCourse(courseId);
        Assert.assertThat(result, CoreMatchers.is(expResult));

    }

    
}

