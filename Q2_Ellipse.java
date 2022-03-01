package Pract5;

public class Q2_Ellipse extends Q2_Shape{

    Q2_Ellipse(double newDim1, double newDim2){
        super(newDim1, newDim2);
    }

    public double area(){
        System.out.println("Inside Area for Ellipse. ");
        return Pi*dim1*dim2;
    }

}