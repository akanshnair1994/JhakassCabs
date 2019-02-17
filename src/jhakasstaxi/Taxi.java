/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jhakasstaxi;

/**
 *
 * @author temp
 */
public class Taxi {

    int taxiNumber;
    String model;
    int capacity;
    Driver driver;
    

    public Taxi(int taxiNumber, String model, int capacity) {
        this.taxiNumber = taxiNumber;
        this.model = model;
    }

    public void settaxiNumber(int taxiNumber) {
        this.taxiNumber = taxiNumber;
    }

    public int gettaxiNumber() {
        return taxiNumber;
    }

    public void setmodel(String model) {
        this.model = model;
    }

    public String getmodel() {
        return model;
    }

    public void setcapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getcapacity() {
        return capacity;
    }

}
