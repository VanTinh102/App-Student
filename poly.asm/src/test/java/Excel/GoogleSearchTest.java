package Excel;

import java.awt.Desktop.Action;
import java.awt.event.InputEvent;
import java.awt.Robot;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSearchTest {

    private ExcelHelpers excel;

    @BeforeClass
    public void setupBrowser() throws Exception {
//        driver = new BaseSetup().setupDriver("chrome");
        excel = new ExcelHelpers();
        excel.setExcelFile("src/main/java/Book1.xlsx", "Sheet1");
       
    }
	@Test
	public void testSearch() throws Exception {
		
		WebDriverManager.chromedriver().setup();
		 WebDriver driver = new ChromeDriver();
//		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe");
		String url = "https://ap.poly.edu.vn/";
//		driver.manage().window().maximize();
		driver.get(url);
		System.out.println(driver.findElement(By.xpath("//*[@id=\"navbarsExample09\"]/ul/li[4]/a")) + "___________________________________");
		driver.findElement(By.xpath("//*[@id=\"navbarsExample09\"]/ul/li[4]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"campus_id_cdd\"]/option[3]")).click();
		
//		driver.findElement(By.xpath("//*[@id=\"recaptcha-anchor\"]/div[1]")).click();
//		driver.findElement(By.xpath("//*[@id=\"recaptcha-anchor\"]/div[2]")).click();
//		driver.findElement(By.xpath("//*[@id=\"recaptcha-anchor\"]/div[3]")).click();
//		driver.findElement(By.xpath("//*[@id=\"recaptcha-anchor\"]/div[4]")).click();
//		driver.findElement(By.xpath("//div [ @class =  'recaptcha-checkbox-border']")).click();
		Thread.sleep(1500);
		Robot robot = new Robot();
		robot.mouseMove(454, 520);
		robot.delay(2000);
		robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);	
		robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"btn_login_google\"]")).click();
//		driver.findElement(By.xpath("//*[@id=\"identifierId\"]")).sendKeys(excel.getCellData("username", 1));
//		driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button/span")).click();
//		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"identifierId\"]")).sendKeys(excel.getCellData("username", 2));
		driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button/span")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input")).sendKeys(excel.getCellData("password", 2));
		driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/div/button/span")).click();
		Thread.sleep(4000);
		robot.mouseMove(890, 180);
		robot.delay(3000);
		robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);	
		robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

		
	}
	
	
}
