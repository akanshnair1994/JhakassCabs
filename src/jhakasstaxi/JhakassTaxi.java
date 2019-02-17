/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jhakasstaxi;

import java.util.Date;

/**
 *
 * @author 1895271
 */
public class JhakassTaxi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Person person = new Person("Jameel","Altaf",512,"montreal","male");
        Driver driver = new Driver("samriti",1234,new Date(),2, person.firstName, person.lastName, person.phoneNo, person.address, person.gender);
        Customer customer = new Customer("321",new Date(),"premium","VISA","adult", person.firstName, person.lastName, person.phoneNo, person.address, person.gender);
        Taxi taxi = new Taxi(1234, "Ambasedor", 4);
        Drive drive = new Drive(new Date(), 24, 24.0, "Sherbrooke", "Snowdon");
        Rating rating = new Rating("14", "No comments");
    }
    
}
