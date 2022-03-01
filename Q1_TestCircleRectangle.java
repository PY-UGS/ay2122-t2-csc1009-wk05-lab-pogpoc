package Pract5;

public class Q1_TestCircleRectangle {
    public static void main(String[] args){
        Q1_Circle circle = new Q1_Circle(1);
        System.out.println("A circle " + circle.toString());
        System.out.println("The colour is " + circle.getColour());
        System.out.println("The radius is " + circle.getRadius());
        System.out.println("The area is " + circle.getArea());
        System.out.println("The diameter is " + circle.getDiameter());

        Q1_Rectangle rectangle = new Q1_Rectangle(2,4);
        System.out.println("A rectangle " + rectangle.toString());
        System.out.println("The area is " + rectangle.getArea());
        System.out.println("The perimeter is " + rectangle.getPerimeter());
    }
}
