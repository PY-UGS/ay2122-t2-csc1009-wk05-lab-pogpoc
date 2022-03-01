package Pract5;

public class Q2_Triangle extends Q2_Shape{
    Q2_Triangle(double newDim1, double newDim2){
        super(newDim1, newDim2);
    }

    public double area() {
        System.out.println("Inside Area for Triangle.");
        return dim1*dim2*0.5;
    }
    
}