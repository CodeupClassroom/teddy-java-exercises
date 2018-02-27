import java.util.Scanner;

public class ScannerDemo {

    public static void main(String[] args) {
        String userInput;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter something: ");
        userInput = sc.nextLine();
        System.out.println("You entered: --> \"" + userInput + "\" <--");
    }
}
