import java.util.Random;

public class ServerNameGenerator {
    public static Random rng = new Random();
    public static String[] adjectives = {"blue", "green", "red", "quirky", "simple", "dedicated"};
    public static String[] nouns = {"photon", "neutron", "quark", "function", "loop"};

    public static String getRandomString(String[] coll) {
        int randomIndex = rng.nextInt(coll.length);
        return coll[randomIndex];
    }

    public static String getServerName() {
        return String.format(
            "%s-%s",
            getRandomString(adjectives),
            getRandomString(nouns)
        );
    }

    public static void main(String[] args) {
        System.out.println("Here is your server name: " + getServerName());
    }
}
