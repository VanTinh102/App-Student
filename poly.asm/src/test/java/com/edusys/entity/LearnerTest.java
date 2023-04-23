package com.edusys.entity;


import java.util.Date;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author admin
 */
public class LearnerTest {

    public LearnerTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
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
    public void testGetLearnerCode() {
        System.out.println("getLearnerCode");
        Learner instance = new Learner();
        String expResult = "";
        String result = instance.getLearnerCode();
        assertEquals(result, expResult);
    }

    @Test
    public void testGetStaffCode() {
        System.out.println("getStaffCode");
        Learner instance = new Learner();
        String expResult = "";
        String result = instance.getStaffCode();
        assertEquals(result, expResult);
    }

    @Test
    public void testGetName() {
        System.out.println("getName");
        Learner instance = new Learner();
        String expResult = "";
        String result = instance.getName();
        assertEquals(result, expResult);
    }

    @Test
    public void testGetPhone() {
        System.out.println("getPhone");
        Learner instance = new Learner();
        String expResult = "";
        String result = instance.getPhone();
        assertEquals(result, expResult);
    }

    @Test
    public void testGetEmail() {
        System.out.println("getEmail");
        Learner instance = new Learner();
        String expResult = "";
        String result = instance.getEmail();
        assertEquals(result, expResult);
    }

    @Test
    public void testGetNote() {
        System.out.println("getNote");
        Learner instance = new Learner();
        String expResult = "";
        String result = instance.getNote();
        assertEquals(result, expResult);
    }

    @Test
    public void testGetDateOfBirth() {
        System.out.println("getDateOfBirth");
        Learner instance = new Learner();
        String expResult = "";
        Date result = instance.getDateOfBirth();
        assertEquals(result, expResult);
    }

    @Test
    public void testGetRegistrationDate() {
        System.out.println("getRegistrtionDate");
        Learner instance = new Learner();
        String expResult = "";
        String result = instance.getRegistrationDate();
        assertEquals(result, expResult);
    }

    @Test
    public void testGetSex() {
        System.out.println("getSex");
        Learner instance = new Learner();
        String expResult = "";
        Boolean result = instance.getSex();
        assertEquals(result, expResult);
    }

    @Test
    public void tesSetLearnerCode() {
        String maNH = "PS01638";
        Learner instance = new Learner();
        instance.setLearnerCode(maNH);
        String expResult = "PS01638";
        String result = instance.getLearnerCode();
        assertEquals(result, expResult);
    }

    @Test
    public void testSetStaffCode() {
        String maNV = "TeoNV";
        Learner instance = new Learner();
        instance.setStaffCode(maNV);
        String expResult = "TeoNV";
        String result = instance.getStaffCode();
        assertEquals(result, expResult);
    }

    @Test
    public void tesSetName() {
        String HoTen = "Lá»¯ Huy CÆ°á»ng";
        Learner instance = new Learner();
        instance.setLearnerCode(HoTen);
        String expResult = "Lá»¯ Huy CÆ°á»ng";
        String result = instance.getName();
        assertEquals(result, expResult);

    }
    @Test
    public void tesSetPhone() {
        String DienThoai = "0928768265";
        Learner instance = new Learner();
        instance.setLearnerCode(DienThoai);
        String expResult = "0928768265";
        String result = instance.getPhone();
        assertEquals(result, expResult);

    }
    @Test
    public void tesSetEmail() {
        String Email = "PS01638@fpt.edu.vn";
        Learner instance = new Learner();
        instance.setLearnerCode(Email);
        String expResult = "Ps01638@fpt.edu.vn";
        String result = instance.getEmail();
        assertEquals(result, expResult);

    }
    @Test
    public void tesSetNote() {
        String GhiChu = "0928768265 - Lá»® HUY CÆ¯á»œNG";
        Learner instance = new Learner();
        instance.setLearnerCode(GhiChu);
        String expResult = "0928768265 - Lá»® HUY CÆ¯á»œNG";
        String result = instance.getNote();
        assertEquals(result, expResult);
        

    }
    @Test
    public void tesSetDateOfBirth() {
        String Ngaysinh= "1991-05-08";
        Learner instance = new Learner();
        instance.setLearnerCode(Ngaysinh);
        String expResult = "1991-05-08";
        Date result = instance.getDateOfBirth();
        assertEquals(result, expResult);

    }
    @Test
    public void tesSetRegistrationDate() {
        String NgayDK= "1991-05-08";
        Learner instance = new Learner();
        instance.setLearnerCode(NgayDK);
        String expResult = "1991-05-08";
        String result = instance.getRegistrationDate();
        assertEquals(result, expResult);

    }
    @Test
    public void tesSetSex() {
        String GioiTinh= "false";
        Learner instance = new Learner();
        instance.setLearnerCode(GioiTinh);
        String expResult = "false";
        Boolean result = instance.getSex();
        assertEquals(result, expResult);

    }
    
    
    

}

