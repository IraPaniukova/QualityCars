/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qualitycars;

//@author Ira Paniukova



public class CarModel {
    // model of the car, manufacture name, Engine size, number of seats and fuel type (petrol, diesel or hybrid)
    private String model,manufacturer;  
    private int engineSize,seats;
    private EnumFuelType fuel;
    
    
    public CarModel(String model,String manufacturer,int engineSize,int seats,EnumFuelType fuel) throws Exception
    {   this.model=model;this.manufacturer=manufacturer;
        setEngineSize(engineSize);setSeats(seats);this.fuel=fuel;}  


    public String getModel() {return model; }
    public String getManufacturer() {return manufacturer;}
    public int getEngineSize() { return engineSize;}
    public int getSeats() {return seats;}
    public EnumFuelType getFuelType() {return fuel;}  
    
    public void setModel(String model) {this.model= model; }
    public void setManufacturer(String manufacturer) {this.manufacturer= manufacturer;}
    public void setEngineSize(int engineSize) throws Exception {
        if(engineSize>=0&&engineSize<14000) //just imagine that I had these spoecifictions form a client. Th engine size in cc and it is less than 14000
        {this.engineSize= engineSize;}
        else {throw new Exception("Wrong engine size");}}
    public void setSeats(int seats) throws Exception {
        if(seats>=0&&seats<16)  //I googled and couldn't find cars with more seats that15, so assuiming 15 is max
        {this.seats= seats;}
        else {throw new Exception("Wrong number of seats");}}    
    public void setFuelType(EnumFuelType fuel) {this.fuel= fuel;} 
    
    
}
