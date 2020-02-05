package shapes;

public class Square extends Quadrilateral {

    public Square(double side) {

        super(side,side);

    }
//    public void setLength(double side){
//        this.length = side;
//    }
//
//    public double getArea(){
//
//        return Math.pow(side, 2);
//
//    }
//
//    public double getPerimeter() {
//
//        return 4 * side;
//
//    }


    @Override
    public void setLength(double length){
        this.length = length;
        this.width = length;
    }

    @Override
    public void setWidth(double width){
        this.width = width;
        this.length = width;

    }

    @Override
    public double getPerimeter() {
        return Math.pow(this.length, 2);
    }

    @Override
    public double getArea() {
        return 4 * this.length;
    }
}
