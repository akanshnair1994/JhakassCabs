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
public class Customer extends Person {

    String cutomerId;
    Date registraionDate;
    String type;
    String paymentMethod;
    String category;
    String newId;

    public Customer(String cutomerId, Date registraionDate, String type, String paymentMethod, String category, Date id, String firstName, String lastName, int phoneNo, String address, String gender) {
        super(id, firstName, lastName, phoneNo, address, gender);
        System.out.println("-----------------------------"+id+"--------------------------");
        newId = createID(id, category);
        this.cutomerId = cutomerId;
        this.registraionDate = registraionDate;
        this.type = type;
        this.paymentMethod = paymentMethod;
        this.category = category;
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

    public void setCustomerID(String customerId) {
        this.cutomerId = customerId;
    }

    public String getCustomerId() {
        return cutomerId;
    }

    public void setRegistraionDate(Date registraionDate) {
        this.registraionDate = registraionDate;
    }

    public Date getRegistraionDate() {
        return registraionDate;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getCategory() {
        return category;
    }

    public void displayCustomer() {
        System.out.println("Customer Details: ");
        System.out.println("Cutomer Id: " + cutomerId);
        System.out.println("Registration Date: " + registraionDate);
        System.out.println("Type: " + type);
        System.out.println("Payment Method: " + paymentMethod);
        System.out.println("Category: " + category);
        super.displayPerson();
        System.out.println("");
    }
}
//id is part of const not part of paramt of const
//display child  thn display mother attrbute