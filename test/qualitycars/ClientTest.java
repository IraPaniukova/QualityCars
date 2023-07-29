/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package qualitycars;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author I
 */
public class ClientTest {
    
    public ClientTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    
    @Test
    public void testValidGetID() {
        Client c = new Client(12345,"John",EnumGender.MALE,new Date(),"John's Address",
                "095-233-22","KA11112","class A",new Date(),new Date(),"new");
        assertEquals(12345, c.getPersonId());
    } 
    @Test
    public void testInValidGetID() {
        Client c = new Client(-12345,"John",EnumGender.MALE,new Date(),"John's Address",
                "095-233-22","KA11112","class A",new Date(),new Date(),"new");
        assertNotEquals(-12345, c.getPersonId());
    } 
    @Test
    public void testValidSetID() {
        Client c = new Client(12345,"John",EnumGender.MALE,new Date(),"John's Address",
                "095-233-22","KA11112","class A",new Date(),new Date(),"new");
        c.setPersonId(13);
        assertEquals(13, c.getPersonId());
    } 
    @Test
    public void testInValidSetID() {
        Client c = new Client(12345,"John",EnumGender.MALE,new Date(),"John's Address",
                "095-233-22","KA11112","class A",new Date(),new Date(),"new");
        c.setPersonId(-13);
        assertNotEquals(-13, c.getPersonId());
    } 
    @Test
    public void testValidGetName() {
        Client c = new Client(12345,"John",EnumGender.MALE,new Date(),"John's Address",
                "095-233-22","KA11112","class A",new Date(),new Date(),"new");
        assertEquals("John", c.getPersonName());
    }
    @Test
    public void testValidSetName() {
        Client c = new Client(12345,"John",EnumGender.MALE,new Date(),"John's Address",
                "095-233-22","KA11112","class A",new Date(),new Date(),"new");
        c.setPersonName("Ann");
        assertEquals("Ann", c.getPersonName());
    }
    @Test
    public void testValidGetGender() {
        Client c = new Client(12345,"John",EnumGender.MALE,new Date(),"John's Address",
                "095-233-22","KA11112","class A",new Date(),new Date(),"new");
        assertEquals(EnumGender.MALE, c.getGender());
    }
    @Test
    public void testValidSetGender() {
        Client c = new Client(12345,"John",EnumGender.MALE,new Date(),"John's Address",
                "095-233-22","KA11112","class A",new Date(),new Date(),"new");
        c.setGender(EnumGender.FEMALE);
        assertEquals(EnumGender.FEMALE, c.getGender());
    }
    @Test
    public void testValidGetAddress() {
        Client c = new Client(12345,"John",EnumGender.MALE,new Date(),"John's Address",
                "095-233-22","KA11112","class A",new Date(),new Date(),"new");
        assertEquals("John's Address", c.getAddress());
    }
    @Test
    public void testValidSetAddress() {
        Client c = new Client(12345,"John",EnumGender.MALE,new Date(),"John's Address",
                "095-233-22","KA11112","class A",new Date(),new Date(),"new");
        c.setAddress("Wellington");
        assertEquals("Wellington", c.getAddress());
    }
    @Test
    public void testValidGetPhone() {
        Client c = new Client(12345,"John",EnumGender.MALE,new Date(),"John's Address",
                "095-233-22","KA11112","class A",new Date(),new Date(),"new");
        assertEquals("095-233-22", c.getPhone());
    }
    @Test
    public void testValidSetPhone() {
        Client c = new Client(12345,"John",EnumGender.MALE,new Date(),"John's Address",
                "095-233-22","KA11112","class A",new Date(),new Date(),"new");
        c.setPhone("023-56-778");
        assertEquals("023-56-778", c.getPhone());
    }
    @Test
    public void testValidGetLicenseNumber() {
        Client c = new Client(12345,"John",EnumGender.MALE,new Date(),"John's Address",
                "095-233-22","KA11112","class A",new Date(),new Date(),"new");
        assertEquals("KA11112", c.getLicenseNumber());
    }
    @Test
    public void testValidSetLicenseNumber() {
        Client c = new Client(12345,"John",EnumGender.MALE,new Date(),"John's Address",
                "095-233-22","KA11112","class A",new Date(),new Date(),"new");
        c.setLicenseNumber("BS123");
        assertEquals("BS123", c.getLicenseNumber());
    }
    @Test
    public void testValidGetLicenseType() {
        Client c = new Client(12345,"John",EnumGender.MALE,new Date(),"John's Address",
                "095-233-22","KA11112","class A",new Date(),new Date(),"new");
        assertEquals("class A", c.getLicenseType());
    }
    @Test
    public void testValidSetLicenseType() {
        Client c = new Client(12345,"John",EnumGender.MALE,new Date(),"John's Address",
                "095-233-22","KA11112","class A",new Date(),new Date(),"new");
        c.setLicenseType("class 2");
        assertEquals("class 2", c.getLicenseType());
    }
    @Test
    public void testValidGetNewOrOld() {
        Client c = new Client(12345,"John",EnumGender.MALE,new Date(),"John's Address",
                "095-233-22","KA11112","new",new Date(),new Date(),"new");
        assertEquals("new", c.getNewOrOld());
    }
    @Test
    public void testValidSetNewOrOld() {
        Client c = new Client(12345,"John",EnumGender.MALE,new Date(),"John's Address",
                "095-233-22","KA11112","class A",new Date(),new Date(),"new");
        c.setLicenseType("old");
        assertEquals("old", c.getLicenseType());
    }
    @Test
    public void testValidGetBirthDate() {
        Date x = new Date();
        Client c = new Client(12345,"John",EnumGender.MALE,new Date(),"John's Address",
                "095-233-22","KA11112","class A",new Date(),new Date(),"new");
        assertEquals(x, c.getBirthDate());
    }
    @Test
    public void testValidSetBirthDate() throws ParseException {
        Date x = new Date();
        Client c = new Client(12345,"John",EnumGender.MALE,new Date(),"John's Address",
                "095-233-22","KA11112","class A",new Date(),new Date(),"new");
        String newDate="2001-12-31";
        DateFormat df=new SimpleDateFormat("yyyy-MM-dd"); 
        Date y=(Date)df.parse(newDate);
        c.setBirthDate(y);
        assertEquals(y, c.getBirthDate());        
    }
    @Test
    public void testValidGetLicenseExpDate() {
        Date x = new Date();
        Client c = new Client(12345,"John",EnumGender.MALE,new Date(),"John's Address",
                "095-233-22","KA11112","class A",new Date(),new Date(),"new");
        assertEquals(x, c.getLicenseExpDate());
    }
    @Test
    public void testValidSetLicenseExpDate() throws ParseException {
        Date x = new Date();
        Client c = new Client(12345,"John",EnumGender.MALE,new Date(),"John's Address",
                "095-233-22","KA11112","class A",x,new Date(),"new");
        String newDate="2025-12-31";
        DateFormat df=new SimpleDateFormat("yyyy-MM-dd"); 
        Date y=(Date)df.parse(newDate);
        c.setLicenseExpDate(y);
        assertEquals(y, c.getLicenseExpDate());        
    }
    @Test
    public void testValidGetDate() {
        Date x = new Date();
        Client c = new Client(12345,"John",EnumGender.MALE,new Date(),"John's Address",
                "095-233-22","KA11112","class A",new Date(),x,"new");
        assertEquals(x, c.getDate());
    }
}
