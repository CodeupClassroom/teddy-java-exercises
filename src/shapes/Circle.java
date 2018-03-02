package shapes;

public class Circle {
    private double radius;
    private static int numberOfCircles = 0;

    public Circle(double radius) {
        this.radius = radius;
        numberOfCircles++;
    }

    public double getArea() {
        return Math.PI * (radius * radius);
    }

    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

    public static int getNumberOfCircles() {
        return numberOfCircles;
    }
}
