package lec;

public class Projector implements Controllable, Navigatable {

    @Override
    public void powerOn() {
        System.out.println("picking on remote signal");
        System.out.println("starting project sequence");
    }

    @Override
    public void powerOff() {


    }

    public void bringUpMenu() {
        System.out.println("Accessing menue view and displaying through projector");
    }

    @Override
    public void scrollUpMenu() {
        System.out.println("scrolling up menu");
    }

    @Override
    public void scrollDownMenu() {
        System.out.println("Scrolling down menu");
    }
}
