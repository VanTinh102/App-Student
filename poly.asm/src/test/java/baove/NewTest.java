package baove;

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
import org.junit.runner.RunWith;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;
import org.testng.IObjectFactory;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.ObjectFactory;
import org.testng.annotations.Test;

import com.edusys.DAO.StaffDAO;
import com.edusys.utils.JdbcHelper;

import Excel.ExcelHelpers;
@RunWith(PowerMockRunner.class)
@PrepareForTest({Tamgiac.class})
public class NewTest {
	Tamgiac tamgiac = new Tamgiac();
	 HSSFWorkbook workBook;
	 HSSFSheet sheet;
	 String result1= "Pass";
	 Map<String, Object[]> TestResultNG = new HashMap<String, Object[]>();
	int count = 0;
	String testdesc = "";
	String testpro = "";
	String testdata = "";
	String ex = "";
	String testDate = "";
	private ExcelHelpers excel;

    @BeforeClass
    public void setupBrowser() throws Exception {
//        driver = new BaseSetup().setupDriver("chrome");
        excel = new ExcelHelpers();
        excel.setExcelFile("src/main/java/Book.xlsx", "Sheet1");
       
    }
    @ObjectFactory
    public IObjectFactory getObjectFactory() {
		
        return new org.powermock.modules.testng.PowerMockObjectFactory();
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
	    
	    @AfterMethod
		public void status(ITestResult result){
		      System.out.println("Status of execution is:"+result.getStatus());
		      try{
		         if(result.getStatus() == ITestResult.SUCCESS){
		            System.out.println("Test case execution status is SUCCESS");
		            result1 = "Pass";
		            TestResultNG.put("" + count++, new Object[] {"Id" + count, testdesc, testdesc, testdata, ex, testDate, result1});
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

  @Test
  public void testChuVi() throws Exception {
	  Tamgiac.chuVi(Integer.parseInt(excel.getCellData("Test Case Procedure", 4).substring(2, 3)), Integer.parseInt(excel.getCellData("Test Case Procedure", 4).substring(7, 8)), Integer.parseInt(excel.getCellData("Test Case Procedure", 4).substring(12)));
	  testdesc = "Nhập";
	  testpro = "a=null";
	  testdata = "Valid";
	  ex = "Thông báo 'Nhập thất bại'";
	  testDate = "14/4/2023";
	  TestResultNG.put("" + count++, new Object[] {"Id" + count++, testdesc, testpro, testdata, ex, testDate,result1});
  }
  
  @Test
  public void testChuViNulla() throws Exception {
	  Tamgiac.chuVi(Integer.parseInt(excel.getCellData("Test Case Procedure", 6).substring(2, 6)), Integer.parseInt(excel.getCellData("Test Case Procedure", 4).substring(7, 8)), Integer.parseInt(excel.getCellData("Test Case Procedure", 4).substring(12)));
	  testdesc = "Nhập";
	  testpro = "a=null";
	  testdata = "Valid";
	  ex = "Thông báo 'Nhập thất bại'";
	  testDate = "14/4/2023";
	  TestResultNG.put("" + count++, new Object[] {"Id" + count++, testdesc, testpro, testdata, ex, testDate,result1});
  }
  
  @Test
  public void testChuViNullb() throws Exception {
	  Tamgiac.chuVi(Integer.parseInt(excel.getCellData("Test Case Procedure", 7).substring(2, 3)), Integer.parseInt(excel.getCellData("Test Case Procedure", 4).substring(7, 11)), Integer.parseInt(excel.getCellData("Test Case Procedure", 4).substring(12)));
	  testdesc = "Nhập";
	  testpro = "a=null";
	  testdata = "Valid";
	  ex = "Thông báo 'Nhập thất bại'";
	  testDate = "14/4/2023";
	  TestResultNG.put("" + count++, new Object[] {"Id" + count++, testdesc, testpro, testdata, ex, testDate,result1});
  }
  @Test
  public void testChuViNullc() throws Exception {
	  Tamgiac.chuVi(Integer.parseInt(excel.getCellData("Test Case Procedure", 8).substring(2, 3)), Integer.parseInt(excel.getCellData("Test Case Procedure", 4).substring(7, 8)), Integer.parseInt(excel.getCellData("Test Case Procedure", 4).substring(12)));
	  testdesc = "Nhập";
	  testpro = "a=null";
	  testdata = "Valid";
	  ex = "Thông báo 'Nhập thất bại'";
	  testDate = "14/4/2023";
	  TestResultNG.put("" + count++, new Object[] {"Id" + count++, testdesc, testpro, testdata, ex, testDate,result1});
  }
  
  @Test
  public void testDienTich() throws Exception {
	  Tamgiac.dienTich(Integer.parseInt(excel.getCellData("Test Case Procedure", 12).substring(2, 3)), Integer.parseInt(excel.getCellData("Test Case Procedure", 4).substring(7, 8)), Integer.parseInt(excel.getCellData("Test Case Procedure", 4).substring(12)));
	  testdesc = "Dientich";
	  testpro = "a=1, b=2, c=3";
	  testdata = "Valid";
	  ex = "Thông báo 'Nhập thất bại'";
	  testDate = "14/4/2023";
	  TestResultNG.put("" + count++, new Object[] {"Id" + count++, testdesc, testpro, testdata, ex, testDate,result1});
  }
  
  @Test
  public void testDienTichNulla() throws Exception {
	  Tamgiac.dienTich(Integer.parseInt(excel.getCellData("Test Case Procedure", 13).substring(2, 3)), Integer.parseInt(excel.getCellData("Test Case Procedure", 4).substring(7, 8)), Integer.parseInt(excel.getCellData("Test Case Procedure", 4).substring(12)));
	  testdesc = "Dientich";
	  testpro = "a=null, b=2, c=3";
	  testdata = "Valid";
	  ex = "Thông báo 'Nhập thất bại'";
	  testDate = "14/4/2023";
	  TestResultNG.put("" + count++, new Object[] {"Id" + count++, testdesc, testpro, testdata, ex, testDate,result1});
  }
  
  @Test
  public void testDienTichNullb() throws Exception {
	  Tamgiac.dienTich(Integer.parseInt(excel.getCellData("Test Case Procedure", 14).substring(2, 3)), Integer.parseInt(excel.getCellData("Test Case Procedure", 4).substring(7, 8)), Integer.parseInt(excel.getCellData("Test Case Procedure", 4).substring(12)));
	  testdesc = "Dientich";
	  testpro = "a=1, b=null, c=3";
	  testdata = "Valid";
	  ex = "Thông báo 'Nhập thất bại'";
	  testDate = "14/4/2023";
	  TestResultNG.put("" + count++, new Object[] {"Id" + count++, testdesc, testpro, testdata, ex, testDate,result1});
  }
  
  @Test
  public void testDienTichNullc() throws Exception {
	  Tamgiac.dienTich(Integer.parseInt(excel.getCellData("Test Case Procedure", 15).substring(2, 3)), Integer.parseInt(excel.getCellData("Test Case Procedure", 4).substring(7, 8)), Integer.parseInt(excel.getCellData("Test Case Procedure", 4).substring(12)));
	  testdesc = "Dientich";
	  testpro = "a=1, b=2, c=null";
	  testdata = "Valid";
	  ex = "Thông báo 'Nhập thất bại'";
	  testDate = "14/4/2023";
	  TestResultNG.put("" + count++, new Object[] {"Id" + count++, testdesc, testpro, testdata, ex, testDate,result1});
  }
  
}
