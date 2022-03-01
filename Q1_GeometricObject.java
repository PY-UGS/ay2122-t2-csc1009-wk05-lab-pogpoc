package Pract5;

import java.security.cert.CertificateRevokedException;
import java.util.Date;

public class Q1_GeometricObject{
    String colour = "White";
    Boolean filled = false;
    Date createdDate = new Date();

    Q1_GeometricObject(){}
    Q1_GeometricObject(String newColour, Boolean newFilled){
        colour = newColour;
        filled = newFilled;
    }

    public String getColour(){
        return colour;
    } 

    public void setColour(String newColour){
        colour = newColour;
    }

    public boolean isFilled(){
        return filled;
    }

    public void setFilled(Boolean newFilled){
        filled = newFilled;
    }

    public Date getDateCreated(){
        return createdDate;
    }

    public String toString(){
        String dateToStr = createdDate.toString();
        String combinedString = "created on " + dateToStr + " colour: " + getColour() + " and filled: " + isFilled();
        return combinedString;
    }





}