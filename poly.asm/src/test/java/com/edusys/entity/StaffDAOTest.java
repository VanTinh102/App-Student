package com.edusys.entity;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import com.edusys.DAO.LearnerDAO;
import com.edusys.DAO.StaffDAO;
import com.edusys.DAO.StaffDAO;
import com.edusys.entity.Learner;
import com.edusys.entity.Staff;
import com.edusys.entity.Staff;
import com.edusys.utils.JdbcHelper;
import com.edusys.utils.XDate;
import javassist.expr.Instanceof;
import static org.hamcrest.CoreMatchers.instanceOf;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertThrows;
import static org.testng.Assert.fail;

import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.hamcrest.CoreMatchers;
import org.junit.runner.RunWith;
import org.mockito.ArgumentMatchers;
import org.mockito.internal.matchers.InstanceOf;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;
import org.testng.IObjectFactory;
import org.testng.ITestResult;
import org.testng.TestException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.ObjectFactory;

import java.io.File;
import java.io.FileOutputStream;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.testng.annotations.Test;

import junit.framework.TestResult;
@RunWith(PowerMockRunner.class)
@PrepareForTest({JdbcHelper.class, StaffDAO.class})
public class StaffDAOTest {
	StaffDAO staffDAO;
	StaffDAO staffDAOSpy;
	 HSSFWorkbook workBook;
	 HSSFSheet sheet;
	 Map<String, Object[]> TestResultNG = new HashMap<String, Object[]>();
	int count = 0;
	String result1 = "Pass";
	
	public StaffDAOTest() {}
	
	@ObjectFactory
    public IObjectFactory getObjectFactory() {

		
        return new org.powermock.modules.testng.PowerMockObjectFactory();
    }
	
	@AfterMethod
	public void status(ITestResult result){

	      System.out.println("Status of execution is:"+result.getStatus());
	      try{
	         if(result.getStatus() == ITestResult.SUCCESS){
	            System.out.println("Test case execution status is SUCCESS");
	            result1 = "Pass";
	            
	         }
	         else if(result.getStatus() == ITestResult.FAILURE){
	            // Do something here
	            System.out.println("Test case execution status is FAILURE");
	            result1 = "Fail";
	         }
	      }
	      catch(Exception e){
	         e.printStackTrace();
	      }
	   }

    @BeforeClass
    public void setUpClass() throws Exception {
    	System.out.println("Dz");
    	
		workBook = new HSSFWorkbook();
		sheet = workBook.createSheet("Kết quả test");
		
		TestResultNG.put("" + count++, new Object[] {"Id", "Test Case Description", "Test Case Procedure", "Test Data", "Expected Output", "Test Date", "Result"});
    }

    @AfterClass
    public void tearDownClass() throws Exception {
    		System.out.println("Oke Đã ghi ngeo");
    		Set<String> keySet = TestResultNG.keySet();
    		int rowNum = 0;
    		for(String key : keySet) {
    			Row row = sheet.createRow(rowNum++);
    			Object[] objArr = TestResultNG.get(key);
    			int cellNum = 0;
    			for(Object obj : objArr) {
    				Cell cell = row.createCell(cellNum++);
    				if(obj instanceof Date) {
    					cell.setCellValue((Date) obj);
    				} else if(obj instanceof Boolean) {
    					cell.setCellValue((Boolean) obj);
    				} else if(obj instanceof String) {
    					cell.setCellValue((String) obj);
    				} else if(obj instanceof Double) {
    					cell.setCellValue((Double) obj);
    				} else if(obj instanceof Integer) {
    					cell.setCellValue((Integer) obj);
    				}
    			}
    		}
    		try {
    			FileOutputStream out = new FileOutputStream(new File("Text.xls"));
    			workBook.write(out);
    			out.close();
    		} catch (Exception e) {
    			// TODO: handle exception
    			System.out.println(e.getMessage());
    		}
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    	staffDAO = new StaffDAO();
        PowerMockito.mockStatic(JdbcHelper.class);
        staffDAOSpy = PowerMockito.spy(new StaffDAO());
    }
	
//	---------------------Begin Test Insert

	
	@Test(expectedExceptions = Exception.class)
	public void testInsertWithEmptyModel() {
		System.out.println("Test Insert empty");
		Staff model = new Staff();
		model.setStaffCode("");
		model.setPassword("");
		model.setName("");
		model.setRole(true);

		StaffDAO instance = new StaffDAO();
		
		String resuslt = "";
		if(model.equals(resuslt)) {
			resuslt = "Pass";
		} else {
			resuslt = "fail";
		}
		TestResultNG.put("" + count++, new Object[] {"Id" + count, "Insert With Empty Model", "Nhập StaffCode = \"\"\n Nhập "
				+ "Password = \"\" \n Nhập Name = \"\" \n Nhập Role = \"true\"", "Valid", "Insert thất bại", XDate.toString(new Date(), "dd/MM/yyyy"), resuslt});
		
		
		
		instance.insert(model);
	}
	
	@Test(expectedExceptions = Exception.class)
	public void testInsertWithEmptyStaffCodeModel() {
		try {
			System.out.println("Test Insert Valid");
			Staff model = new Staff();
			model.setStaffCode("");
			model.setName("Trương Văn Tình");
			model.setPassword("0325456574");
			model.setRole(true);
			
			TestResultNG.put("" + count++, new Object[] {"Id" + count, "Insert With Empty StaffCode Model", "Nhập StaffCode = \"\"\n Nhập "
					+ "Password = \"0325456574\" \n Nhập Name = \"Trương Văn Tình\" \n Nhập Role = \"true\"", "Valid", "Insert thất bại", XDate.toString(new Date(), "dd/MM/yyyy"), "Fail"});
			StaffDAO instance = new StaffDAO();
			instance.insert(model);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	@Test(expectedExceptions = Exception.class)
	public void testInsertWithEmptyNameModel() {
		System.out.println("Test Insert Empty StaffCode");
		Staff model = new Staff();
		model.setStaffCode("LC01");
		model.setName("");
		model.setPassword("0325456574");
		model.setRole(true);
		TestResultNG.put("" + count++, new Object[] {"Id" + count, "Insert With Empty Name Model", "Nhập StaffCode = \"LC01\"\n Nhập "
				+ "Password = \"0325456574\" \n Nhập Name = \"\" \n Nhập Role = \"true\"", "Valid", "Insert thất bại", XDate.toString(new Date(), "dd/MM/yyyy"), "Fail"});
		StaffDAO instance = new StaffDAO();
		instance.insert(model);
	}
	
	@Test(expectedExceptions = Exception.class)
	public void testInsertWithEmptyPasswordModel() {
		System.out.println("Test Insert Empty Name");
		Staff model = new Staff();
		model.setStaffCode("LC01");
		model.setName("Trương Văn Tình");
		model.setPassword("");
		model.setRole(true);
		TestResultNG.put("" + count++, new Object[] {"Id" + count, "Insert With Empty Password Model", "Nhập StaffCode = \"LC01\"\n Nhập "
				+ "Password = \"\" \n Nhập Name = \"Trương Văn Tình\" \n Nhập Role = \"true\"", "Valid", "Insert thất bại", XDate.toString(new Date(), "dd/MM/yyyy"), "Fail"});
		StaffDAO instance = new StaffDAO();
		instance.insert(model);
	}
	
	
	
	@Test
	public void testInsertWithModel() {
		System.out.println("Test Insert Valid");
		Staff model = new Staff();
		model.setStaffCode("LC01");
		model.setName("Trương Văn Tình");
		model.setPassword("0325456574");
		model.setRole(true);
		TestResultNG.put("" + count++, new Object[] {"Id" + count, "Insert With Model", "Nhập StaffCode = \"LC01\"\n Nhập "
				+ "Password = \"0325456574\" \n Nhập Name = \"Trương Văn Tình\" \n Nhập Role = \"true\"", "Valid", "Insert thành công", XDate.toString(new Date(), "dd/MM/yyyy"), "Pass"});
		StaffDAO instance = new StaffDAO();
		instance.insert(model);
	}
	
//	---------------------End Test Insert
	
//	---------------------Begin Test Delete
	@Test(expectedExceptions  = RuntimeException.class)
	public void testDeleteNullModel() {
			System.out.println("Test Delete Null Model");
			TestResultNG.put("" + count++, new Object[] {"Id" + count, "Delete Null Model", "Nhập StaffCode = \"null\"",
					"Valid", "Delete thất bại", XDate.toString(new Date(), "dd/MM/yyyy"), ""
							+ "Fail"});
			StaffDAO instance = new StaffDAO();
			instance.delete(null);
			
	}
	
	@Test
	public void testDelete() {
		System.out.println("Test Delete Model");
		Staff model = new Staff();
		String StaffCode = "LongNDT";
		StaffDAO instance = new StaffDAO();
		TestResultNG.put("" + count++, new Object[] {"Id" + count, "Delete", "Nhập StaffCode = \"LongNDT\"",
				"Valid", "Delete thành công", XDate.toString(new Date(), "dd/MM/yyyy"), ""
						+ "Pass"});
		instance.delete(StaffCode);
	}
	
//	---------------------End Test Delete
	
//	---------------------Begin Test SelectByStaffCode
	@Test
	public void testFindByStaffCode() throws Exception {
		Staff model = new Staff();
        List<Staff> expectedResult = new ArrayList<>();
        expectedResult.add(model);
        PowerMockito.doReturn(expectedResult).when(staffDAOSpy, "selectBySql", ArgumentMatchers.anyString(), ArgumentMatchers.any());
        Staff result = staffDAOSpy.selectById("PS24382");
        TestResultNG.put("" + count++, new Object[] {"Id" + count, "Find By Staff Code", "Nhập StaffCode = \"PS24382\"",
				"Valid", "Find Success", XDate.toString(new Date(), "dd/MM/yyyy"), ""
						+ "Pass"});
        AssertJUnit.assertEquals(result, expectedResult.get(0));
	}

	@Test(expectedExceptions = Exception.class)
	public void testFindByStaffCodeFalse() throws Exception {
		Staff model = new Staff();
        List<Staff> expectedResult = new ArrayList<>();
        expectedResult.add(model);
        PowerMockito.doReturn(expectedResult).when(staffDAOSpy, "selectBySql", ArgumentMatchers.anyString(), ArgumentMatchers.any());
        TestResultNG.put("" + count++, new Object[] {"Id" + count, "Find By Staff Code False", "Nhập StaffCode = \"null\"",
				"Valid", "Find Fail", XDate.toString(new Date(), "dd/MM/yyyy"), ""
						+ "Fail"});
        Staff result = staffDAOSpy.selectById(null);
        AssertJUnit.assertEquals(result, expectedResult.get(0));
	}
	
	
//	---------------------End Test SelectByStaffCode
	
//	---------------------Begin Test SelectAll
	@Test
    public void testSelectAll() throws Exception {	
        Staff model = new Staff();
        List<Staff> expectedResult = new ArrayList<>();
        expectedResult.add(model);
        PowerMockito.doReturn(expectedResult).when(staffDAOSpy, "selectBySql", ArgumentMatchers.anyString(), ArgumentMatchers.any());
        TestResultNG.put("" + count++, new Object[] {"Id" + count, "Find All", "click chuột chọn Thematic => Staff => List => danh sách tất cả Staff",
				"Invalid", "Find Success", XDate.toString(new Date(), "dd/MM/yyyy"), ""
						+ "Pass"});
        List<Staff> result = staffDAOSpy.selectAll();
        AssertJUnit.assertEquals(result, expectedResult);
    }
//	---------------------End Test SelectAll

//		---------------------Begin Test update
	@Test
	public void testUpdate() {
		System.out.println("Test update");	
		Staff Staff = new Staff();
		Staff.setStaffCode("TeoNV");
		Staff.setName("Trương Văn Không Tình");
		Staff.setPassword("0325456575");
		Staff.setRole(true);
		TestResultNG.put("" + count++, new Object[] {"Id" + count, "Update", "Nhập StaffCode = \"TeoNV\"\n Nhập "
				+ "Password = \"0325456574\" \n Nhập Name = \"Trương Văn Không Tình\" \n Nhập Role = \"true\"", "Valid",
				"Update thành công", XDate.toString(new Date(), "dd/MM/yyyy"), "Pass"});
		
		StaffDAO instance = new StaffDAO();
		instance.update(Staff);
	}
	
	@Test(expectedExceptions = Exception.class)
	public void testUpdateEmpty() {
		System.out.println("Test update emtp");
		Staff Staff = new Staff();
		Staff.setStaffCode("");
		Staff.setName("");
		Staff.setPassword("");
		Staff.setRole(true);
		TestResultNG.put("" + count++, new Object[] {"Id" + count, "Update Empty", "Nhập StaffCode = \"\"\n Nhập "
				+ "Password = \"\" \n Nhập Name = \"\" \n Nhập Role = \"true\"", "Valid",
				"Update thất bại", XDate.toString(new Date(), "dd/MM/yyyy"), "Fail"});
		StaffDAO instance = new StaffDAO();
		instance.update(Staff);
	}
	
	@Test(expectedExceptions = Exception.class)
	public void testUpdateEmptyStaffCode() {
		System.out.println("Test update emtp");
		Staff Staff = new Staff();
		Staff.setStaffCode("");
		Staff.setName("Trương Văn Không Tình");
		Staff.setPassword("0325456575");
		Staff.setRole(true);
		TestResultNG.put("" + count++, new Object[] {"Id" + count, "Update Empty Staff Code", "Nhập StaffCode = \"\"\n Nhập "
				+ "Password = \"0325456575\" \n Nhập Name = \"Trương Văn Không Tình\" \n Nhập Role = \"true\"", "Valid",
				"Update thất bại", XDate.toString(new Date(), "dd/MM/yyyy"), "Fail"});
		StaffDAO instance = new StaffDAO();
		instance.update(Staff);
	}
	
	@Test(expectedExceptions = Exception.class)
	public void testUpdateEmptyName() {
		System.out.println("Test update emtp");
		Staff Staff = new Staff();
		Staff.setStaffCode("TeoNV");
		Staff.setName("");
		Staff.setPassword("0325456575");
		Staff.setRole(true);
		TestResultNG.put("" + count++, new Object[] {"Id" + count, "Update Empty Name", "Nhập StaffCode = \"TeoNV\"\n Nhập "
				+ "Password = \"0325456575\" \n Nhập Name = \"\" \n Nhập Role = \"true\"", "Valid",
				"Update thất bại", XDate.toString(new Date(), "dd/MM/yyyy"), "Fail"});
		StaffDAO instance = new StaffDAO();
		instance.update(Staff);
	}	
	
	@Test(expectedExceptions = Exception.class)
	public void testUpdateEmptyPhone() {
		System.out.println("Test update emtp");
		Staff Staff = new Staff();
		Staff.setStaffCode("TeoNV");
		Staff.setName("Trương Văn Không Tình");
		Staff.setPassword("");
		Staff.setRole(true);
		TestResultNG.put("" + count++, new Object[] {"Id" + count, "Update Empty Password", "Nhập StaffCode = \"TeoNV\"\n Nhập "
				+ "Password = \"\" \n Nhập Name = \"\" \n Nhập Role = \"true\"", "Valid",
				"Update thất bại", XDate.toString(new Date(), "dd/MM/yyyy"), "Fail"});
		StaffDAO instance = new StaffDAO();
		instance.update(Staff);
	}
	
//	---------------------End Test update

}
