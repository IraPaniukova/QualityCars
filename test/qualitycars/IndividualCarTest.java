/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package qualitycars;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.ArrayList;
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
public class IndividualCarTest {
    
    public IndividualCarTest() {
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
    public void tearDown()  {
    }

    @Test
    public void testValidGetRegNumber() throws Exception {
        try{
        CarModel c = new CarModel("audi A3 sportback","Audi",1500,4,EnumFuelType.PETROL);
        IndividualCar i = new IndividualCar(c,"123",new Date(),EnumBodyType.SUV,2000,
                "red",100.00,EnumStatus.IN_THE_SHOP, new Date(),new Date());
        assertEquals("123", i.getRegNumber());
        }
        catch(Exception ex){fail();}
    } 
    @Test
    public void testValidSetRegNumber() throws Exception {
        try{
        CarModel c = new CarModel("audi A3 sportback","Audi",1500,4,EnumFuelType.PETROL);
        IndividualCar i = new IndividualCar(c,"123",new Date(),EnumBodyType.SUV,2000,
                "red",100.00,EnumStatus.IN_THE_SHOP, new Date(),new Date());
        i.setRegNumber("345");
        assertEquals("345", i.getRegNumber());}
        catch(Exception ex){fail();}
    }
    @Test
    public void testValidGetExpDateWOF() throws Exception {
        try{
        Date x = new Date();
        CarModel c = new CarModel("audi A3 sportback","Audi",1500,4,EnumFuelType.PETROL);
        IndividualCar i = new IndividualCar(c,"123",new Date(),EnumBodyType.SUV,2000,
                "red",100.00,EnumStatus.IN_THE_SHOP, new Date(),new Date());
        assertEquals(x, i.getExpDateWOF());}
        catch(Exception ex){fail();}
    }
    @Test
    public void testValidSetExpDateWOF() throws ParseException, Exception {
        try{
        Date x = new Date();
        CarModel c = new CarModel("audi A3 sportback","Audi",1500,4,EnumFuelType.PETROL);
        IndividualCar i = new IndividualCar(c,"123",x,EnumBodyType.SUV,2000,
                "red",100.00,EnumStatus.IN_THE_SHOP, new Date(),new Date());
        String newDate="2001-12-31";
        DateFormat df=new SimpleDateFormat("yyyy-MM-dd"); 
        Date y=(Date)df.parse(newDate);
        i.setExpDateWOF(y);
        assertEquals(y, i.getExpDateWOF());        }
        catch(Exception ex){fail();}
    }
    @Test
    public void testValidGetRentDate() throws Exception {
        try{
        Date x = new Date();
        CarModel c = new CarModel("audi A3 sportback","Audi",1500,4,EnumFuelType.PETROL);
        IndividualCar i = new IndividualCar(c,"123",new Date(),EnumBodyType.SUV,2000,
                "red",100.00,EnumStatus.IN_THE_SHOP, x,new Date());
        assertEquals(x, i.getRentDate());}
        catch(Exception ex){fail();}
    }
    @Test
    public void testValidSetRentDate() throws ParseException, Exception {
        try{
        Date x = new Date();
        CarModel c = new CarModel("audi A3 sportback","Audi",1500,4,EnumFuelType.PETROL);
        IndividualCar i = new IndividualCar(c,"123",new Date(),EnumBodyType.SUV,2000,
                "red",100.00,EnumStatus.IN_THE_SHOP, x,new Date());
        String newDate="2001-12-31";
        DateFormat df=new SimpleDateFormat("yyyy-MM-dd"); 
        Date y=(Date)df.parse(newDate);
        i.setRentDate(y);
        assertEquals(y, i.getRentDate());        }
        catch(Exception ex){fail();}
    }
    @Test
    public void testValidGetBackDueDate() throws Exception {
        try{
        Date x = new Date();
        CarModel c = new CarModel("audi A3 sportback","Audi",1500,4,EnumFuelType.PETROL);
        IndividualCar i = new IndividualCar(c,"123",new Date(),EnumBodyType.SUV,2000,
                "red",100.00,EnumStatus.IN_THE_SHOP, new Date(),x);
        assertEquals(x, i.getBackDueDate());}
        catch(Exception ex){fail();}
    }
    @Test
    public void testValidSetBackDueDate() throws ParseException, Exception {
        try{
        Date x = new Date();
        CarModel c = new CarModel("audi A3 sportback","Audi",1500,4,EnumFuelType.PETROL);
        IndividualCar i = new IndividualCar(c,"123",new Date(),EnumBodyType.SUV,2000,
                "red",100.00,EnumStatus.IN_THE_SHOP, new Date(),x);
        String newDate="2001-12-31";
        DateFormat df=new SimpleDateFormat("yyyy-MM-dd"); 
        Date y=(Date)df.parse(newDate);
        i.setBackDueDate(y);
        assertEquals(y, i.getBackDueDate());        }
        catch(Exception ex){fail();}
    }
    
    @Test
    public void testValidGetBodyType() throws Exception {
        try{
        CarModel c = new CarModel("audi A3 sportback","Audi",1500,4,EnumFuelType.PETROL);
        IndividualCar i = new IndividualCar(c,"123",new Date(),EnumBodyType.SUV,2000,
                "red",100.00,EnumStatus.IN_THE_SHOP, new Date(),new Date());
        assertEquals(EnumBodyType.SUV, i.getBodyType());}
        catch(Exception ex){fail();}
    } 
    @Test
    public void testValidSetBodyType() throws Exception {
        try{
        CarModel c = new CarModel("audi A3 sportback","Audi",1500,4,EnumFuelType.PETROL);
        IndividualCar i = new IndividualCar(c,"123",new Date(),EnumBodyType.SUV,2000,
                "red",100.00,EnumStatus.IN_THE_SHOP, new Date(),new Date());
        i.setBodyType(EnumBodyType.SEDAN);
        assertEquals(EnumBodyType.SEDAN, i.getBodyType());}
        catch(Exception ex){fail();}
    }
    @Test
    public void testValidGetSatus() throws Exception {
        try{
        CarModel c = new CarModel("audi A3 sportback","Audi",1500,4,EnumFuelType.PETROL);
        IndividualCar i = new IndividualCar(c,"123",new Date(),EnumBodyType.SUV,2000,
                "red",100.00,EnumStatus.IN_THE_SHOP, new Date(),new Date());
        assertEquals(EnumStatus.IN_THE_SHOP, i.getStatus());}
        catch(Exception ex){fail();}
    } 
    @Test
    public void testValidSetStatus() throws Exception {
        try{
        CarModel c = new CarModel("audi A3 sportback","Audi",1500,4,EnumFuelType.PETROL);
        IndividualCar i = new IndividualCar(c,"123",new Date(),EnumBodyType.SUV,2000,
                "red",100.00,EnumStatus.IN_THE_SHOP, new Date(),new Date());
        i.setStatus(EnumStatus.RENTED_OUT);
        assertEquals(EnumStatus.RENTED_OUT, i.getStatus());}
        catch(Exception ex){fail();}
    }
    @Test
    public void testValidGetColour() throws Exception {
        try{
        CarModel c = new CarModel("audi A3 sportback","Audi",1500,4,EnumFuelType.PETROL);
        IndividualCar i = new IndividualCar(c,"123",new Date(),EnumBodyType.SUV,2000,
                "red",100.00,EnumStatus.IN_THE_SHOP, new Date(),new Date());
        assertEquals("red", i.getColour());}
        catch(Exception ex){fail();}
    } 
    @Test
    public void testValidSetColour() throws Exception {
        try{
        CarModel c = new CarModel("audi A3 sportback","Audi",1500,4,EnumFuelType.PETROL);
        IndividualCar i = new IndividualCar(c,"123",new Date(),EnumBodyType.SUV,2000,
                "red",100.00,EnumStatus.IN_THE_SHOP, new Date(),new Date());
        i.setColour("blue");
        assertEquals("blue", i.getColour());}
        catch(Exception ex){fail();}
    }
    
    @Test
    public void testValidGetYear() throws Exception{
        CarModel c = new CarModel("audi A3 sportback","Audi",1500,4,EnumFuelType.PETROL);
        try{
        IndividualCar i = new IndividualCar(c,"123",new Date(),EnumBodyType.SUV,2000,
                "red",100.00,EnumStatus.IN_THE_SHOP, new Date(),new Date());
        assertEquals(2000,i.getYear());}
        catch(Exception ex) {fail();}
    }
    
    @Test
    public void testValidSetYear() throws Exception{
        CarModel c = new CarModel("audi A3 sportback","Audi",1500,4,EnumFuelType.PETROL);
        IndividualCar i = new IndividualCar(c,"123",new Date(),EnumBodyType.SUV,2000,
                "red",100.00,EnumStatus.IN_THE_SHOP, new Date(),new Date());
        try{
        i.setYear(2022);
        assertEquals(2022,i.getYear());}
        catch(Exception ex){fail();}
    }
    @Test
    public void testInValidGetYear() throws Exception{
        CarModel c = new CarModel("audi A3 sportback","Audi",1500,4,EnumFuelType.PETROL);
        try{
        IndividualCar i = new IndividualCar(c,"123",new Date(),EnumBodyType.SUV,1523,
                "red",100.00,EnumStatus.IN_THE_SHOP, new Date(),new Date());
        fail();}
        catch(Exception ex){assertEquals("Wrong year",ex.getMessage());} 
    }
    
    @Test
    public void testInValidSetYear() throws Exception{
        CarModel c = new CarModel("audi A3 sportback","Audi",1500,4,EnumFuelType.PETROL);
        IndividualCar i = new IndividualCar(c,"123",new Date(),EnumBodyType.SUV,2000,
                "red",100.00,EnumStatus.IN_THE_SHOP, new Date(),new Date());
        try{
            i.setYear(3022);
            fail();}
        catch(Exception ex){assertEquals("Wrong year",ex.getMessage());} 
    }
    
    
    @Test
    public void testValidGetRentPerDay() throws Exception {
        CarModel c = new CarModel("audi A3 sportback","Audi",1500,4,EnumFuelType.PETROL);
        try{
        IndividualCar i = new IndividualCar(c,"123",new Date(),EnumBodyType.SUV,2000,
                "red",100.00,EnumStatus.IN_THE_SHOP, new Date(),new Date());
        assertEquals(100, i.getRentPerDay(),0.0001);}
        catch(Exception ex){fail();}
    } 
    @Test
    public void testInValidGetRentPerDay() throws Exception {
        CarModel c = new CarModel("audi A3 sportback","Audi",1500,4,EnumFuelType.PETROL);
        try{
            IndividualCar i = new IndividualCar(c,"123",new Date(),EnumBodyType.SUV,2000,
                    "red",-100.00,EnumStatus.IN_THE_SHOP, new Date(),new Date());
            fail();}
        catch(Exception ex){assertEquals("Rent is negative",ex.getMessage());}    
        }
    
    @Test
    public void testValidSetRentPerDay() throws Exception {
        CarModel c = new CarModel("audi A3 sportback","Audi",1500,4,EnumFuelType.PETROL);
        IndividualCar i = new IndividualCar(c,"123",new Date(),EnumBodyType.SUV,2000,
                "red",100.00,EnumStatus.IN_THE_SHOP, new Date(),new Date());
        try{
        i.setRentPerDay(50);
        assertEquals(50, i.getRentPerDay(),0.0001);}
        catch(Exception ex){fail();}
    }
    @Test
    public void testInValidSetRentPerDay() throws Exception {
        CarModel c = new CarModel("audi A3 sportback","Audi",1500,4,EnumFuelType.PETROL);
        IndividualCar i = new IndividualCar(c,"123",new Date(),EnumBodyType.SUV,2000,
                "red",100.00,EnumStatus.IN_THE_SHOP, new Date(),new Date());
        try{i.setRentPerDay(-50);fail();}
        catch(Exception ex){assertEquals("Rent is negative",ex.getMessage());}   
    }
    @Test
    public void testValidGetCarModel() throws Exception {
        try{
        CarModel c = new CarModel("audi A3 sportback","Audi",1500,4,EnumFuelType.PETROL);
        IndividualCar i = new IndividualCar(c,"123",new Date(),EnumBodyType.SUV,2000,
                "red",100.00,EnumStatus.IN_THE_SHOP, new Date(),new Date());
        assertEquals(c, i.getCarModel());}
        catch(Exception ex){fail();}
    } 
    @Test
    public void testValidSetCarModel() throws Exception {
        try{
        CarModel c = new CarModel("audi A3 sportback","Audi",1500,4,EnumFuelType.PETROL);
        CarModel  b = new CarModel("Ford Focus","Ford",1200,4,EnumFuelType.HYBRID);
        IndividualCar i = new IndividualCar(c,"123",new Date(),EnumBodyType.SUV,2000,
                "red",100.00,EnumStatus.IN_THE_SHOP, new Date(),new Date());        
        i.setCarModel(b);
        assertEquals(b, i.getCarModel());}
        catch(Exception ex){fail();}
    } 
    @Test
    public void testValidAddModelAndGetModelArrayList() throws Exception {
        try{
        CarModel c = new CarModel("audi A3 sportback","Audi",1500,4,EnumFuelType.PETROL);
        CarModel  b = new CarModel("Ford Focus","Ford",1200,4,EnumFuelType.HYBRID);
        IndividualCar i = new IndividualCar(c);
        i.addModel(c);i.addModel(b);
        assertEquals("audi A3 sportback",i.getModelArrayList().get(0).getModel());
        assertEquals(c, i.getModelArrayList().get(0));
        assertEquals(b, i.getModelArrayList().get(1));
        }
        catch(Exception ex){fail();}
    } 
    @Test
    public void testValidSetModelArrayListAndGetModelArrayList() throws Exception {
        try{
        CarModel c = new CarModel("audi A3 sportback","Audi",1500,4,EnumFuelType.PETROL);
        CarModel  b = new CarModel("Ford Focus","Ford",1200,4,EnumFuelType.HYBRID);
        IndividualCar i = new IndividualCar(c);
        ArrayList<CarModel> m= new ArrayList<>();
        m.add(c);m.add(b);        
        i.setModelArrayList(m);
        assertEquals("audi A3 sportback",i.getModelArrayList().get(0).getModel());
        assertEquals(m, i.getModelArrayList());}
        catch(Exception ex){fail();}
    } 
    
    
    @Test
    public void testValidSearchModel() throws Exception {
        try{
        CarModel c = new CarModel("audi A3 sportback","Audi",1500,4,EnumFuelType.PETROL);
        CarModel  b = new CarModel("Ford Focus","Ford",1200,4,EnumFuelType.HYBRID);
        IndividualCar i = new IndividualCar(c);
        i.addModel(c);i.addModel(b);
        assertEquals("audi A3 sportback",i.getModelArrayList().get(0).getModel());
        assertEquals(b, i.searchModel("Ford Focus"));}
        catch(Exception ex){fail();}
        
    }
    @Test
    public void testInValidSearchModel() throws Exception {
        try{
        CarModel c = new CarModel("audi A3 sportback","Audi",1500,4,EnumFuelType.PETROL);
        CarModel  b = new CarModel("Ford Focus","Ford",1200,4,EnumFuelType.HYBRID);
        IndividualCar i = new IndividualCar(c,"123",new Date(),EnumBodyType.SUV,2000,
                "red",100.00,EnumStatus.IN_THE_SHOP, new Date(),new Date());
        i.addModel(c);i.addModel(b);
        assertNotEquals(c, i.searchModel("Wrong Model"));
        assertNotEquals(b, i.searchModel("Wrong Model"));}
        catch(Exception ex){fail();}
    }
}
