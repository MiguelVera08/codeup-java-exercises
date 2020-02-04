package shapes;

public class Square extends Rectangle {



    public Square(double side) {

        super(side,side);
        this.side = side;

    }
//    public void setLength(double side){
//        this.length = side;
//    }

    public double getArea(){

        return Math.pow(side, 2);

    }

    public double getPerimeter() {

        return 4 * side;

    }


}
