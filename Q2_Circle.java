package Pract5;

public class Q2_Circle extends Q2_Shape{

    Q2_Circle(double newDim1, double newDim2){
        super(newDim1, newDim2);
    }
    public double area() {
        System.out.println("Inside Area for Circle.");
        return dim1*dim2*Pi;
    }

}