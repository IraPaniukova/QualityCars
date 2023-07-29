/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package qualitycars;

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
public class CarModelTest {
    
    public CarModelTest() {
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
    public void testValidGetModel() throws Exception {
        CarModel c = new CarModel("audi A3 sportback","Audi",1500,4,EnumFuelType.PETROL);
        assertEquals("audi A3 sportback", c.getModel());
    } 
    @Test
    public void testValidSetModel() throws Exception {
        CarModel c = new CarModel("audi A3 sportback","Audi",1500,4,EnumFuelType.PETROL);
        c.setModel("Ford Focus");
        assertEquals("Ford Focus", c.getModel());
    }
    
    @Test
    public void testValidGetManufacturer() throws Exception {
        CarModel c = new CarModel("audi A3 sportback","Audi",1500,4,EnumFuelType.PETROL);
        assertEquals("Audi", c.getManufacturer());
    }  
    @Test
    public void testValidSetManufacturer() throws Exception {
        CarModel c = new CarModel("audi A3 sportback","Audi",1500,4,EnumFuelType.PETROL);
        c.setManufacturer("Ford");
        assertEquals("Ford", c.getManufacturer());
    }  
    
    @Test
    public void testValidGetEngineSize() throws Exception{
    try{
    CarModel c = new CarModel("audi A3 sportback","Audi",1500,4,EnumFuelType.PETROL);
    assertEquals(1500,c.getEngineSize());}
    catch(Exception ex){fail();}
    }
    @Test
    public void testInvalidGetEngineSize() throws Exception{
    try{
    CarModel c = new CarModel("audi A3 sportback","Audi",-1500,4,EnumFuelType.PETROL);
    fail();}
    catch(Exception ex){assertEquals("Wrong engine size",ex.getMessage());}
    }  
    @Test
    public void testInvalidGetEngineSize2() throws Exception{
    try{
    CarModel c = new CarModel("audi A3 sportback","Audi",22000,4,EnumFuelType.PETROL);
    fail();}
    catch(Exception ex){assertEquals("Wrong engine size",ex.getMessage());}
    }
    @Test
    public void testValidSetEngineSize() throws Exception{
    CarModel c = new CarModel("audi A3 sportback","Audi",1500,4,EnumFuelType.PETROL);
    try{
    c.setEngineSize(3000);
    assertEquals(3000,c.getEngineSize());}
    catch(Exception ex){fail();}
    }
    @Test
    public void testInValidSetEngineSize() throws Exception{
    CarModel c = new CarModel("audi A3 sportback","Audi",1500,4,EnumFuelType.PETROL);
    try{c.setEngineSize(-3000);fail();}
    catch(Exception ex){assertEquals("Wrong engine size",ex.getMessage());}
    }
    @Test
    public void testInValidSetEngineSize2() throws Exception{
    CarModel c = new CarModel("audi A3 sportback","Audi",1500,4,EnumFuelType.PETROL);
    try{c.setEngineSize(30000);fail();}
    catch(Exception ex){assertEquals("Wrong engine size",ex.getMessage());}
    }
        
    @Test
    public void testValidGetSeats() throws Exception{
    try{
    CarModel c = new CarModel("audi A3 sportback","Audi",1500,4,EnumFuelType.PETROL);
    assertEquals(4,c.getSeats());}
    catch(Exception ex){fail();}
    }
    @Test
    public void testInvalidSeats() throws Exception{
    try{
    CarModel c = new CarModel("audi A3 sportback","Audi",1500,-4,EnumFuelType.PETROL);}
    catch(Exception ex){assertEquals("Wrong number of seats",ex.getMessage());}
    }
    @Test
    public void testInvalidSeats2() throws Exception{
    try{
    CarModel c = new CarModel("audi A3 sportback","Audi",1500,11111,EnumFuelType.PETROL);}
    catch(Exception ex){assertEquals("Wrong number of seats",ex.getMessage());}
    }
    @Test
    public void testValidSetSeats() throws Exception{
    try{
    CarModel c = new CarModel("audi A3 sportback","Audi",1500,4,EnumFuelType.PETROL);
    c.setSeats(2);
    assertEquals(2,c.getSeats());}
    catch(Exception ex){fail();}
    }
    @Test
    public void testInvalidSetSeats() throws Exception{
    CarModel c = new CarModel("audi A3 sportback","Audi",1500,4,EnumFuelType.PETROL);
    try {c.setSeats(-2); }   
    catch(Exception ex){assertEquals("Wrong number of seats",ex.getMessage());}
    }
    @Test
    public void testInvalidSetSeats2() throws Exception{
    CarModel c = new CarModel("audi A3 sportback","Audi",1500,4,EnumFuelType.PETROL);
    try {c.setSeats(22); }   
    catch(Exception ex){assertEquals("Wrong number of seats",ex.getMessage());}
    }
    
    @Test
    public void testValidGetFuelType() throws Exception{
    CarModel c = new CarModel("audi A3 sportback","Audi",1500,4,EnumFuelType.PETROL);
    assertEquals(EnumFuelType.PETROL,c.getFuelType());
    }
    @Test
    public void testValidSetFuelType() throws Exception{
    CarModel c = new CarModel("audi A3 sportback","Audi",1500,4,EnumFuelType.PETROL);
    c.setFuelType(EnumFuelType.DIESEL);
    assertEquals(EnumFuelType.DIESEL,c.getFuelType());
    }
    
}
