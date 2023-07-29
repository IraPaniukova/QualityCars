/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package qualitycars;

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
public class StockTest {
    
    public StockTest() {
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
    public void testValidAddCarAndGetCar(){
        try{
        CarModel a = new CarModel("audi A3 sportback","Audi",1500,4,EnumFuelType.PETROL);
        CarModel b = new CarModel("Ford Focus","Ford",1200,4,EnumFuelType.HYBRID);
        IndividualCar indCar1 = new IndividualCar(a,"123",new Date(),EnumBodyType.SUV,2000,
                "red",100.00,EnumStatus.IN_THE_SHOP, new Date(),new Date());
        IndividualCar indCar2= new IndividualCar(b,"456",new Date(),EnumBodyType.VAN,2011,
                "blue",100.00,EnumStatus.UNDER_MAINTENANCE, new Date(),new Date());
        Stock s = new Stock();
        ArrayList<IndividualCar> c =new ArrayList<>();
        c.add(indCar1);c.add(indCar2);
        s.addCar(indCar1);s.addCar(indCar2);
        assertEquals(c, s.getCars());
        }
        catch (Exception ex){fail();}
    }
    @Test
    public void testValidAddClientAndGetClient(){
        Stock s = new Stock();
        Client client1 = new Client(111,"John",EnumGender.MALE,new Date(),"John's Address",
                "095-233-22","KA11112","class A",new Date(),new Date(),"new");
        ArrayList<Client> c =new ArrayList<>();
        c.add(client1);
        s.addClient(client1);
        assertEquals(c, s.getClients());
    }
    @Test
    public void testValidAddEmployeeAndGetEmployee(){
        Stock s = new Stock();
        Employee employee1 = new Employee(333,"Liam",EnumGender.MALE,new Date(),"Liam's Address",
                "23322",21,"User1","Password1","salesperson"); 
        ArrayList<Employee> e =new ArrayList<>();
        e.add(employee1);
        s.addEmployee(employee1);
        assertEquals(e, s.getEmployees());
    }
    @Test
    public void testValidAddRentedCarAndGetRentedCar() throws Exception{
        try{
        Stock s = new Stock();
        CarModel a = new CarModel("audi A3 sportback","Audi",1500,4,EnumFuelType.PETROL);
        Client client1 = new Client(111,"John",EnumGender.MALE,new Date(),"John's Address",
                "095-233-22","KA11112","class A",new Date(),new Date(),"new");
        IndividualCar indCar1 = new IndividualCar(a,"123",new Date(),EnumBodyType.SUV,2000,
                "red",100.00,EnumStatus.IN_THE_SHOP, new Date(),new Date());
        RentedCar rentedCar1 = new RentedCar(client1,indCar1);
        ArrayList<RentedCar> r =new ArrayList<>();
        r.add(rentedCar1);
        s.addRentedCar(rentedCar1);
        assertEquals(r, s.getRentedCars());}
        catch (Exception ex){fail();}
    }
    @Test        
    public void testValidSearchRentedCarByRegNo(){
        try{
        Stock s = new Stock();
        CarModel a = new CarModel("audi A3 sportback","Audi",1500,4,EnumFuelType.PETROL);
        CarModel b = new CarModel("Ford Focus","Ford",1200,4,EnumFuelType.HYBRID);
        IndividualCar indCar1 = new IndividualCar(a,"123",new Date(),EnumBodyType.SUV,2000,
                "red",100.00,EnumStatus.IN_THE_SHOP, new Date(),new Date());
        IndividualCar indCar2= new IndividualCar(b,"456",new Date(),EnumBodyType.VAN,2011,
                "blue",100.00,EnumStatus.UNDER_MAINTENANCE, new Date(),new Date());
        Client client1 = new Client(111,"John",EnumGender.MALE,new Date(),"John's Address",
                "095-233-22","KA11112","class A",new Date(),new Date(),"new");
        Client client2 = new Client(222,"Ann",EnumGender.FEMALE,new Date(),"Ann's Address",
                "095-21-255","BE3332","class A",new Date(),new Date(),"old");
        RentedCar rentedCar1 = new RentedCar(client1,indCar1);
        RentedCar rentedCar2 = new RentedCar(client2,indCar2);        
        s.addRentedCar(rentedCar1);
        s.addRentedCar(rentedCar2);
        assertEquals(rentedCar1, s.searchRentedCarByRegNo("123"));   }  
        catch(Exception ex){fail();}
    }
    @Test        
    public void testInValidSearchRentedCarByRegNo() throws Exception{
        try{
        Stock s = new Stock();
        CarModel a = new CarModel("audi A3 sportback","Audi",1500,4,EnumFuelType.PETROL);
        CarModel b = new CarModel("Ford Focus","Ford",1200,4,EnumFuelType.HYBRID);
        IndividualCar indCar1 = new IndividualCar(a,"123",new Date(),EnumBodyType.SUV,2000,
                "red",100.00,EnumStatus.IN_THE_SHOP, new Date(),new Date());
        IndividualCar indCar2= new IndividualCar(b,"456",new Date(),EnumBodyType.VAN,2011,
                "blue",100.00,EnumStatus.UNDER_MAINTENANCE, new Date(),new Date());
        Client client1 = new Client(111,"John",EnumGender.MALE,new Date(),"John's Address",
                "095-233-22","KA11112","class A",new Date(),new Date(),"new");
        Client client2 = new Client(222,"Ann",EnumGender.FEMALE,new Date(),"Ann's Address",
                "095-21-255","BE3332","class A",new Date(),new Date(),"old");
        RentedCar rentedCar1 = new RentedCar(client1,indCar1);
        RentedCar rentedCar2 = new RentedCar(client2,indCar2);
        s.addRentedCar(rentedCar1);
        s.addRentedCar(rentedCar2);
        assertNotEquals(rentedCar1, s.searchRentedCarByRegNo("777"));  
        assertNotEquals(rentedCar2, s.searchRentedCarByRegNo("777"));}
        catch(Exception ex){fail();}
    }
    @Test        
    public void testValidSearchRentedCarByClientID() throws Exception{
        try{
        Stock s = new Stock();
        CarModel a = new CarModel("audi A3 sportback","Audi",1500,4,EnumFuelType.PETROL);
        CarModel b = new CarModel("Ford Focus","Ford",1200,4,EnumFuelType.HYBRID);
        IndividualCar indCar1 = new IndividualCar(a,"123",new Date(),EnumBodyType.SUV,2000,
                "red",100.00,EnumStatus.IN_THE_SHOP, new Date(),new Date());
        IndividualCar indCar2= new IndividualCar(b,"456",new Date(),EnumBodyType.VAN,2011,
                "blue",100.00,EnumStatus.UNDER_MAINTENANCE, new Date(),new Date());
        Client client1 = new Client(111,"John",EnumGender.MALE,new Date(),"John's Address",
                "095-233-22","KA11112","class A",new Date(),new Date(),"new");
        Client client2 = new Client(222,"Ann",EnumGender.FEMALE,new Date(),"Ann's Address",
                "095-21-255","BE3332","class A",new Date(),new Date(),"old");
        RentedCar rentedCar1 = new RentedCar(client1,indCar1);
        RentedCar rentedCar2 = new RentedCar(client2,indCar2);
        s.addRentedCar(rentedCar1);
        s.addRentedCar(rentedCar2);
        assertEquals(rentedCar1, s.searchRentedCarByClientID(111));   } 
        catch(Exception ex){fail();}
    }
    @Test        
    public void testInValidSearchRentedCarByClientID() throws Exception{
        try{
        Stock s = new Stock();
        CarModel a = new CarModel("audi A3 sportback","Audi",1500,4,EnumFuelType.PETROL);
        CarModel b = new CarModel("Ford Focus","Ford",1200,4,EnumFuelType.HYBRID);
        IndividualCar indCar1 = new IndividualCar(a,"123",new Date(),EnumBodyType.SUV,2000,
                "red",100.00,EnumStatus.IN_THE_SHOP, new Date(),new Date());
        IndividualCar indCar2= new IndividualCar(b,"456",new Date(),EnumBodyType.VAN,2011,
                "blue",100.00,EnumStatus.UNDER_MAINTENANCE, new Date(),new Date());
        Client client1 = new Client(111,"John",EnumGender.MALE,new Date(),"John's Address",
                "095-233-22","KA11112","class A",new Date(),new Date(),"new");
        Client client2 = new Client(222,"Ann",EnumGender.FEMALE,new Date(),"Ann's Address",
                "095-21-255","BE3332","class A",new Date(),new Date(),"old");
        RentedCar rentedCar1 = new RentedCar(client1,indCar1);
        RentedCar rentedCar2 = new RentedCar(client2,indCar2);
        s.addRentedCar(rentedCar1);
        s.addRentedCar(rentedCar2);
        assertNotEquals(rentedCar1, s.searchRentedCarByClientID(777));  
        assertNotEquals(rentedCar2, s.searchRentedCarByClientID(777));}
        catch(Exception ex){fail();}
    }
    @Test        
    public void testValidSearchClient(){
        Stock s = new Stock();
        Client client1 = new Client(111,"John",EnumGender.MALE,new Date(),"John's Address",
                "095-233-22","KA11112","class A",new Date(),new Date(),"new");
        Client client2 = new Client(222,"Ann",EnumGender.FEMALE,new Date(),"Ann's Address",
                "095-21-255","BE3332","class A",new Date(),new Date(),"old");
        s.addClient(client1);
        s.addClient(client2);
        assertEquals(client1, s.searchClient(111));        
    }
    @Test        
    public void testInValidSearchClient(){
        Stock s = new Stock();
        Client client1 = new Client(111,"John",EnumGender.MALE,new Date(),"John's Address",
                "095-233-22","KA11112","class A",new Date(),new Date(),"new");
        Client client2 = new Client(222,"Ann",EnumGender.FEMALE,new Date(),"Ann's Address",
                "095-21-255","BE3332","class A",new Date(),new Date(),"old");
        s.addClient(client1);
        s.addClient(client2);
        assertNotEquals(client1, s.searchClient(777));  
        assertNotEquals(client2, s.searchClient(777));
    }
    @Test        
    public void testValidSearchEmployee(){
        Stock s = new Stock();
        Employee employee1 = new Employee(333,"Liam",EnumGender.MALE,new Date(),"Liam's Address",
                "23322",21,"User1","Password1","salesperson"); 
        Employee employee2 = new Employee(444,"Simon",EnumGender.MALE,new Date(),"Simon's Address",
                "23322",21,"User2","Password2","manager");
        s.addEmployee(employee1);
        s.addEmployee(employee2);
        assertEquals(employee1, s.searchEmployee(333));        
    }
    @Test        
    public void testInValidSearchEmployee(){
        Stock s = new Stock();
        Employee employee1 = new Employee(333,"Liam",EnumGender.MALE,new Date(),"Liam's Address",
                "23322",21,"User1","Password1","salesperson"); 
        Employee employee2 = new Employee(444,"Simon",EnumGender.MALE,new Date(),"Simon's Address",
                "23322",21,"User2","Password2","manager");
        s.addEmployee(employee1);
        s.addEmployee(employee2);
        assertNotEquals(employee1, s.searchClient(777));  
        assertNotEquals(employee2, s.searchClient(777));
    }
    @Test        
    public void testValidSearchCarByRegNumber(){
        try{
        Stock s = new Stock();
        CarModel a = new CarModel("audi A3 sportback","Audi",1500,4,EnumFuelType.PETROL);
        CarModel b = new CarModel("Ford Focus","Ford",1200,4,EnumFuelType.HYBRID);
        IndividualCar indCar1 = new IndividualCar(a,"123",new Date(),EnumBodyType.SUV,2000,
                "red",100.00,EnumStatus.RENTED_OUT, new Date(),new Date());
        IndividualCar indCar2 = new IndividualCar(b,"456",new Date(),EnumBodyType.VAN,2011,
                "blue",100.00,EnumStatus.RENTED_OUT, new Date(),new Date());
        s.addCar(indCar1);
        s.addCar(indCar2);
        assertEquals(indCar1, s.searchCarByRegNumber("123"));  }
        catch(Exception ex){fail();}
    }
    @Test        
    public void testInValidSearchCarByRegNumber() throws Exception{
        
        try{
        Stock s = new Stock();
        CarModel a = new CarModel("audi A3 sportback","Audi",1500,4,EnumFuelType.PETROL);
        CarModel b = new CarModel("Ford Focus","Ford",1200,4,EnumFuelType.HYBRID);
        IndividualCar indCar1 = new IndividualCar(a,"123",new Date(),EnumBodyType.SUV,2000,
                "red",100.00,EnumStatus.RENTED_OUT, new Date(),new Date());
        IndividualCar indCar2 = new IndividualCar(b,"456",new Date(),EnumBodyType.VAN,2011,
                "blue",100.00,EnumStatus.RENTED_OUT, new Date(),new Date());
        s.addCar(indCar1);
        s.addCar(indCar2);
        assertNotEquals(indCar1, s.searchRentedCarByClientID(777));  
        assertNotEquals(indCar2, s.searchRentedCarByClientID(777));}
        catch(Exception ex){fail();}
    }
    @Test        
    public void testValidReplaceCarModel() throws Exception{
        try{
        Stock s = new Stock();
        CarModel a = new CarModel("audi A3 sportback","Audi",1500,4,EnumFuelType.PETROL);
        CarModel b = new CarModel("Ford Focus","Ford",1200,4,EnumFuelType.HYBRID);
        IndividualCar indCar1 = new IndividualCar(a,"123",new Date(),EnumBodyType.SUV,2000,
                "red",100.00,EnumStatus.RENTED_OUT, new Date(),new Date());
        IndividualCar indCar2 = new IndividualCar(b,"456",new Date(),EnumBodyType.VAN,2011,
                "blue",100.00,EnumStatus.RENTED_OUT, new Date(),new Date());
        s.addCar(indCar1);
        s.addCar(indCar2);
        CarModel carModel = new CarModel("Ford Focus","Ford Company",1000,2,EnumFuelType.DIESEL);
        s.replaceCarModel("Ford Focus",carModel);
        assertEquals(carModel, s.getCars().get(1).getCarModel()); 
        assertNotEquals(carModel, s.getCars().get(0).getCarModel());  }
        catch(Exception ex){fail();}
    }
    @Test        
    public void testInValidReplaceCarModel() throws Exception{
        try{
        Stock s = new Stock();
        CarModel a = new CarModel("audi A3 sportback","Audi",1500,4,EnumFuelType.PETROL);
        CarModel b = new CarModel("Ford Focus","Ford",1200,4,EnumFuelType.HYBRID);
        IndividualCar indCar1 = new IndividualCar(a,"123",new Date(),EnumBodyType.SUV,2000,
                "red",100.00,EnumStatus.RENTED_OUT, new Date(),new Date());
        IndividualCar indCar2 = new IndividualCar(b,"456",new Date(),EnumBodyType.VAN,2011,
                "blue",100.00,EnumStatus.RENTED_OUT, new Date(),new Date());
        s.addCar(indCar1);
        s.addCar(indCar2);
        CarModel carModel = new CarModel("Ford Fiesta","Ford Company",1000,2,EnumFuelType.DIESEL);
        s.replaceCarModel("Ford Fiesta",carModel);
        assertNotEquals(carModel, s.getCars().get(0).getCarModel());
        assertNotEquals(carModel, s.getCars().get(1).getCarModel()); }
        catch(Exception ex){fail();}
    }

    @Test        
    public void testNoCarsForRent1(){
        Stock s = new Stock();
        try{
        CarModel a = new CarModel("audi A3 sportback","Audi",1500,4,EnumFuelType.PETROL);
        CarModel b = new CarModel("Ford Focus","Ford",1200,4,EnumFuelType.HYBRID);
        IndividualCar indCar1 = new IndividualCar(a,"123",new Date(),EnumBodyType.SUV,2000,
                "red",100.00,EnumStatus.RENTED_OUT, new Date(),new Date());
        IndividualCar indCar2 = new IndividualCar(b,"456",new Date(),EnumBodyType.VAN,2011,
                "blue",100.00,EnumStatus.RENTED_OUT, new Date(),new Date());
        s.addCar(indCar1);
        s.addCar(indCar2);
        assertEquals(true,s.noCarsForRent());}
        catch(Exception ex){fail();}
    }
    @Test        
    public void testNoCarsForRent2(){
        Stock s = new Stock();
        try{
        CarModel a = new CarModel("audi A3 sportback","Audi",1500,4,EnumFuelType.PETROL);
        CarModel b = new CarModel("Ford Focus","Ford",1200,4,EnumFuelType.HYBRID);
        IndividualCar indCar1 = new IndividualCar(a,"123",new Date(),EnumBodyType.SUV,2000,
                "red",100.00,EnumStatus.RENTED_OUT, new Date(),new Date());
        IndividualCar indCar2 = new IndividualCar(b,"456",new Date(),EnumBodyType.VAN,2011,
                "blue",100.00,EnumStatus.UNDER_MAINTENANCE, new Date(),new Date());
        s.addCar(indCar1);
        s.addCar(indCar2);
        assertEquals(true,s.noCarsForRent());}
        catch(Exception ex){fail();}
    }
    @Test        
    public void testNoCarsForRent3(){
        Stock s = new Stock();
        try{
        CarModel a = new CarModel("audi A3 sportback","Audi",1500,4,EnumFuelType.PETROL);
        CarModel b = new CarModel("Ford Focus","Ford",1200,4,EnumFuelType.HYBRID);
        IndividualCar indCar1 = new IndividualCar(a,"123",new Date(),EnumBodyType.SUV,2000,
                "red",100.00,EnumStatus.IN_THE_SHOP, new Date(),new Date());
        IndividualCar indCar2= new IndividualCar(b,"456",new Date(),EnumBodyType.VAN,2011,
                    "blue",100.00,EnumStatus.UNDER_MAINTENANCE, new Date(),new Date());
        s.addCar(indCar1);
        s.addCar(indCar2);
        assertEquals(false,s.noCarsForRent());}
        catch(Exception ex){fail();}
    }
    @Test        
    public void testNoCarsForRent4(){
        Stock s = new Stock();
        try{
        CarModel a = new CarModel("audi A3 sportback","Audi",1500,4,EnumFuelType.PETROL);
        CarModel b = new CarModel("Ford Focus","Ford",1200,4,EnumFuelType.HYBRID);
        IndividualCar indCar1 = new IndividualCar(a,"123",new Date(),EnumBodyType.SUV,2000,
                "red",100.00,EnumStatus.IN_THE_SHOP, new Date(),new Date());
        IndividualCar indCar2= new IndividualCar(b,"456",new Date(),EnumBodyType.VAN,2011,
                    "blue",100.00,EnumStatus.IN_THE_SHOP, new Date(),new Date());
        s.addCar(indCar1);
        s.addCar(indCar2);
        assertEquals(false,s.noCarsForRent());}
        catch(Exception ex){fail();}
    }
    
    @Test        
    public void testReturnRentedCar() throws Exception{
        try{
        Stock s = new Stock();
        CarModel a = new CarModel("audi A3 sportback","Audi",1500,4,EnumFuelType.PETROL);
        CarModel b = new CarModel("Ford Focus","Ford",1200,4,EnumFuelType.HYBRID);
        IndividualCar indCar1 = new IndividualCar(a,"123",new Date(),EnumBodyType.SUV,2000,
                "red",100.00,EnumStatus.IN_THE_SHOP, new Date(),new Date());
        IndividualCar indCar2= new IndividualCar(b,"456",new Date(),EnumBodyType.VAN,2011,
                    "blue",100.00,EnumStatus.UNDER_MAINTENANCE, new Date(),new Date());
        Client client1 = new Client(111,"John",EnumGender.MALE,new Date(),"John's Address",
                    "095-233-22","KA11112","class A",new Date(),new Date(),"new");
        Client client2 = new Client(222,"Ann",EnumGender.FEMALE,new Date(),"Ann's Address",
                "095-21-255","BE3332","class A",new Date(),new Date(),"old");
        RentedCar rentedCar1 = new RentedCar(client1,indCar1);
        RentedCar rentedCar2 = new RentedCar(client1,indCar2);
        s.addRentedCar(rentedCar1);
        s.addRentedCar(rentedCar2);
        assertEquals(rentedCar1,s.searchRentedCarByRegNo("123"));
        s.returnRentedCar("123");     
        assertEquals(null,s.searchRentedCarByRegNo("123"));
        assertNotEquals(rentedCar1,s.searchRentedCarByRegNo("123"));
        assertEquals(rentedCar2,s.searchRentedCarByRegNo("456"));
        }
        catch(Exception ex){fail();}
    }
    @Test        
    public void testReturnRentedCar2() throws Exception{
        try{
        Stock s = new Stock();
        CarModel a = new CarModel("audi A3 sportback","Audi",1500,4,EnumFuelType.PETROL);
        CarModel b = new CarModel("Ford Focus","Ford",1200,4,EnumFuelType.HYBRID);
        IndividualCar indCar1 = new IndividualCar(a,"123",new Date(),EnumBodyType.SUV,2000,
                "red",100.00,EnumStatus.IN_THE_SHOP, new Date(),new Date());
        IndividualCar indCar2= new IndividualCar(b,"456",new Date(),EnumBodyType.VAN,2011,
                    "blue",100.00,EnumStatus.UNDER_MAINTENANCE, new Date(),new Date());
        Client client1 = new Client(111,"John",EnumGender.MALE,new Date(),"John's Address",
                    "095-233-22","KA11112","class A",new Date(),new Date(),"new");
        Client client2 = new Client(222,"Ann",EnumGender.FEMALE,new Date(),"Ann's Address",
                "095-21-255","BE3332","class A",new Date(),new Date(),"old");
        RentedCar rentedCar1 = new RentedCar(client1,indCar1);
        RentedCar rentedCar2 = new RentedCar(client1,indCar2);
        s.addRentedCar(rentedCar1);
        s.addRentedCar(rentedCar2);
        assertEquals(rentedCar1,s.searchRentedCarByRegNo("123"));
        s.returnRentedCar("123"); s.returnRentedCar("456");     
        assertEquals(null,s.searchRentedCarByRegNo("123"));
        assertEquals(null,s.searchRentedCarByRegNo("456"));
        assertNotEquals(rentedCar1,s.searchRentedCarByRegNo("123"));
        assertNotEquals(rentedCar2,s.searchRentedCarByRegNo("456"));
        }
        catch(Exception ex){fail();}
    }
    @Test        
    public void testReturnInvalidRentedCar() throws Exception{
        try{
        Stock s = new Stock();
        CarModel a = new CarModel("audi A3 sportback","Audi",1500,4,EnumFuelType.PETROL);
        CarModel b = new CarModel("Ford Focus","Ford",1200,4,EnumFuelType.HYBRID);
        IndividualCar indCar1 = new IndividualCar(a,"123",new Date(),EnumBodyType.SUV,2000,
                "red",100.00,EnumStatus.IN_THE_SHOP, new Date(),new Date());
        IndividualCar indCar2= new IndividualCar(b,"456",new Date(),EnumBodyType.VAN,2011,
                    "blue",100.00,EnumStatus.UNDER_MAINTENANCE, new Date(),new Date());
        Client client1 = new Client(111,"John",EnumGender.MALE,new Date(),"John's Address",
                    "095-233-22","KA11112","class A",new Date(),new Date(),"new");
        Client client2 = new Client(222,"Ann",EnumGender.FEMALE,new Date(),"Ann's Address",
                "095-21-255","BE3332","class A",new Date(),new Date(),"old");
        RentedCar rentedCar1 = new RentedCar(client1,indCar1);
        RentedCar rentedCar2 = new RentedCar(client1,indCar2);
        s.addRentedCar(rentedCar1);
        s.addRentedCar(rentedCar2);
        assertEquals(rentedCar1,s.searchRentedCarByRegNo("123"));
        s.returnRentedCar("777");     
        assertEquals(rentedCar1,s.searchRentedCarByRegNo("123"));
        assertEquals(rentedCar2,s.searchRentedCarByRegNo("456"));
        }
        catch(Exception ex){fail();}
    }
    
}
