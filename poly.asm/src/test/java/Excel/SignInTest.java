package Excel;


import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class SignInTest {

    private WebDriver driver;

    private ExcelHelpers excel;

    @BeforeClass
    public void setupBrowser() {
//        driver = new BaseSetup().setupDriver("chrome");
        excel = new ExcelHelpers();
    }

    @Test
    public void signInPage() throws Exception {

        // Setup đường dẫn của file excel
        excel.setExcelFile("src/main/java/Book1.xlsx", "Sheet1");


        // Đọc data từ file excel
        System.out.println(excel.getCellData("username", 2));

        //Ghi data vào file excel
//        excel.setCellData("anhtester.com", 5, 0);

        // Chú ý: dòng và cột trong code nó hiểu bắt đầu từ 0

        Thread.sleep(2000);
    }

//    @Test
//    public void signInPageReadExcelDynamic() throws Exception {
//
//        //Setup đường dẫn của file excel
//        excel.setExcelFile("src/test/resources/Book1.xlsx", "Sheet1");
//
//        signInPage = new SignInPage(driver);
//        driver.get("https://crm.anhtester.com");
//
//        for (int i = 0; i < 6; i++) {
//            signInPage.signIn(excel.getCellData("username", i), excel.getCellData("password", i));
//            Thread.sleep(1000);
//        }
//
//        // Ghi nhiều dòng vào file
//        for (int i = 1; i < 6; i++) {
//            excel.setCellData("AN01", i, 3);
//        }
//    }
//
//    @AfterClass
//    public void closeBrowser() {
//        driver.close();
//    }

}
