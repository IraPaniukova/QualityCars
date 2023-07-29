/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qualitycars;

//@author Ira Paniukova

import java.util.Date;


public class Employee extends Person{
    //  phone  extension  number,  login  details (username and password) and role like admin or staff.
    private String username,password,role;
    private int phoneExt; 
    
    public Employee(int id, String name,EnumGender gender,Date birthDate, String address,String phone,
                   int phoneExt,String username,String password,String role)
    {
        super (id,name,gender,birthDate,address,phone);
        setPhoneExt(phoneExt); this.username=username;
        this.password=password; this.role=role;
    }

    public String getUsername() {return username;}
    public String getPassword() {return password;}
    public String getRole() {return role;}
    public int getPhoneExt() {return phoneExt;}

    public void setUsername(String username) {this.username = username; }
    public void setPassword(String password) {this.password = password;}
    public void setRole(String role) {this.role = role;}
    public void setPhoneExt(int phoneExt) {
        if(phoneExt>=0)
        {this.phoneExt = phoneExt;}}    
}
