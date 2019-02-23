package jhakasstaxi;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Drive {
    String newId;
    Date dateOfDrive;
    int duration;
    Double distance;
    String origin;
    String destination;
    Taxi taxi;
    Driver driver;
    Customer customer;
    
    public Drive(Date id, Date dateOfDrive, int duration, Double distance, String origin, String destination) {
        newId = createID(id, origin);
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
        System.out.println("Drive Details: ");
        System.out.println("ID: " + newId);
        System.out.println("Date of drive: " + dateOfDrive);
        System.out.println("Duration: " + duration);
        System.out.println("Distance: " + distance);
        System.out.println("Origin: " + origin);
        System.out.println("Destination: " + destination);
        System.out.println();
    }
    
    private String createID(Date newDate, String name) {
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
