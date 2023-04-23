package Excel;

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
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.testng.annotations.Test;

import junit.framework.TestResult;

public class fpoly {
	HSSFWorkbook workBook;
	HSSFSheet sheet;
	Map<String, Object[]> TestResultNG = new HashMap<String, Object[]>();
	
	
	@org.testng.annotations.BeforeClass
	public void setUp() {
		System.out.println("Dz");
		workBook = new HSSFWorkbook();
		sheet = workBook.createSheet("Kết quả test");
		TestResultNG.put("1", new Object[] {"Các bước test", "Kết quả test", "Giá trị đề xuất", "Kết quả"});
	}
	
	@org.testng.annotations.AfterClass
	public void tearDown() {
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
			System.out.println("Oke Đã ghi ngeo1");
			out.close();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}
	
	@Test
	public void testFunction1() {
		System.out.println("Test hàm Function1");
		TestResultNG.put("2", new Object[] {"Thực hiện login", "Nhập đúng user, pass", "True", "True"});
	}
	
	@Test
	public void testFunction2() {
		System.out.println("Test hàm Function2");
		TestResultNG.put("3", new Object[] {"Thực hiện login", "Nhập sai user, pass", "Fail", "Fail"});
	}
	

}
