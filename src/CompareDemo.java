import java.util.Scanner;

public class CompareDemo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name = "Ryan";
        String compareName = scan.next();

        if(name.equalsIgnoreCase(compareName)) {
            System.out.println("Hi Ryan");
        } else {
            System.out.println("Hello, whoever you are!");
        }
    }
}
