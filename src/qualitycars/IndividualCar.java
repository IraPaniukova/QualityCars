/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qualitycars;

import java.time.Year;
import java.util.ArrayList;
import java.util.Date;



//@author Ira Paniukova
 
public class IndividualCar  {
    /* registration number, Warrant of Fitness (WOF) expiry date, rental amount per day,
      colour, year of manufacture, status (whether it is on the shop, rented out or under maintenance),
        date it rents and date due back in, body type*/
    private String regNumber,colour;
    private EnumBodyType bodyType;
    private Date expDateWOF,rentDate,backDueDate;  
    private double rentPerDay;
    private int year;
    private CarModel carModel;
    private ArrayList<CarModel> models;
    private EnumStatus status;
    
    //I do not know how else to handle exceptions, so I will create this almost empty constructor
    public IndividualCar(CarModel carModel)  {this.models=new ArrayList<>();}   

    //cars which are not rented cannot have the dates of rent or clients
    public IndividualCar(CarModel carModel,String regNumber,Date expDateWOF   
                        ,EnumBodyType bodyType,int year,String colour
                        ,double rentPerDay,EnumStatus status)  throws Exception
    {   this.carModel=carModel; this.regNumber = regNumber;this.colour = colour;
        this.expDateWOF = expDateWOF;setRentPerDay(rentPerDay);
        setYear(year);this.status = status; this.bodyType=bodyType; this.models=new ArrayList<>();}
    //to add rent dates:
        public IndividualCar(CarModel carModel,String regNumber,Date expDateWOF
                        ,EnumBodyType bodyType,int year,String colour
                        ,double rentPerDay,EnumStatus status,
                        Date rentDate,Date backDueDate) throws Exception
        {   this.carModel=carModel; this.regNumber = regNumber;this.colour = colour;
        this.expDateWOF = expDateWOF;this.rentDate = rentDate;
        this.backDueDate = backDueDate;setRentPerDay(rentPerDay);
        setYear(year);this.status = status; this.bodyType=bodyType;this.models=new ArrayList<>(); }     

    public String getRegNumber() {return regNumber;}
    public String getColour() {return colour; }
    public EnumStatus getStatus() {return status;}
    public EnumBodyType getBodyType() {return bodyType;}
    public Date getExpDateWOF() {return expDateWOF;}
    public Date getRentDate() {return rentDate;}
    public Date getBackDueDate() {return backDueDate;}
    public double getRentPerDay() {return rentPerDay;}
    public int getYear() {return year;}
    public CarModel getCarModel() {return carModel;}
    public ArrayList<CarModel> getModelArrayList() {return models;}
        
    public void setRegNumber(String regNumber) {this.regNumber = regNumber;}
    public void setColour(String colour) {this.colour= colour; }
    public void setStatus(EnumStatus status) {this.status= status;}
    public void setBodyType(EnumBodyType bodyType) {this.bodyType= bodyType;}
    public void setExpDateWOF(Date expDateWOF) {this.expDateWOF= expDateWOF;}
    public void setRentDate(Date rentDate) {this.rentDate= rentDate;}
    public void setBackDueDate(Date backDueDate) {this.backDueDate= backDueDate;}
    public void setRentPerDay(double rentPerDay) throws Exception {
        if (rentPerDay>=0)
        {this.rentPerDay= rentPerDay;}
        else {throw new Exception("Rent is negative");}}
    public void setYear(int year) throws Exception{
        if (year>=1886&& year<=Year.now().getValue()) 
        {this.year= year;}
        else {throw new Exception("Wrong year");}}
    public void setCarModel(CarModel carModel) {this.carModel = carModel; }
    public void setModelArrayList(ArrayList<CarModel> models) {this.models = models;}  
        
    public CarModel searchModel(String modelName)
    {   
        CarModel found = null;
        for (CarModel model:models)       
        {   if (model.getModel().equals(modelName))
            {   found = model;
            
                break;}}
        return found;}

    public void addModel (CarModel m)
    { this.models.add(m);} 
    
     
}
