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
    String driverId;
    String id;
    Date dateOfLicense;
    int experience;
    Date newId;

    public void setDriverName(String DriverName) {
        driverName = DriverName;
    }

    public void setDriverId(String driverId) {
        this.driverId = driverId;
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

    public String getDriverId() {
        return driverId;
    }

    public Date getDateOfLicense() {
        return dateOfLicense;
    }

    public int getExperience() {
        return experience;
    }

    public Driver(Date newId, String driverName, String driverId, Date dateOfLicense, int experience, Date superDate, String firstName, String lastName, int phoneNo, String address, String gender) {
        super(superDate, firstName, lastName, phoneNo, address, gender);
        id = createID(newId, driverName);
        this.driverName = driverName;
        this.driverId = driverId;
        this.dateOfLicense = dateOfLicense;
        this.experience = experience;
    }
    
    public void displayDriver() {
        System.out.println("Driver Details: ");
        System.out.println("Driver ID: " + driverId);
        System.out.println("Person ID: " + super.newId);
        System.out.println("Driver Name: " + driverName);
        System.out.println("ID: " + id);
        System.out.println("Date of License: " + dateOfLicense);
        System.out.println("Experience: " + experience);
        super.displayPerson();
        System.out.println();
    }
     public static String createID(Date newDate, String name) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MMM-dd");
        String date = sdf.format(newDate);
        String[] dt = date.split("-");
        String dtInt;
        if (Integer.parseInt(dt[2]) % 2 == 0)
            dtInt = "E";
        else
            dtInt = "O";
        String mnt = dt[1];
        String yr = dt[0].substring(2);
        String fChar = "";
        if (name.length() == 1)
            fChar += "X";
        if (name.length() == 2)
            fChar += name;
        else if (name.equals(""))
            fChar = "XX";
        else
            fChar = name.substring(0, 1);
        
        String lChar = "";
        if (name.length() == 1)
            lChar += "X";
        else if (name.length() == 2) 
            lChar += name;
        else if (name.equals(""))
            lChar = "XX";
        else
            lChar = name.substring(name.length()-1);
        String id = yr+"-"+mnt+"-"+dtInt+"-";
        if (name.equals(""))
            id += "XX";
        else if (name.length() == 2)
            id += name;
        else
            id += fChar.toUpperCase() + lChar.toUpperCase();
        
        return id;
    }
}
