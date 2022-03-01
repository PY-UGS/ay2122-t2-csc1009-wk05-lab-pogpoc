package Pract5;

public class Q2_Main {
    public static void main(String [] args){
        Q2_Rectangle rect = new Q2_Rectangle(5,2);
        Q2_Triangle tri = new Q2_Triangle(3, 8);
        Q2_Circle circ = new Q2_Circle(7, 7);
        Q2_Ellipse ellip = new Q2_Ellipse(2, 2);
        Q2_Square sq = new Q2_Square(9, 9);

    
        System.out.println("Area is: " + rect.area());
        System.out.println("Area is: " + tri.area());
        System.out.println("Area is: " + circ.area());
        System.out.println("Area is: " + ellip.area());
        System.out.println("Area is: " + sq.area());
    }
    
}
