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
public class Rating {

    String rate;
    String comment;
    Drive drive;
    Customer customer;

    public Rating(String rate, String comment) {
        this.rate = rate;
        this.comment = comment;

    }

    public void setRate(String rate) {
        this.rate = rate;
    }

    public String getRate() {
        return rate;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getComment() {
        return comment;
    }
}
