/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qualitycars;

import java.util.Date;

// @author Ira Paniukova

abstract public class Person {
    private String name, address, phone;
    private int id;
    private EnumGender gender;
    private Date birthDate;
    public Person(int id, String name,EnumGender gender,Date birthDate, String address,String phone)
    {   setPersonId(id); this.name=name;this.gender=gender;
        this.birthDate=birthDate; this.address=address; this.phone=phone; }

    public String getPersonName() {return name;}
    public String getAddress() {return address;}
    public String getPhone() {return phone;}
    public int getPersonId() {return id;}
    public EnumGender getGender() {return gender;}
    public Date getBirthDate() {return birthDate;}

    public void setPersonName(String name) {this.name = name;}
    public void setAddress(String address) {this.address = address;}
    public void setPhone(String phone) {this.phone = phone;}
    public void setPersonId(int id) {
        if(id>=0)
        {this.id = id;}}
    public void setGender(EnumGender gender) {this.gender = gender; }
    public void setBirthDate(Date birthDate) {this.birthDate = birthDate;}    
}
