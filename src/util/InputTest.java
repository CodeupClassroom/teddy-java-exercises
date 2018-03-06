package util;

public class InputTest {
    public static void main(String[] args) {
        Input input = new Input();

        int num1 = input.getInt(1, 10, "Please input an integer between 1 and 10");

        System.out.println("You input the number " + num1);

        System.out.println("Do you want to input another integer?");
        boolean choice = input.yesNo();

        if(choice) {
            int num2 = input.getInt("Please input ANY valid integer");
            System.out.println("You entered: " + num2);
        }

        if(input.yesNo("Wanna enter an integer?")) {
            int num3 = input.getInt("Please enter  any integer");
            System.out.println("You entered: " + num3);
        }

        double someDouble;
        someDouble = input.getDouble("Please input any number");
        System.out.println("You input " + someDouble);

        double doubleInRange;
        doubleInRange = input.getDouble(1.1, 9.9, "Input any number between 1.1 and 9.9");

        System.out.println(doubleInRange);
    }
}
