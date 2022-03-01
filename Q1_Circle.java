package Pract5;

import java.lang.Math;

public class Q1_Circle extends Q1_GeometricObject {
    double radius = 1;

    Q1_Circle(){}
    Q1_Circle(double newRadius){
        radius = newRadius;
    }
    Q1_Circle(double newRadius, String newColour, Boolean newFilled){
        radius = newRadius;
        colour = newColour;
        filled = newFilled;
    }

    public double getRadius(){
        return radius;
    }

    public void setRadius(double newRadius){
        radius = newRadius;
    }

    public double getArea(){
        double area = radius*radius*Math.PI;
        return area;
    }

    public double getPerimeter(){
        double perimeter = 2*Math.PI*radius;
        return perimeter;
    }

    public double getDiameter(){
        double diameter = 2*radius;
        return diameter;
    }




    
}
