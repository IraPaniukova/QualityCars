/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package qualitycars;

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
public class RentedCarTest  {
    
    public RentedCarTest() {
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

   
    CarModel a;CarModel b;
    IndividualCar indCar;
    IndividualCar indCar2;
    
    public void Hmm(){   
        try{
            a = new CarModel("audi A3 sportback","Audi",1500,4,EnumFuelType.PETROL);
            b = new CarModel("Ford Focus","Ford",1200,4,EnumFuelType.HYBRID);
            indCar = new IndividualCar(a,"123",new Date(),EnumBodyType.SUV,2000,
                    "red",100.00,EnumStatus.IN_THE_SHOP, new Date(),new Date());
            indCar2 = new IndividualCar(b,"456",new Date(),EnumBodyType.VAN,2011,
                    "blue",100.00,EnumStatus.UNDER_MAINTENANCE, new Date(),new Date());
        }
        
        
        catch (Exception ex){}
     }
    

    Client client = new Client(12345,"John",EnumGender.MALE,new Date(),"John's Address",
                "095-233-22","KA11112","class A",new Date(),new Date(),"new");
    Client client2 = new Client(777,"Ann",EnumGender.FEMALE,new Date(),"Ann's Address",
                "095-21-255","BE3332","class A",new Date(),new Date(),"old");
    RentedCar rentedCar = new RentedCar(client,indCar);
    
    @Test
    public void testValidGetClient() {
    assertEquals(client, rentedCar.getClient());
    }
    @Test
    public void testValidSetClient() {
    rentedCar.setClient(client2);
    assertEquals(client2, rentedCar.getClient());
    }
    @Test
    public void testValidGetCar() {
    assertEquals(indCar, rentedCar.getCar());
    }
    @Test
    public void testValidSetCar() {
    rentedCar.setCar(indCar2);
    assertEquals(indCar2, rentedCar.getCar());
    }
    
} 
    

