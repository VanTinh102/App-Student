package com.edusys.DAOTest;

import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import com.edusys.DAO.LearnerDAO;
import com.edusys.DAO.ThematicDAO;
import com.edusys.entity.Learner;
import com.edusys.entity.Thematic;
import com.edusys.utils.JdbcHelper;
import com.edusys.utils.XDate;

import javassist.expr.Instanceof;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertThrows;
import static org.testng.Assert.fail;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.hamcrest.CoreMatchers;
import org.mockito.ArgumentMatchers;
import org.mockito.internal.matchers.InstanceOf;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.testng.Assert;
import org.testng.IObjectFactory;
import org.testng.TestException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.ObjectFactory;


@PrepareForTest({JdbcHelper.class, LearnerDAO.class})
public class LearnerDAOTest {
	LearnerDAO learnerDAO;
	LearnerDAO learnerDAOSpy;
	
	public LearnerDAOTest() {}
	
	
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
    	learnerDAO = new LearnerDAO();
        PowerMockito.mockStatic(JdbcHelper.class);
        learnerDAOSpy = PowerMockito.spy(new LearnerDAO());
    }
	
//	---------------------Begin Test Insert
	@Test(expectedExceptions = Exception.class)
	public void testInsertWithNullModel() {
		System.out.println("Test Insert Null");
		Learner model = null;
		LearnerDAO instance = new LearnerDAO();
		instance.insert(model);
	}
	
	@Test(expectedExceptions = Exception.class)
	public void testInsertWithEmptyModel() {
		System.out.println("Test Insert empty");
		Learner model = new Learner();
		LearnerDAO instance = new LearnerDAO();
		
		instance.insert(model);
	}
	
	@Test(expectedExceptions = Exception.class)
	public void testInsertWithEmptyLearnerCodeModel() {
		try {
			System.out.println("Test Insert Valid");
			Learner model = new Learner();
			model.setLearnerCode("");
			model.setStaffCode("T01");
			model.setName("Trương Văn Tình");
			model.setPhone("0325456574");
			model.setEmail("tinhkun102@gmail.com");
			model.setNote("Ghi chú");
			model.setDateOfBirth(XDate.toDate(model.getRegistrationDate(), "MM/dd/yyyy"));
			model.setSex(true);
			
			LearnerDAO instance = new LearnerDAO();
			instance.insert(model);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	@Test(expectedExceptions = Exception.class)
	public void testInsertWithEmptyStaffCodeModel() {
		System.out.println("Test Insert Empty StaffCode");
		Learner model = new Learner();
		model.setLearnerCode("LC01");
		model.setStaffCode("TeoNV");
		model.setName("Trương Văn Tình");
		model.setPhone("0325456574");
		model.setEmail("tinhkun102@gmail.com");
		model.setNote("Ghi chú");
		model.setDateOfBirth(XDate.toDate(model.getRegistrationDate(), "MM/dd/yyyy"));
		model.setSex(true);
		
		LearnerDAO instance = new LearnerDAO();
		instance.insert(model);
	}
	
	@Test(expectedExceptions = Exception.class)
	public void testInsertWithEmptyNameModel() {
		System.out.println("Test Insert Empty Name");
		Learner model = new Learner();
		model.setLearnerCode("LC01");
		model.setStaffCode("T01");
		model.setName("");
		model.setPhone("0325456574");
		model.setEmail("tinhkun102@gmail.com");
		model.setNote("Ghi chú");
		model.setDateOfBirth(XDate.toDate(model.getRegistrationDate(), "MM/dd/yyyy"));
		model.setSex(true);
		
		LearnerDAO instance = new LearnerDAO();
		instance.insert(model);
	}
	
	@Test(expectedExceptions = Exception.class)
	public void testInsertWithEmptyPhoneModel() {
		System.out.println("Test Insert Empty Phone");
		Learner model = new Learner();
		model.setLearnerCode("");
		model.setStaffCode("T01");
		model.setName("Trương Văn Tình");
		model.setPhone("");
		model.setEmail("tinhkun102@gmail.com");
		model.setNote("Ghi chú");
		model.setDateOfBirth(XDate.toDate(model.getRegistrationDate(), "MM/dd/yyyy"));
		model.setSex(true);
		
		LearnerDAO instance = new LearnerDAO();
		instance.insert(model);
	}
	
	@Test(expectedExceptions = Exception.class)
	public void testInsertWithEmptyEmailModel() {
		System.out.println("Test Insert Empty Email");
		Learner model = new Learner();
		model.setLearnerCode("LC01");
		model.setStaffCode("T01");
		model.setName("Trương Văn Tình");
		model.setPhone("0325456574");
		model.setEmail("");
		model.setNote("Ghi chú");
		model.setDateOfBirth(XDate.toDate(model.getRegistrationDate(), "MM/dd/yyyy"));
		model.setSex(true);
		
		LearnerDAO instance = new LearnerDAO();
		instance.insert(model);
	}
	
	@Test(expectedExceptions = Exception.class)
	public void testInsertWithEmptyNoteModel() {
		System.out.println("Test Insert Empty Note");
		Learner model = new Learner();
		model.setLearnerCode("");
		model.setStaffCode("T01");
		model.setName("Trương Văn Tình");
		model.setPhone("0325456574");
		model.setEmail("tinhkun102@gmail.com");
		model.setNote("");
		model.setDateOfBirth(XDate.toDate(model.getRegistrationDate(), "MM/dd/yyyy"));
		model.setSex(true);
		
		LearnerDAO instance = new LearnerDAO();
		instance.insert(model);
	}
	
	@Test(expectedExceptions = Exception.class)
	public void testInsertWithEmptyDateOfBirthModel() {
		System.out.println("Test Insert Valid");
		Learner model = new Learner();
		model.setLearnerCode("LC01");
		model.setStaffCode("T01");
		model.setName("Trương Văn Tình");
		model.setPhone("0325456574");
		model.setEmail("tinhkun102@gmail.com");
		model.setNote("Ghi chú");
		model.setDateOfBirth(XDate.toDate("", "MM/dd/yyyy"));
		model.setSex(true);
		
		LearnerDAO instance = new LearnerDAO();
		instance.insert(model);
	}
	
	@Test
	public void testInsertWithModel() {
		System.out.println("Test Insert Valid");
		Learner model = new Learner();
		model.setLearnerCode("LC01");
		model.setStaffCode("T01");
		model.setName("Trương Văn Tình");
		model.setPhone("0325456574");
		model.setEmail("tinhkun102@gmail.com");
		model.setNote("Ghi chú");
		model.setDateOfBirth(XDate.toDate(XDate.toString(new Date(),  "MM/dd/yyyy"), "MM/dd/yyyy"));
		model.setSex(true);
		
		LearnerDAO instance = new LearnerDAO();
		instance.insert(model);
	}
	
//	---------------------End Test Insert
	
//	---------------------Begin Test Delete
	@Test(expectedExceptions  = RuntimeException.class)
	public void testDeleteNullModel() {
			System.out.println("Test Delete Null Model");
		
			LearnerDAO instance = new LearnerDAO();
			instance.delete(null);
			
	}
	
	@Test
	public void testDelete() {
		System.out.println("Test Delete Model");
		Learner model = new Learner();
		String learnerCode = "LC01";
		LearnerDAO instance = new LearnerDAO();
		instance.delete(learnerCode);
	}
	
//	---------------------End Test Delete
	
//	---------------------Begin Test SelectByLearnerCode
	@Test
    public void testFindByLearnerCode() throws Exception {	
		Learner model = new Learner();
        List<Learner> expectedResult = new ArrayList<>();
        expectedResult.add(model);
        PowerMockito.doReturn(expectedResult).when(learnerDAOSpy, "selectBySql", ArgumentMatchers.anyString(), ArgumentMatchers.any());
        Learner result = learnerDAOSpy.selectById("PS02037");
        assertEquals(result, expectedResult.get(0));
    }

	@Test(expectedExceptions = Exception.class)
	public void testFindByLearnerCodeFalse() throws Exception {
		Learner model = new Learner();
        List<Learner> expectedResult = new ArrayList<>();
        expectedResult.add(model);
        PowerMockito.doReturn(expectedResult).when(learnerDAOSpy, "selectBySql", ArgumentMatchers.anyString(), ArgumentMatchers.any());
        Learner result = learnerDAOSpy.selectById(null);
        assertEquals(result, expectedResult.get(0));
	}
	
	
//	---------------------End Test SelectByLearnerCode
	
//	---------------------Begin Test SelectAll
	@Test
    public void testSelectAll() throws Exception {	
		Learner model = new Learner();
        List<Learner> expectedResult = new ArrayList<>();
        expectedResult.add(model);
        PowerMockito.doReturn(expectedResult).when(learnerDAOSpy, "selectBySql", ArgumentMatchers.anyString(), ArgumentMatchers.any());
        List<Learner> result = learnerDAOSpy.selectAll();
        assertEquals(result, expectedResult);
    }
//	---------------------End Test SelectAll

//		---------------------Begin Test update
	@Test
	public void testUpdate() {
		System.out.println("Test update");	
		Learner learner = new Learner();
		learner.setLearnerCode("PS01638");
		learner.setStaffCode("TeoNV");
		learner.setName("Trương Văn Không Tình");
		learner.setPhone("0325456575");
		learner.setEmail("tinhkun102@gmail.com");
		learner.setNote("Ghi chú");
		learner.setDateOfBirth(XDate.toDate(learner.getRegistrationDate(), "MM/dd/yyyy"));
		learner.setSex(true);
		
		LearnerDAO instance = new LearnerDAO();
		instance.update(learner);
	}
	
	@Test(expectedExceptions = Exception.class)
	public void testUpdateEmpty() {
		System.out.println("Test update emtp");
		Learner learner = new Learner();
		learner.setLearnerCode("");
		learner.setStaffCode("");
		learner.setName("");
		learner.setPhone("");
		learner.setEmail("");
		learner.setNote("");
		learner.setDateOfBirth(XDate.toDate("", "MM/dd/yyyy"));
		learner.setSex(true);
		
		LearnerDAO instance = new LearnerDAO();
		instance.update(learner);
	}
	
	@Test(expectedExceptions = Exception.class)
	public void testUpdateEmptyStaffCode() {
		System.out.println("Test update emtp");
		Learner learner = new Learner();
		learner.setLearnerCode("PS01638");
		learner.setStaffCode("");
		learner.setName("Trương Văn Tình");
		learner.setPhone("032545655");
		learner.setEmail("tinhkun102@gmail.com");
		learner.setNote("Ghi chú");
		learner.setDateOfBirth(XDate.toDate(learner.getRegistrationDate(), "MM/dd/yyyy"));
		learner.setSex(true);
		
		LearnerDAO instance = new LearnerDAO();
		instance.update(learner);
	}
	
	@Test(expectedExceptions = Exception.class)
	public void testUpdateEmptyName() {
		System.out.println("Test update emtp");
		Learner learner = new Learner();
		learner.setLearnerCode("PS01638");
		learner.setStaffCode("TeoNV");
		learner.setName("");
		learner.setPhone("0325456574");
		learner.setEmail("tinhkun102@gmail.com");
		learner.setNote("Ghi chú");
		learner.setDateOfBirth(XDate.toDate(learner.getRegistrationDate(), "MM/dd/yyyy"));
		learner.setSex(true);
		
		LearnerDAO instance = new LearnerDAO();
		instance.update(learner);
	}	
	
	@Test(expectedExceptions = Exception.class)
	public void testUpdateEmptyPhone() {
		System.out.println("Test update emtp");
		Learner learner = new Learner();
		learner.setLearnerCode("PS01638");
		learner.setStaffCode("SC01");
		learner.setName("Trương Văn Tình");
		learner.setPhone("");
		learner.setEmail("tinhkun102@gmail.com");
		learner.setNote("Ghi chú");
		learner.setDateOfBirth(XDate.toDate(learner.getRegistrationDate(), "MM/dd/yyyy"));
		learner.setSex(true);
		
		LearnerDAO instance = new LearnerDAO();
		instance.update(learner);
	}
	
	@Test(expectedExceptions = Exception.class)
	public void testUpdateEmptyEmail() {
		System.out.println("Test update emtp");
		Learner learner = new Learner();
		learner.setLearnerCode("PS01638");
		learner.setStaffCode("TeoNV");
		learner.setName("Trương Văn Tình");
		learner.setPhone("0325456574");
		learner.setEmail("tinhkun@gmail.com");
		learner.setNote("Ghi chú");
		learner.setDateOfBirth(XDate.toDate(learner.getRegistrationDate(), "MM/dd/yyyy"));
		learner.setSex(true);
		
		LearnerDAO instance = new LearnerDAO();
		instance.update(learner);
	}
	
	@Test(expectedExceptions = Exception.class)
	public void testUpdateEmptyNote() {
		System.out.println("Test update emtp");
		Learner learner = new Learner();
		learner.setLearnerCode("PS01638");
		learner.setStaffCode("TeoNV");
		learner.setName("Trương Văn Tình");
		learner.setPhone("0325456574");
		learner.setEmail("tinhkun102@gmail.com");
		learner.setNote("");
		learner.setDateOfBirth(XDate.toDate(learner.getRegistrationDate(), "MM/dd/yyyy"));
		learner.setSex(true);
		
		LearnerDAO instance = new LearnerDAO();
		instance.update(learner);
	}
	
	@Test(expectedExceptions = Exception.class)
	public void testUpdateEmptyDateOfBirth() {
		System.out.println("Test update emtp");
		Learner learner = new Learner();
		learner.setLearnerCode("PS01638");
		learner.setStaffCode("TeoNV");
		learner.setName("Trương Văn Tình");
		learner.setPhone("0325456574");
		learner.setEmail("tinhkun102@gmail.com");
		learner.setNote("Ghi chú");
		learner.setDateOfBirth(XDate.toDate("", "MM/dd/yyyy"));
		learner.setSex(true);
		
		LearnerDAO instance = new LearnerDAO();
		instance.update(learner);
	}
	
//	---------------------End Test update

//	---------------------Begin Test Find By Name
	@Test
    public void testSelectByKeyword() throws Exception {	
        Learner model = new Learner();
        List<Learner> expectedResult = new ArrayList<>();
        expectedResult.add(model);
        PowerMockito.doReturn(expectedResult).when(learnerDAOSpy, "selectBySql", ArgumentMatchers.anyString(), ArgumentMatchers.any());
        List<Learner> result = learnerDAOSpy.selectByKeyword("NGUYỄN TẤN HIẾU");
        assertEquals(result, expectedResult);
    }

	
	@Test
	public void testFindByNameInvalid() throws Exception {
		System.out.println("Test findByLearnerCode");
		String name  = null;
		
		Learner expectedResult = new Learner();
		List<Learner> resultList = new ArrayList<>();
		resultList.add(expectedResult);
		
		PowerMockito.doReturn(resultList)
			.when(learnerDAOSpy, "selectByKeyword", ArgumentMatchers.anyString());
		List<Learner> result = learnerDAOSpy.selectByKeyword(name);
		AssertJUnit.assertEquals(result, CoreMatchers.is(resultList));
	}
	
//	---------------------End Test Find By Name
	
//	---------------------Begin Test Find 
	@Test
	public void testFindNotInCourse() throws Exception {
		Learner model = new Learner();
        List<Learner> expectedResult = new ArrayList<>();
        expectedResult.add(model);
        PowerMockito.doReturn(expectedResult).when(learnerDAOSpy, "selectBySql", ArgumentMatchers.anyString(), ArgumentMatchers.any());
        List<Learner> result = learnerDAOSpy.selectNotInCourse(1, "ĐỖ VĂN MINH");
        assertEquals(result, expectedResult);
	}
	
	@Test(expectedExceptions = Exception.class)
	public void testFindNotInCourseNull() throws Exception {
		Learner model = new Learner();
        List<Learner> expectedResult = new ArrayList<>();
        expectedResult.add(model);
        PowerMockito.doReturn(expectedResult).when(learnerDAOSpy, "selectBySql", ArgumentMatchers.anyString(), ArgumentMatchers.any());
        List<Learner> result = learnerDAOSpy.selectNotInCourse(1, null);
        assertEquals(result, expectedResult);
	}
	
//	---------------------End Test Find 
}
