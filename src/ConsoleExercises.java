import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer value");

        int number = scanner.nextInt(); // 1234[enter]
        System.out.println(number); // 1234

        System.out.println("Enter 3 words\n");
        String wordOne = scanner.next(); // [enter]coding
        String wordTwo = scanner.next(); // [space]is
        String wordThree = scanner.next(); // [space]awesome[enter]

        System.out.println(wordOne);
        System.out.println(wordTwo);
        System.out.println(wordThree);

        scanner.nextLine(); // This is the extra \n (enter)

        System.out.println("Enter a sentence");
        String sentence = scanner.nextLine();
        System.out.println(sentence);

        System.out.println("Enter the width of the classroom");
        String widthString = scanner.nextLine();
        double width = Double.parseDouble(widthString); // scanner.nextDouble();

        System.out.println("Enter the length of the classroom");
        double length = Double.parseDouble(scanner.nextLine());

        double area = length * width;
        double perimeter = 2 * length + 2 * width;

        // output
        System.out.println("The area of the classroom is " + area);
        System.out.println("The perimeter of the classroom is " + perimeter);
    }
}