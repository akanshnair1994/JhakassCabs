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
    String newId;

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

    public Driver(String driverName, int id, Date dateOfLicense, int experience, Date newIdSuper, String firstName, String lastName, int phoneNo, String address, String gender) {
        super(newIdSuper, firstName, lastName, phoneNo, address, gender);
        newId = createID(newIdSuper, driverName);
        this.driverName = driverName;
        this.id = id;
        this.dateOfLicense = dateOfLicense;
        this.experience = experience;
    }
    
    public void displayDriver() {
        System.out.println("Driver Details: ");
        System.out.println("ID: " + newId);
        System.out.println("Driver Name: " + driverName);
        System.out.println("ID: " + id);
        System.out.println("Date of License: " + dateOfLicense);
        System.out.println("Experience: " + experience);
        System.out.println();
    }
}
