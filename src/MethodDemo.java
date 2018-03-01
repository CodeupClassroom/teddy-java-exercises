public class MethodDemo {
    public static void main(String[] args) {
        welcomeUser();

        int num = five();
        System.out.println(num);

        if(isFive(num)) {
            System.out.println("5 is 5");
        }

        if(isQuestion("Do you like pizza?")){
            System.out.println("Today is the day! Don't question it!");
            System.out.println(5);
            System.out.println(true);
            System.out.println(12.232131);
        }

        int myNum = 42;
        changeTo10(myNum);

        System.out.println(myNum);
    }

    public static int changeTo10(int num) {
        num = 10;
        return num;
    }

    public static boolean isFive(int num) {
        return num == 5;
    }

    public static boolean isFive(String numString) {
        return Integer.parseInt(numString) == 5;
    }

    public static boolean isFive(double num) {
        return num == 5.0;
    }


    public static boolean isQuestion(String someString) {
        return someString.endsWith("?");
    }

    public static int five() {
        return 5;
    }

    public static void welcomeUser() {
        System.out.println("Welcome user! Please sign up for our service! Start mining bitcoin without knowing it FOR US! We'll be your friend!");
    }

    public static void songThatNeverEnds() {
        System.out.println("This is the song that never ends..");
        System.out.println("it goes on and on, my friends...");
        System.out.println("`some people started singing it, not knowing what it was...");
        System.out.println("And they'll continue singing it...");
        System.out.println("F O R E V E R");
        System.out.println("just because.....");
        songThatNeverEnds();
    }
}
