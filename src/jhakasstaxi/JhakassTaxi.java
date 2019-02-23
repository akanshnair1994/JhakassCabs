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
        System.out.println("---------------------Initial Details---------------------");
        Person person = new Person(new Date(), "Jameel","Altaf",512,"montreal","male");
        Driver driver = new Driver("samriti",1234,new Date(),2, new Date(), person.firstName, person.lastName, person.phoneNo, person.address, person.gender);
        Customer customer = new Customer("321",new Date(),"premium","VISA","adult", new Date(), person.firstName, person.lastName, person.phoneNo, person.address, person.gender);
        Taxi taxi = new Taxi(new Date(), 1234, "Ambasedor", 4);
        Drive drive = new Drive(new Date(), new Date(), 24, 24.0, "Sherbrooke", "Snowdon");
        Rating rating = new Rating(new Date(), "14", "No comments");
        
        person.displayPerson();
        driver.displayDriver();
        drive.displayDrive();
        customer.displayPerson();
        taxi.displayTaxi();
        rating.displayRating();
        
        System.out.println();
        
        System.out.println("---------------------Changed Details---------------------");
        person = new Person(new Date(), "Harsh","Acharya",512,"montreal","male");
        driver = new Driver("Harsh",1234,new Date(),2, new Date(), person.firstName, person.lastName, person.phoneNo, person.address, person.gender);
        customer = new Customer("1234",new Date(),"Gold","DC","child", new Date(), person.firstName, person.lastName, person.phoneNo, person.address, person.gender);
        taxi = new Taxi(new Date(), 7894, "Galardo", 4);
        drive = new Drive(new Date(), new Date(), 24, 24.0, "St. Mathieu", "Sherbrooke");
        rating = new Rating(new Date(), "456", "Comments");
        
        person.displayPerson();
        driver.displayDriver();
        drive.displayDrive();
        customer.displayPerson();
        taxi.displayTaxi();
        rating.displayRating();
    }
    
}
