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
    String Model;
    int Capacity;
    Driver driver;
    

    public Taxi(int taxiNumber, String Model, int Capacity) {
        this.taxiNumber = taxiNumber;
        this.Model = Model;
    }

    public void settaxiNumber(int taxiNumber) {
        this.taxiNumber = taxiNumber;
    }

    public int gettaxiNumber() {
        return taxiNumber;
    }

    public void setModel(String Model) {
        this.Model = Model;
    }

    public String getModel() {
        return Model;
    }

    public void setCapacity(int Capacity) {
        this.Capacity = Capacity;
    }

    public int getCapacity() {
        return Capacity;
    }

}
