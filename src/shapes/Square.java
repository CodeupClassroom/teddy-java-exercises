package shapes;

public class Square extends Rectangle {

    public Square(double side) {
        super(side, side);
    }

    public double getArea() {
        return length * length;
    }

    public double getPerimeter() {
        return length * 4;
    }
}
