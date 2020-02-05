package shapes;

public class ShapesTest {
    public static void main(String[] args){


//        Rectangle box1 = new Rectangle(5,4);
//        Rectangle box2 = new Square(5);

        Measurable myShape;

        myShape = new Rectangle(5,4);
//        Measurable squareShape = new Square(5);

        System.out.println("Rectangle Perimeter: " + myShape.getPerimeter());
        System.out.println("Rectangle Area: " + myShape.getArea());

        myShape = new Square(5);
        System.out.println("Square Perimeter: " + myShape.getPerimeter());
        System.out.println("Square Area: " + myShape.getArea());

    }
}
