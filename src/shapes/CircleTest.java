package shapes;

public class CircleTest {
    public static void main(String[] args) {
        System.out.print("Here's how many circles are created right now: ");
        System.out.println(Circle.getNumberOfCircles());

        Circle one = new Circle(3);
        System.out.println(Circle.getNumberOfCircles());

        Circle another = new Circle(42);
        System.out.println(Circle.getNumberOfCircles());
    }
}
