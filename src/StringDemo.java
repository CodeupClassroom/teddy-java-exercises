public class StringDemo {
    public static void main(String[] args) {
        String name = "Ryan";
        String compare = "Joe";


        name.equals(name);

        if(name.equalsIgnoreCase(compare)) {
            System.out.println("Hi, " + compare);
        } else {
            System.out.println("You're not " + compare + "! But it's nice to meet you!");
        }

        if(name.startsWith("J")) {
            System.out.println("Your name might be Joe");
        }

        if(name.endsWith("oe")) {
            System.out.println("Your name might be Joe!");
        }

        if(name.length() == 3) {
            System.out.println("Your name might be Joe?");
        }

        String babyTalk = "Banana".replace('n', 'm');
        System.out.println(babyTalk);


        System.out.println("    trim removes whitspace      ".trim());
    }
}
