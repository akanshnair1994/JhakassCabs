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

    public Taxi(int taxiNumber, String model, int capacity) {
        this.taxiNumber = taxiNumber;
        this.model = model;
    }

    public void setTaxiNumber(int taxiNumber) {
        this.taxiNumber = taxiNumber;
    }

    public int getTaxiNumber() {
        return taxiNumber;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }
    public void displayTaxi() {
        System.out.println("Taxi Number: " + taxiNumber + " Model: " + model + " Capacity: " + capacity );
    }
}