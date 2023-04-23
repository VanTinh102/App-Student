package com.edusys.entity;


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
public class StaffTest {

    public StaffTest() {
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
    public void testToString() {
        System.out.println("toString");
        Staff instance = new Staff();
        String expResult = "";
        String result = instance.toString();
        assertEquals(result, expResult);

    }

    @Test
    public void testGetStaffCode() {
        System.out.println("getStaffCode");
        Staff instance = new Staff();
        String expResult = "";
        String result = instance.getStaffCode();
        assertEquals(result, expResult);
    }

    @Test
    public void testGetPassword() {
        System.out.println("getPassword");
        Staff instance = new Staff();
        String expResult = "";
        String result = instance.getPassword();
        assertEquals(result, expResult);

    }

    @Test
    public void testGetName() {
        System.out.println("getName");
        Staff instance = new Staff();
        String expResult = "";
        String result = instance.getName();
        assertEquals(result, expResult);

    }

    @Test
    public void testGetRole() {
        System.out.println("getRole");
        Staff instance = new Staff();
        String expResult = "";
        Boolean result = instance.getRole();
        assertEquals(result, expResult);

    }

    @Test
    public void testSetStaffCode() {
        String maNV = "teoNV";
        Staff instance = new Staff();
        instance.setStaffCode(maNV);
        String expResult = "teoNV";
        String result = instance.getStaffCode();
        assertEquals(result, expResult);
    }

    public void testSetPassword() {
        String MatKhau = "songlong";
        Staff instance = new Staff();
        instance.setStaffCode(MatKhau);
        String expResult = "songlong";
        String result = instance.getPassword();
        assertEquals(result, expResult);

    }
    public void testSetName() {
        String Hoten = "NguyÃªn VÄƒn TÃ¨o";
        Staff instance = new Staff();
        instance.setStaffCode(Hoten);
        String expResult = "NguyÃªn VÄƒn TÃ¨o";
        String result = instance.getName();
        assertEquals(result, expResult);

    }
    public void testSetRole() {
        String VaiTro = "1";
        Staff instance = new Staff();
        instance.setStaffCode(VaiTro);
        String expResult = "1";
        Boolean result = instance.getRole();
        assertEquals(result, expResult);

    }
    
}

