package abstractLEC;

public class AbstractLecture {

    public static void main(String[] args) {

        Controllable projector = new Projector();
        powerForTwelveHours(projector);

    }

    public static void powerForTwelveHours(Controllable c) {
        c.powerOn();
        System.out.println("Waiting for 12 hours");
        c.powerOff();
    }

}
