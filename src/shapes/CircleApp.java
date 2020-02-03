package shapes;

import util.Input;

public class CircleApp {
    public static void main(String [] args){

        Input input = new Input();

        do {
            double radius = input.getDouble("Enter the radius of the circle: ");

            Circle circle = new Circle(radius);

            System.out.println("Area of circle = " + circle.getArea());
            System.out.println("Circumference = " + circle.getCircumference());
        } while (input.yesNo("Do you want to go again?"));
        System.out.println(Circle.getCirclesCreated() + " circles created.");

    }


}
