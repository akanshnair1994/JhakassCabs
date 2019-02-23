package jhakasstaxi;


import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author 1894832
 */
public class Driver extends Person {

    String driverName;
    int id;
    Date dateOfLicense;
    int experience;

    public void setDriverName(String DriverName) {
        driverName = DriverName;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDateOfLicense(Date dateOfLicense) {
        this.dateOfLicense = dateOfLicense;
    }

    public void setExperience(int Experience) {
        this.experience = Experience;
    }

    public String getDriverName() {
        return driverName;
    }

    public int getId() {
        return id;
    }

    public Date getDateOfLicense() {
        return dateOfLicense;
    }

    public int getExperience() {
        return experience;
    }

    public Driver(Date newId, String driverName, int id, Date dateOfLicense, int experience, String firstName, String lastName, int phoneNo, String address, String gender) {
        super(firstName, lastName, phoneNo, address, gender);
        this.driverName = driverName;
        this.id = id;
        this.dateOfLicense = dateOfLicense;
        this.experience = experience;
    }
    
    public void displayDriver() {
        System.out.println("Driver Name: " + driverName + " ID: " + id + " Date of License: " + dateOfLicense + " Experience: " + experience);
    }
}
