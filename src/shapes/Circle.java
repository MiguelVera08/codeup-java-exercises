package shapes;

public class Circle {
    private static int circlesCreated = 0;

    private double radius;
    double pi = Math.PI;

    public Circle(double radius){

        this.radius = radius;
        circlesCreated++;

    }

    public double getArea(){

        return (pi * (radius * radius));

    }

    public double getCircumference(){

        return (2 * pi * radius);

    }

    public static int getCirclesCreated(){

        return circlesCreated;

    }

}
