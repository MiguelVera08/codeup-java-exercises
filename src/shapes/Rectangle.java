package shapes;

public class Rectangle extends Quadrilateral implements Measurable{

    public Rectangle(double length, double width){
        super(length, width);

    }

    @Override
    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double getPerimeter() {
        return 2 * this.length + 2 * this.width;
    }

    @Override
    public double getArea() {
        return this.width * this.length;
    }

//    protected double length;
//    protected double width;
//    protected double side;
//
//
//    public Rectangle(double length, double width){
//        this.length = length;
//        this.width = width;
//    }
//
//    public double getArea(){
//
//        return width * length;
//
//    }
//
//    public double getPerimeter(){
//
//        return 2 * length + 2 * width;
//    }
}
