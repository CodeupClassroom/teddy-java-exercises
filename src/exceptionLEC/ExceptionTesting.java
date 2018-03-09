package exceptionLEC;

public class ExceptionTesting {

    public static void main(String[] args) {

        // ================================ SLIDE 3


        // Exceptions may be thrown

//             throw new RuntimeException("Something went wrong");


        // You have to handle most exceptions that extend from Exception

//            try {
//                // risky things
//                boolean badThingHappend = true;
//                if (badThingHappend) {
//                    throw new Exception("EXCEPTION: you did the bad thing!!!");
//                }
//                System.out.println("This only runs if condition is false");
//            } catch(Exception e) {
//                System.out.println("You did x and it broke");
//                System.out.println(e.getMessage());
//                e.printStackTrace(System.out);
//            }

        // Curriculum Example

//            int result = 1/0;

//            try {
//                System.out.println("Let's see...");
//                int result = 1 / 0;
//                System.out.println("I can divide by zero!");
//            } catch (ArithmeticException e) {
//                System.out.println("Math still works!");
//                System.out.println(e.toString());
//            }
//
//            System.out.println("This will still run");




        // ================================ SLIDE 4

//        int[] numbers = {1, 2, 3};
//        int x;
//        try {
//            x = numbers[100];
//        } catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println("Exception caught!");
//            x = 0;
//        } catch (Exception e) {
//            e.printStackTrace();
//        } finally {
//            System.out.println("This will always run.");
//            // normally used for "clean up" like closing file streams or DB connections
//        }
//        System.out.println("This always runs");


        // we can catch multiple exceptions, including exceptions we defined

//            try {
//                double result;
//                String[] strings = {"Bob", "Fred", "Sally"}; // will not be caught by specific Exception
//                System.out.println(strings[3]);
//            } catch(ArrayIndexOutOfBoundsException e) {
//                System.out.println(e.toString());
//            } catch(Exception e) {
//                System.out.println("This won't run");
//                System.out.println(e.toString());
//            }


        // ================================ SLIDE 5 and 6

//            throw new Exception("Bummer. The risky stuff failed. You'll handle it.");
//            throw new RuntimeException("Hey, you dorked something up in your code");
//            throw new Error("You're out of of luck now");


        // ================================ SLIDE 7

        // catching a custom exception


            soutName("Bob"); // cannot call soutName without exception handling




        // ================================ SLIDE 8


        // calling a method that handles an exception

//            thisHandlesAnException();

        // using throws in a method, we can kick the responsibility of handling the exception up the chain

//            try {
//                thisMakesAnException();
//            } catch (Exception e) {
//                System.out.println(e.getMessage());
//            }






    }

    public static void thisHandlesAnException() {
        try {
            throw new Exception("Yep, an exception again :(");
        } catch (Exception e) {
            System.out.println("EXCEPTION!!!");
            System.out.println(e.getMessage());
        }
    }

    public static void thisMakesAnException() throws Exception {
        throw new Exception("Exception!");
    }

    public static void soutName(String name) {
        if (name.equalsIgnoreCase("bob")) {
            try {
                throw new NameIsBobException("NOOOOOOO!!!!");
            } catch (NameIsBobException e) {
                System.out.println(e.getMessage());
            }
        } else {
            System.out.println(name);
        }
    }

}
