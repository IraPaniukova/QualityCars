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
public class EmployeeTest {
    
    public EmployeeTest() {
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
        Employee e = new Employee(12345,"John",EnumGender.MALE,new Date(),"John's Address",
                "23322",21,"User1","333","salesperson");
        assertEquals(12345, e.getPersonId());
        
    } 
    @Test
    public void testInValidGetID() {
        Employee e = new Employee(-12345,"John",EnumGender.MALE,new Date(),"John's Address",
                "23322",21,"User1","333","salesperson");
        assertNotEquals(-12345, e.getPersonId());
    } 
    @Test
    public void testValidSetID() {
        Employee e = new Employee(12345,"John",EnumGender.MALE,new Date(),"John's Address",
                "23322",21,"User1","333","salesperson");
        e.setPersonId(13);
        assertEquals(13, e.getPersonId());
    } 
    @Test
    public void testInValidSetID() {
        Employee e = new Employee(12345,"John",EnumGender.MALE,new Date(),"John's Address",
                "23322",21,"User1","333","salesperson");
        e.setPersonId(-13);
        assertNotEquals(-13, e.getPersonId());
    } 
    @Test
    public void testValidGetName() {
        Employee e = new Employee(12345,"John",EnumGender.MALE,new Date(),"John's Address",
                "23322",21,"User1","333","salesperson");
        assertEquals("John", e.getPersonName());
    }
    @Test
    public void testValidSetName() {
        Employee e = new Employee(12345,"John",EnumGender.MALE,new Date(),"John's Address",
                "23322",21,"User1","333","salesperson");
        e.setPersonName("Ann");
        assertEquals("Ann", e.getPersonName());
    }
    @Test
    public void testValidGetGender() {
        Employee e = new Employee(12345,"John",EnumGender.MALE,new Date(),"John's Address",
                "23322",21,"User1","333","salesperson");
        assertEquals(EnumGender.MALE, e.getGender());
    }
    @Test
    public void testValidSetGender() {
        Employee e = new Employee(12345,"John",EnumGender.MALE,new Date(),"John's Address",
                "23322",21,"User1","333","salesperson");
        e.setGender(EnumGender.FEMALE);
        assertEquals(EnumGender.FEMALE, e.getGender());
    }
    @Test
    public void testValidGetAddress() {
        Employee e = new Employee(12345,"John",EnumGender.MALE,new Date(),"John's Address",
                "23322",21,"User1","333","salesperson");
        assertEquals("John's Address", e.getAddress());
    }
    @Test
    public void testValidSetAddress() {
        Employee e = new Employee(12345,"John",EnumGender.MALE,new Date(),"John's Address",
                "23322",21,"User1","333","salesperson");
        e.setAddress("Wellington");
        assertEquals("Wellington", e.getAddress());
    }
    @Test
    public void testValidGetPhone() {
        Employee e = new Employee(12345,"John",EnumGender.MALE,new Date(),"John's Address",
                "23322",21,"User1","333","salesperson");
        assertEquals("23322", e.getPhone());
    }
    @Test
    public void testValidSetPhone() {
        Employee e = new Employee(12345,"John",EnumGender.MALE,new Date(),"John's Address",
                "23322",21,"User1","333","salesperson");
        e.setPhone("56-778");
        assertEquals("56-778", e.getPhone());
    }
    @Test
    public void testValidGetPhoneExt() {
        Employee e = new Employee(12345,"John",EnumGender.MALE,new Date(),"John's Address",
                "23322",21,"User1","333","salesperson");
        assertEquals(21, e.getPhoneExt());
    } 
    @Test
    public void testInValidGetPhoneExt() {
        Employee e = new Employee(12345,"John",EnumGender.MALE,new Date(),"John's Address",
                "23322",-21,"User1","333","salesperson");
        assertNotEquals(-21, e.getPhoneExt());
    } 
    @Test
    public void testValidSetPhoneExt() {
        Employee e = new Employee(12345,"John",EnumGender.MALE,new Date(),"John's Address",
                "23322",21,"User1","333","salesperson");
        e.setPhoneExt(22);
        assertEquals(22, e.getPhoneExt());
    } 
    @Test
    public void testInValidSetPhoneExt() {
        Employee e = new Employee(12345,"John",EnumGender.MALE,new Date(),"John's Address",
                "23322",21,"User1","333","salesperson");
        e.setPhoneExt(-22);
        assertNotEquals(-22, e.getPhoneExt());
    }
    @Test
    public void testValidGetUsername() {
        Employee e = new Employee(12345,"John",EnumGender.MALE,new Date(),"John's Address",
                "23322",21,"User1","333","salesperson");
        assertEquals("User1", e.getUsername());
    }
    @Test
    public void testValidSetUsername() {
        Employee e = new Employee(12345,"John",EnumGender.MALE,new Date(),"John's Address",
                "23322",21,"User1","333","salesperson");
        e.setUsername("UUUU");
        assertEquals("UUUU", e.getUsername());
    }
    @Test
    public void testValidGetPassword() {
        Employee e = new Employee(12345,"John",EnumGender.MALE,new Date(),"John's Address",
                "23322",21,"User1","333","salesperson");
        assertEquals("333", e.getPassword());
    }
    @Test
    public void testValidSetPassword() {
        Employee e = new Employee(12345,"John",EnumGender.MALE,new Date(),"John's Address",
                "23322",21,"User1","333","salesperson");
        e.setPassword("222");
        assertEquals("222", e.getPassword());
    }
    @Test
    public void testValidGetRole() {
        Employee e = new Employee(12345,"John",EnumGender.MALE,new Date(),"John's Address",
                "23322",21,"User1","333","salesperson");
        assertEquals("salesperson", e.getRole());
    }
    @Test
    public void testValidSetRole() {
        Employee e = new Employee(12345,"John",EnumGender.MALE,new Date(),"John's Address",
                "23322",21,"User1","333","salesperson");
        e.setRole("Manager");
        assertEquals("Manager", e.getRole());
    }
    
    @Test
    public void testValidGetBirthDate() {
        Date x = new Date();
        Employee e = new Employee(12345,"John",EnumGender.MALE,x,"John's Address",
                "23322",21,"User1","333","salesperson");
        assertEquals(x, e.getBirthDate());
    }
    @Test
    public void testValidSetBirthDate() throws ParseException {
        Date x = new Date();
        Employee e = new Employee(12345,"John",EnumGender.MALE,x,"John's Address",
                "23322",21,"User1","333","salesperson");
        String newDate="2001-12-31";
        DateFormat df=new SimpleDateFormat("yyyy-MM-dd"); 
        Date y=(Date)df.parse(newDate);
        e.setBirthDate(y);
        assertEquals(y, e.getBirthDate());        
    }
    
    
    
    
//    Date date1=new SimpleDateFormat("dd/MM/yyyy").parse(sDate1);
}
