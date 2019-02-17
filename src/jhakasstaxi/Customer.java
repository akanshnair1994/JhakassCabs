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
public class Customer extends Person {

    String cutomerId;
    String registraionDate;
    String type;
    String paymentMethod;
    String category;

    public Customer(String cutomerId, String registraionDate, String type, String paymentMethod, String category, String firstName, String lastName, int phoneNo, String address, String gender) {
        super(firstName, lastName, phoneNo, address, gender);
        this.cutomerId = cutomerId;
        this.registraionDate = registraionDate;
        this.type = type;
        this.paymentMethod = paymentMethod;
        this.category = category;
    }

    public void setCustomerID(String customerId) {
        this.cutomerId = customerId;
    }

    public String getCustomerId() {
        return cutomerId;
    }

    public void setRegistraionDate(String registraionDate) {
        this.registraionDate = registraionDate;
    }

    public String getRegistraionDate() {
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
}
