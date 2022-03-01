package Pract5;

abstract class Q2_Shape {
    double dim1;
    double dim2;
    double area;
    final double Pi = 3.14;

    Q2_Shape(double newDim1, double newDim2){
        dim1 = newDim1;
        dim2 = newDim2;
    }

    public double getDim1(){
        return dim1;
    }

    public double getDim2(){
        return dim2;
    }

    public double getArea(){
        return area;
    }

    public abstract double area();
}
