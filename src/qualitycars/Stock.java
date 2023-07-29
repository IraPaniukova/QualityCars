/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qualitycars;

import java.util.ArrayList;
import java.util.Date;

//@author Ira Paniukova

public class Stock {
    
    
    private ArrayList<IndividualCar> cars;
    private ArrayList<RentedCar> rentedCars;
    private ArrayList<Client> clients;
    private ArrayList<Employee> employees;
    
    
    public Stock(){this.cars=new ArrayList<>();this.rentedCars=new ArrayList<>();
                    this.clients=new ArrayList<>();this.employees=new ArrayList<>();}

    public ArrayList<IndividualCar> getCars() {return cars;}
    public ArrayList<RentedCar> getRentedCars() {return rentedCars;}
    public ArrayList<Client> getClients() {return clients;}
    public ArrayList<Employee> getEmployees() {return employees;}
 
    
    public void addRentedCar(RentedCar rentedCar)
    {this.rentedCars.add(rentedCar);}
    
    public void returnRentedCar(String regNumber) 
    {for (RentedCar car:rentedCars)
        {
            if (car.getCar().getRegNumber().equals(regNumber))
            {
            this.rentedCars.remove(car);
            break;}
        }}
    
     public RentedCar searchRentedCarByRegNo (String regNumber)
    {   RentedCar found = null;
        for (RentedCar car:rentedCars)       
        {	if (car.getCar().getRegNumber() .equals(regNumber))
            {   found = car;
                break;}
        } return found; }
     
     public RentedCar searchRentedCarByClientID (int id)
    {   RentedCar found = null;
        for (RentedCar car:rentedCars)       
        {	if (car.getClient().getPersonId()==id)
            {   found = car;
                break;}
        } return found; }
     
    
     public Client searchClient(int id)
    {   Client found = null;
        for (Client c:clients)
        {    if(c.getPersonId()==id)
            {found = c; break;}
        } return found;
    }
     
     public Employee searchEmployee(int id)
    {   Employee found = null;
        for (Employee e:employees)
        {    if(e.getPersonId()==id)
            {found = e; break;}
        } return found;
    }     
       
    public void addClient (Client client)  
    { this.clients.add(client);}
    
    public void addEmployee (Employee employee)  
    { this.employees.add(employee);}

    public void replaceCarModel(String modelName,CarModel models )
    { for (IndividualCar car:cars) 
      { if (car.getCarModel().getModel().equals(modelName) )
          {   car.setCarModel(models);}
      }
    }
    
    public void addCar(IndividualCar c)
    {   this.cars.add(c);}
    
    public IndividualCar searchCarByRegNumber (String regNumber)
    {
        IndividualCar found = null;
        for (IndividualCar car:cars)       
        {	if (car.getRegNumber().equals(regNumber))
            {   found = car;
                break;}
        } return found; 
    }
   
    public boolean noCarsForRent()
    {
        int x = 0;
        for (IndividualCar car:cars) 
        {if (car.getStatus().equals(EnumStatus.IN_THE_SHOP))
            x++;}
        return x==0;
    }

 
           
}
