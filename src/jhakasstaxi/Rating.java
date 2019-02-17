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
    String Rate;
    String Comment;
    
    public Rating(String Rate, String Comment) {
        this.Rate=Rate;
        this.Comment=Comment;
        
    }
       public void setRate(String Rate) {
           this.Rate=Rate;
       }     
    public String getRate() {
        return Rate;
    }
    public void setComment(String Comment) {
        this.Comment=Comment;
    }
    public String getComment() {
        return Comment;
    }
}
