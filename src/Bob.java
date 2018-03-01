import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String userChoice;

        do {
            System.out.print("Say something to Bob: ");
            String userInput = scan.nextLine();

            if (userInput.endsWith("?")) {
                System.out.println("Sure.");
            } else if (userInput.trim().equals("")) {
                System.out.println("Fine, be that way.");
            } else if (userInput.endsWith("!") || userInput.toUpperCase().equals(userInput)) {
                System.out.println("Whoah, chill out!");
            } else {
                System.out.println("Whatever.");
            }

            System.out.println("Would you like to say something else to Bob? Press y for yes.");
            userChoice = scan.nextLine();
        } while(userChoice.equals("y"));
    }
}
