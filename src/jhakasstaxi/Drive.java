package jhakasstaxi;

import java.util.Date;

public class Drive {
    Date dateOfDrive;
    int duration;
    Double distance;
    String origin;
    String destination;
    Taxi taxi;
    Driver driver;
    Customer customer;
    
    public Drive(Date dateOfDrive, int duration, Double distance, String origin, String destination) {
        this.dateOfDrive = dateOfDrive;
        this.duration = duration;
        this.distance = distance;
        this.origin = origin;
        this.destination = destination;
    }
    
    public void setDateOfDrive(Date dateOfDrive) {
        this.dateOfDrive = dateOfDrive;
    }
    
    public Date getDateOfDrive() {
        return dateOfDrive;
    }
    
    public void setDuration(int duration) {
        this.duration = duration;
    }
    
    public int getDuration() {
        return duration;
    }
    
    public void setDistance(Double distance) {
        this.distance = distance;
    }
    
    public Double getDistance() {
        return distance;
    }
    
    public void setOrigin(String origin) {
        this.origin = origin;
    }
    
    public String getOrigin() {
        return origin;
    }
    
    public void setDestination(String destination) {
        this.destination = destination;
    }
    
    public String getDestination() {
        return destination;
    }
    
    public void displayDrive() {
        System.out.println("Date of drive: " + dateOfDrive + " Duration: " + duration + " Distance: " + distance + " Origin: " + origin + " Destination: " + destination);
    }
}
