/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qualitycars;

import java.time.LocalDate;
import java.util.Date;

//@author Ira Paniukova

public class Client extends Person{
    // license number, license type and license expiry date
    private String licenseNumber,licenseType,newOrOld;
    private Date licenseExpDate, todayDate;
    
    
    public Client(int id, String name,EnumGender gender,Date birthDate, String address,String phone,
                   String licenseNumber, String licenseType, Date licenseExpDate,Date todayDate,String newOrOld)
    {
        super (id,name,gender,birthDate,address,phone);
        this.licenseNumber=licenseNumber; this.licenseType=licenseType;
        this.licenseExpDate=licenseExpDate;this.todayDate=todayDate;this.newOrOld=newOrOld;
    }

    public String getLicenseNumber() {return licenseNumber;}
    public String getLicenseType() {return licenseType;}
    public Date getLicenseExpDate() {return licenseExpDate;}
    public Date getDate() {return todayDate;}
    public String getNewOrOld() {return newOrOld;}
    
    public void setLicenseNumber(String licenseNumber) {this.licenseNumber = licenseNumber;}
    public void setLicenseType(String licenseType) {this.licenseType = licenseType;}
    public void setLicenseExpDate(Date licenseExpDate) {this.licenseExpDate = licenseExpDate;}
    public void setNewOrOld(String newOrOld) { this.newOrOld = newOrOld; }
    
    
    
    
}
