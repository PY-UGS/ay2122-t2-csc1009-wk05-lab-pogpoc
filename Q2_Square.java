package Pract5;

public class Q2_Square extends Q2_Shape{
    Q2_Square(double newDim1, double newDim2){
        super(newDim1,newDim2);
    }

    public double area(){
        System.out.println("Inside Area for Square.");
        return dim1*dim2;
    }
    
}
