package Pract5;

public class Q1_Rectangle extends Q1_GeometricObject {
    double width = 4;
    double height = 2;

    Q1_Rectangle(){}
    Q1_Rectangle(double newWidth, double newHeight){
        width = newWidth;
        height = newHeight;
    }
    Q1_Rectangle(double newWidth, double newHeight, String newColour, Boolean newFilled){
        width = newWidth;
        height = newHeight;
        colour = newColour;
        filled = newFilled;
    }

    public double getWidth(){
        return width;
    }

    public void setWidth(double newWidth){
        width = newWidth;
    }

    public double getHeight(){
        return height;
    }

    public void setHeight(double newHeight){
        height = newHeight;
    }

    public double getArea(){
        double area = width*height;
        return area;
    }

    public double getPerimeter(){
        double perimeter = 2*width + 2*height;
        return perimeter;
    }
    
}
