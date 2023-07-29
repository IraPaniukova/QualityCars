/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qualitycars;

/**
 *
 * @author I
 */
public class RentedCar {
    private Client client;
    private IndividualCar car;

    /**
     *
     * @param client
     * @param car
     */
    public RentedCar(Client client,IndividualCar car)
    {this.client=client;this.car=car;}

    public Client getClient() {return client;}
    public IndividualCar getCar() {return car;}

    public void setClient(Client client) {this.client = client;}
    public void setCar(IndividualCar car) {this.car = car;}
    
    
    
    
}
