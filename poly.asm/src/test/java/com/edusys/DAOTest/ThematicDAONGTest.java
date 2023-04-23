/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package com.edusys.DAOTest;


import com.edusys.DAO.ThematicDAO;
import com.edusys.entity.Thematic;
import com.edusys.utils.JdbcHelper;
import java.util.ArrayList;
import java.util.List;
import org.mockito.ArgumentMatchers;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;


import org.testng.IObjectFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.ObjectFactory;
import org.testng.annotations.Test;
import org.hamcrest.CoreMatchers;
import org.mockito.Mockito;
import org.testng.Assert;
import static org.testng.Assert.assertEquals;



/**
 *
 * @author nongn
 */
@PrepareForTest({JdbcHelper.class, ThematicDAO.class})
public class ThematicDAONGTest {

    ThematicDAO thematicDAO;
    ThematicDAO thematicDAOSpy;

    public ThematicDAONGTest() {
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
        thematicDAO = new ThematicDAO();
        PowerMockito.mockStatic(JdbcHelper.class);
        thematicDAOSpy = PowerMockito.spy(new ThematicDAO());
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }

    /**
     * Test of insert method, of class ThematicDAO.
     */
    @Test(expectedExceptions = NullPointerException.class)
    public void testInsertWithEmptyEntity() {
        Thematic entity = new Thematic();
        ThematicDAO instance = new ThematicDAO();
        instance.insert(entity);
    }

    @Test(expectedExceptions = NullPointerException.class)
    public void testInsertWithNullEntity() {
        Thematic entity = null;
        ThematicDAO instance = new ThematicDAO();
        instance.insert(entity);
    }

    @Test
    public void testInsertWithValiEntity() {
        Thematic entity = new Thematic();
        entity.setNote("");
        entity.setTuition(Double.valueOf(20));
        entity.setThematicCode("JAV01");
        entity.setThematicName("Hoai");
        entity.setAvatar("1.jpg");
        entity.setTime(20);
        ThematicDAO instance = new ThematicDAO();
        instance.insert(entity);
    }

    /**
     * Test of update method, of class ThematicDAO.
     */
   
    @Test
    public void testUpdateWithValidEntity() {
    	ThematicDAO instance = new ThematicDAO();
        Thematic entity = new Thematic();
        entity.setNote("aaaaa");
        entity.setTuition(200.0);
        entity.setThematicCode("NNH04");
        entity.setThematicName("Hoai");
        entity.setAvatar("1.jpg");
        entity.setTime(20);
        instance.insert(entity);
        System.out.println(entity);

        entity.setThematicName("Java");
        instance.update(entity);
        Thematic updatedEntity = instance.selectById(entity.getThematicCode());
        assertEquals(updatedEntity.getThematicName(), "Java");
    }


    @Test(expectedExceptions = NullPointerException.class)
    public void testUpdateWithNullEntity() {
        Thematic entity = null;
        ThematicDAO instance = new ThematicDAO();
        instance.update(entity);
    }

    @Test(expectedExceptions = NullPointerException.class)
    public void testUpdateWithEmptyEntity() {
        Thematic entity = new Thematic();
        thematicDAO.update(entity);
    }

    /**
     * Test of delete method, of class ThematicDAO.
     */
    @Test(expectedExceptions = Exception.class)
    public void testDeleteWithValidId()  {
        Thematic entity = new Thematic();
        entity.setThematicCode("JAV01");
        entity.setThematicName("Java Programming");
        entity.setTuition(20.0);
        entity.setTime(30);
        entity.setAvatar("1.jpg");
        entity.setNote("Learn Java Programming");
        ThematicDAO instance = new ThematicDAO();
        instance.insert(entity);

        instance.delete("JAV01");
        Thematic deletedEntity = instance.selectById(entity.getThematicCode());
        
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testDeleteWithInvalidId() {
        String id = "-1";
        ThematicDAO instance = new ThematicDAO();
        instance.delete(id);
    }

    /**
     * Test of selectById method, of class ThematicDAO.
     */
    @Test
    public void testSelectById() throws Exception {
    	System.out.println("Test findID");
		String id  = "JAV01";
		
		Thematic expectedResult = new Thematic();
		List<Thematic> resultList = new ArrayList<>();
		resultList.add(expectedResult);
		
		PowerMockito.doReturn(resultList)
			.when(thematicDAOSpy, "selectBySql", ArgumentMatchers.anyString(),
					ArgumentMatchers.any());
		Thematic result = thematicDAOSpy.selectById(id);
		
    }

    /**
     * Test of selectAll method, of class ThematicDAO.
     */
    
    @Test
    public void testSelectAll() throws Exception {	
        Thematic model = new Thematic();
        List<Thematic> expectedResult = new ArrayList<>();
        expectedResult.add(model);
        PowerMockito.doReturn(expectedResult).when(thematicDAOSpy, "selectBySql", ArgumentMatchers.anyString(), ArgumentMatchers.any());
        List<Thematic> result = thematicDAOSpy.selectAll();
        assertEquals(result, expectedResult);
    }



    /**
     * Test of selectBySql method, of class ThematicDAO.
     */
    @Test
    public void testSelectBySql() {
        System.out.println("selectBySql");
        String sql = "";
        Object[] args = null;
        ThematicDAO instance = new ThematicDAO();
        List expResult = null;
        List result = instance.selectBySql(sql, args);
        assertEquals(result, expResult);

    }

}
