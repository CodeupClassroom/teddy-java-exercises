package util;

import java.util.Scanner;

public class Input {
    private Scanner scan;

    public Input() {
        scan = new Scanner(System.in).useDelimiter("\n");
    }

    public String getString() {
        return scan.next();
    }

    public String getString(String prompt) {
        System.out.print(prompt);
        return getString();
    }

    public boolean yesNo() {
        String userInput = getString();
        if(userInput.equalsIgnoreCase("y") || userInput.equalsIgnoreCase("yes")) {
            return true;
        } else {
            return false;
        }
    }

    public boolean yesNo(String prompt) {
        System.out.println(prompt);
        return yesNo();
    }

    public int getInt() {
        return scan.nextInt();
    }

    public int getInt(String prompt) {
        System.out.println(prompt);
        return getInt();
    }

    public int getInt(int min, int max) {
        int userInt = getInt();
        if(userInt < min || userInt > max) {
            return getInt(min, max);
        } else {
            return userInt;
        }
    }

    public int getInt(int min, int max, String prompt) {
        System.out.println(prompt);
        return getInt(min, max);
    }

    public double getDouble() {
        return scan.nextDouble();
    }

    public double getDouble(String prompt) {
        System.out.println(prompt);
        return getDouble();
    }

    public double getDouble(double min, double max) {
        double number = getDouble();
        if(number < min || number > max) {
            return getDouble(min, max);
        } else {
            return number;
        }
    }

    public double getDouble(double min, double max, String prompt) {
        System.out.println(prompt);
        return getDouble(min, max);
    }
}
