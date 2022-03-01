package Pract5;

public class Q2_Rectangle extends Q2_Shape {  

    Q2_Rectangle(double newDim1, double newDim2){
        super(newDim1, newDim2);
    }

    public double area() {
        System.out.println("Inside Area for Rectangle.");
        return dim1*dim2;
    }

}