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
        try {
            return Integer.valueOf(scan.next());
        } catch(NumberFormatException e) {
            System.out.println("Input must be a whole number.");
            return getInt();
        }
    }

    public int getInt(String prompt) {
        System.out.println(prompt);
        return getInt();
    }

    public int getInt(int min, int max) {
        int userInt = getInt();
        if(userInt < min || userInt > max) {
            System.out.println("Whole number must be within " + min + " and " + max);
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
        try {
            return Double.valueOf(scan.next());
        } catch (NumberFormatException e) {
            System.out.println("Please a valid number!");
            return getDouble();
        }
    }

    public double getDouble(String prompt) {
        System.out.println(prompt);
        return getDouble();
    }

    public double getDouble(double min, double max) {
        double number = getDouble();
        if(number < min || number > max) {
            System.out.println("Please enter a valid number between " + min + " and " + max);
            return getDouble(min, max);
        } else {
            return number;
        }
    }

    public double getDouble(double min, double max, String prompt) {
        System.out.println(prompt);
        return getDouble(min, max);
    }


    public int getHex(){
        String userInput = scan.next();
        try {
            return Integer.valueOf(userInput, 16);
        } catch (NumberFormatException e) {
            System.out.println("Please enter a valid hex value.");
            return getHex();
        }
    }

    public String getBinary(){
        String s = scan.nextLine();
        int radix = 2;
        try {
            System.out.println(("Enter a number"));
            s = scan.nextLine();
            radix = 2;
        }
        catch(NumberFormatException e){
            System.out.println("This is not a valid number in base " + radix);
        }
        return "Beginning Value: " + s + " Base Number: " + radix + " Converted Number: " + Integer.valueOf(s, radix);
    }

    public int getBinary(String prompt) {
        System.out.println(prompt);
        try {
            return Integer.valueOf(scan.next(), 2);
        } catch (NumberFormatException e) {
            System.out.println(e.toString());
            return getBinary(prompt);
        }
    }

}
