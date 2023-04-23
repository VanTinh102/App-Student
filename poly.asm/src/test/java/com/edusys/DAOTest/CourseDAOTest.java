package com.edusys.DAOTest;


import com.edusys.DAO.CourseDAO;
import com.edusys.entity.Course;
import com.edusys.utils.JdbcHelper;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import org.hamcrest.CoreMatchers;
import org.mockito.ArgumentMatchers;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import static org.testng.Assert.*;
import org.testng.AssertJUnit;
import org.testng.IObjectFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.ObjectFactory;
import org.testng.annotations.Test;

/**
 *
 * @author Admin
 */
@PrepareForTest({JdbcHelper.class, CourseDAO.class})
public class CourseDAOTest {
    CourseDAO courseDAO;
    CourseDAO courseDaoSpy;
    public CourseDAOTest() {
    }
    @ObjectFactory
public IObjectFactory getObjectFactory(){
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
        courseDAO = new CourseDAO();
        PowerMockito.mockStatic(JdbcHelper.class);
        courseDaoSpy = PowerMockito.spy(new CourseDAO());
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }

    @Test(expectedExceptions =  Exception.class)
    public void testInsertWithNullModel() {
        System.out.println("insert");
        Course entity = null;
        CourseDAO instance = new CourseDAO();
        instance.insert(entity);
        
    }
     @Test(expectedExceptions =  Exception.class)
    public void testInsertWithEmptyModel() {
        System.out.println("insert");
        Course entity = new Course();
        CourseDAO instance = new CourseDAO();
        instance.insert(entity);
        
    }

     @Test 
    public void testInsertWithValidModel() {
        System.out.println("insert");
        Course entity = new Course();
        entity.setNote("");
        entity.setTuition(20.0);
        entity.setCourseCode(12);
        entity.setThematicCode("1");
        entity.setStaffCode("No1");
        entity.setNgaytaoDate(new Date(0));
        entity.setKhaigiang(new Date(0));
        entity.setTime(0);
        CourseDAO instance = new CourseDAO();
        instance.insert(entity);
        
    }
    
     @Test 
    public void testInsertWithNullCourseCode() {
        System.out.println("insert");
        Course entity = new Course();
        entity.setNote("");
        entity.setTuition(20.0);
        entity.setCourseCode(12);
        entity.setThematicCode("1");
        entity.setStaffCode("No1");
        entity.setNgaytaoDate(new Date(0));
        entity.setKhaigiang(new Date(0));
        entity.setTime(0);
        CourseDAO instance = new CourseDAO();
        instance.insert(entity);
        
    }
    @Test
     public void testInsertWithNullStaffCode() {
        System.out.println("insert");
        Course entity = new Course();
        entity.setNote("");
        entity.setTuition(20.0);
        entity.setCourseCode(12);
        entity.setThematicCode("1");
        entity.setStaffCode("");
        entity.setNgaytaoDate(new Date(0));
        entity.setKhaigiang(new Date(0));
        entity.setTime(0);
        CourseDAO instance = new CourseDAO();
        instance.insert(entity);
        
    }
     @Test
      public void testInsertWithNullOpening() {
        System.out.println("insert");
        Course entity = new Course();
        entity.setNote("");
        entity.setNote("");
        entity.setTuition(20.0);
        entity.setCourseCode(12);
        entity.setThematicCode("1");
        entity.setStaffCode("No1");
        entity.setNgaytaoDate(new Date(0));
        entity.setKhaigiang(new Date(0));
        entity.setTime(230);
        CourseDAO instance = new CourseDAO();
        instance.insert(entity);
        
    }
      @Test
       public void testInsertWithNullTime() {
        System.out.println("insert");
        Course entity = new Course();
        entity.setNote("");
        entity.setTuition(20.0);
        entity.setCourseCode(12);
        entity.setThematicCode("1");
        entity.setStaffCode("No1");
        entity.setNgaytaoDate(new Date(0));
        entity.setKhaigiang(new Date(0));
        entity.setTime(0);
        CourseDAO instance = new CourseDAO();
        instance.insert(entity);
        
    }
       
       @Test
       public void testInsertWithNullDateCreate() {
        System.out.println("insert");
        Course entity = new Course();
        entity.setNote("");
        entity.setTuition(20.0);
        entity.setCourseCode(12);
        entity.setThematicCode("1");
        entity.setStaffCode("No1");
        entity.setNgaytaoDate(new Date(0));
        entity.setKhaigiang(new Date(0));
        entity.setTime(0);
        CourseDAO instance = new CourseDAO();
        instance.insert(entity);
        
    }
       
       @Test
       public void testInsertWithNullNotes() {
        System.out.println("insert");
        Course entity = new Course();
        entity.setNote("");
        entity.setTuition(20.0);
        entity.setCourseCode(12);
        entity.setThematicCode("1");
        entity.setStaffCode("No1");
        entity.setNgaytaoDate(new Date(0));
        entity.setKhaigiang(new Date(0));
        entity.setTime(0);
        CourseDAO instance = new CourseDAO();
        instance.insert(entity);
        
    }
       
       
@Test(expectedExceptions =  Exception.class)
    public void testUpdateWithNullModel() {
        System.out.println("Update");
        Course entity = null;
        CourseDAO instance = new CourseDAO();
        instance.update(entity);
        
    }
     @Test(expectedExceptions =  Exception.class)
    public void testUpdateWithEmptyModel() {
        System.out.println("update");
        Course entity = new Course();
        CourseDAO instance = new CourseDAO();
        instance.update(entity);
        
    }

     @Test 
    public void testUpdateWithValidModel() {
        System.out.println("update");
        Course entity = new Course();
        entity.setNote("");
        entity.setTuition(20.0);
        entity.setCourseCode(12);
        entity.setThematicCode("1");
        entity.setStaffCode("No1");
        entity.setNgaytaoDate(new Date(0));
        entity.setKhaigiang(new Date(0));
        entity.setTime(230);
        CourseDAO instance = new CourseDAO();
        instance.update(entity);
        
    }
        @Test(expectedExceptions = Exception.class)
    public void testDeleteNullId() {
        System.out.println("delete");
        Integer CourseCode = null;
        courseDAO.delete(CourseCode);
    }
      
    
        @Test(expectedExceptions = IllegalArgumentException.class)
    public void testDeleteWithInvalidId() {
        int id = -1;
        CourseDAO instance = new CourseDAO();
        instance.delete(id);
    }
//@Test
//public void testDeleteWithValidId(){
//    Integer CourseCode=12;
//    courseDAO.delete(CourseCode);
//}
@Test(expectedExceptions = Exception.class)
    public void testDeleteWithValidId()  {
        Course entity = new Course();
        entity.setNote("");
        entity.setTuition(20.0);
        entity.setCourseCode (12);
        entity.setThematicCode("1");
        entity.setStaffCode("No1");
        entity.setNgaytaoDate(new Date(0));
        entity.setKhaigiang(new Date(0));
        entity.setTime(0);
        CourseDAO instance = new CourseDAO();
        instance.insert(entity);
         instance.delete(12);
        Course deletedEntity = instance.selectById(entity.getCourseCode());
        
    }

     

   @Test
    public void testSelectAll() throws Exception {	
        Course model = new Course();
        List<Course> expectedResult = new ArrayList<>();
        expectedResult.add(model);
        PowerMockito.doReturn(expectedResult).when(courseDaoSpy, "selectBySql", ArgumentMatchers.anyString(), ArgumentMatchers.any());
        List<Course> result = courseDaoSpy.selectAll();
        assertEquals(result, expectedResult);
    }

    @Test
    public void testSelectBySql() {
        System.out.println("selectBySql");
        String sql = "";
        Object[] args = null;
        CourseDAO instance = new CourseDAO();
        List expResult = null;
        List result = instance.selectBySql(sql, args);
        assertEquals(result, expResult);
        fail("The test case is a prototype.");
    }
 

//    @Test
//    public void testSelectByThematic() {
//        System.out.println("selectByThematic");
//        String cd = "";
//        CourseDAO instance = new CourseDAO();
//        List expResult = null;
//        List result = instance.selectByThematic(cd);
//        assertEquals(result, expResult);
//        fail("The test case is a prototype.");
//    }
    @Test
	public void testFindByThematic() throws Exception {
		System.out.println("Test findByThematic");
		Integer thematicCode  = 01;
		
		Course expectedResult = new Course();
		List<Course> resultList = new ArrayList<>();
		resultList.add(expectedResult);
		
		PowerMockito.doReturn(resultList)
			.when(courseDaoSpy, "selectBySql", ArgumentMatchers.anyString()
					,ArgumentMatchers.any());
		Course result = courseDaoSpy.selectById(thematicCode);
		AssertJUnit.assertEquals(result, CoreMatchers.is(resultList));
	}
    //Find By 
@Test
	public void testFindByLearnerCode() throws Exception {
		System.out.println("Test findByLearnerCode");
		Integer courseCode  = 24468;
		
		Course expectedResult = new Course();
		List<Course> resultList = new ArrayList<>();
		resultList.add(expectedResult);
		
		PowerMockito.doReturn(resultList)
			.when(courseDaoSpy, "selectBySql", ArgumentMatchers.anyString()
					,ArgumentMatchers.any());
		Course result = courseDaoSpy.selectById(courseCode);
		AssertJUnit.assertEquals(result, CoreMatchers.is(resultList));
	}
    @Test
    public void testSelectYears() {
        System.out.println("selectYears");
        CourseDAO instance = new CourseDAO();
        List expResult = null;
        List result = instance.selectYears();
        assertEquals(result, expResult);
        fail("The test case is a prototype.");
    }
    
}
