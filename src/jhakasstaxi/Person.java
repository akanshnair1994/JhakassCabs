/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jhakasstaxi;

/**
 *
 * @author 1896513
 */
public class Person {

    String firstName;
    String lastName;
    int phoneno;
    String address;
    String gender;

    public Person(String firstName, String lastName, int phoneno, String address, String gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneno = phoneno;
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

    public void setPhoneno(int Phoneno) {
        this.phoneno = Phoneno;
    }

    public int getPhoneno() {
        return phoneno;
    }

    public void setaddress(String address) {
        this.address = address;
    }

    public String getaddress() {
        return address;
    }

    public void setgender(String gender) {
        this.gender = gender;
    }

    public String getgender() {
        return gender;
    }

}
