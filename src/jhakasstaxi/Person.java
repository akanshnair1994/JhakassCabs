/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jhakasstaxi;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author 1896513
 */
public class Person {

    String firstName;
    String lastName;
    int phoneNo;
    String address;
    String gender;
    String newId;

    public Person(Date id, String firstName, String lastName, int phoneNo, String address, String gender) {
        newId = createID(id, firstName);
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNo = phoneNo;
        this.address = address;
        this.gender = gender;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setPhoneNo(int phoneNo) {
        this.phoneNo = phoneNo;
    }

    public int getPhoneno() {
        return phoneNo;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }

    public void displayPerson() {
        System.out.println("Person Details: ");
        System.out.println("ID: " + newId);
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Address: " + address);
        System.out.println("Gender: " + gender);
        System.out.println("");
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
