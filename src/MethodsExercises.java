import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args) {

        int number1 = getInteger(1, 10);
        int number2 = getInteger(10, 33);

        double sum = add(number1, number2);
        double difference = subtract(number1, number2);
        double product = multiplication(number1, number2);
        double quotient = divide(number1, number2);

        System.out.println("The sum of " + number1 + " and " + number2 + " is: " + sum);
        System.out.println("The difference of " + number1 + " and " + number2 + " is: " + difference);
        System.out.println("The sum product of " + number1 + " and " + number2 + " is: " + product);
        System.out.println("The quotient of " + number1 + " and " + number2 + " is: " + quotient);

        System.out.println("Now we're going to calculate factorials!");
        int userInt;
        long factorialResult;

        do {
            userInt = getInteger(1, 10);
            factorialResult = factorial(userInt);
            System.out.println("The factorial for " + userInt + "! is " + factorialResult);
        } while(wantsToContinue());

        System.out.println("Thanks for playing \"Factorial!\"");

        System.out.println();
        System.out.println("Now let's play \"Roll The Dice!\"");
        diceRoller();
    }

    public static double add(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static double multiplication(double a, double b) {
        return a * b;
    }

    public static double divide(double a, double b) {
        return a / b;
    }

    public static double modulo(double a, double b) {
        return a % b;
    }

    public static int getInteger(int min, int max) {
        System.out.println("Please input an integer between " + min + " and " + max + ":");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        if(number < min || number > max) {
            return getInteger(min, max);
        } else {
            return number;
        }
    }

    public static boolean wantsToContinue() {
        System.out.println();
        Scanner scan = new Scanner(System.in);
        String userSelection;
        boolean wantsToContinue;

        System.out.println("Would you like to continue? Type \"y\" or yes to continue.");
        userSelection = scan.next();
        wantsToContinue = userSelection.equalsIgnoreCase("y") || userSelection.equalsIgnoreCase("yes");

        return wantsToContinue;
    }

    public static long factorial(int num) {
        // set the output at
        long output = num;

        // start w/ 1, then multiply by each number up to but not including the num.
        for(int i = 1; i < num; i++) {
            output *= i;
        }

        return output;
    }


    public static void diceRoller() {
        diceSplash();

        System.out.println("How many sides should each die have?");
        int sides = getInteger(1, 100);
        int die1;
        int die2;
        int result;

        die1 = roll(sides);
        System.out.println("The first die rolled a " + die1);

        die2 = roll(sides);
        System.out.println("The second die rolled a " + die2);

        result = die1 + die2;
        System.out.println("Result of both dice is: " + result);

        if(wantsToContinue()) {
            diceRoller();
        } else {
            System.out.println("Thanks for playing \"D I C E   R O L L E R \"!");
        }

    }

    public static int roll(int numberOfSides) {
        return (int) Math.ceil(Math.random() * numberOfSides);
    }

    public static void diceSplash() {
        String display1 = "\n\n" +
                "       .-------.    ______\n" +
                "      /   o   /|   /\\     \\\n" +
                "     /_______/o|  /o \\  o  \\\n" +
                "     | o     | | /   o\\_____\\\n" +
                "     |   o   |o/ \\o   /o    /\n" +
                "     |     o |/   \\ o/  o  /\n" +
                "     '-------'     \\/____o/ \n\n\n";

        String display2 = "\n" +
                "              _______.\n" +
                "   ______    | .   . |\\\n" +
                "  /     /\\   |   .   |.\\\n" +
                " /  '  /  \\  | .   . |.'|\n" +
                "/_____/. . \\ |_______|.'|\n" +
                "\\ . . \\    /  \\ ' .   \\'|\n" +
                " \\ . . \\  /    \\____'__\\|\n" +
                "  \\_____\\/"
                + "\n\n";


        String display3 = "\n" +
                "  ____\n" +
                " /\\' .\\    _____\n" +
                "/: \\___\\  / .  /\\\n" +
                "\\' / . / /____/..\\\n" +
                " \\/___/  \\'  '\\  /\n" +
                "          \\'__'\\/"
                + "\n\n";

        int randomDisplay = roll(3);

        String display;

        if(randomDisplay == 1) {
            display = display1;
        } else if(randomDisplay == 2) {
            display = display2;
        } else {
            display = display3;
        }

        System.out.println(display);
    }


}
