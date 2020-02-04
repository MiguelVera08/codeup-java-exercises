package shapes;

public class ShapesTest {
    public static void main(String[] args){


        Rectangle box1 = new Rectangle(5,4);
        Rectangle box2 = new Square(5);


        System.out.println("Rectangle Perimeter: " + box1.getPerimeter());
        System.out.println("Rectangle Area: " + box1.getArea());
        System.out.println("Square Perimeter: " + box2.getPerimeter());
        System.out.println("Square Area: " + box2.getArea());

    }
}
