package Randomizer;

public class Customer extends Person {
    protected int numberOfTimesCalled = 0;

    public Customer(String name) {
        super(name);
        type = "Customer";
    }

    public void call() {
        numberOfTimesCalled++;
        System.out.println("Hi there, " + name + " did I catch you at a bad time? Wanna buy some life insurance?");
    }

    public int getNumberOfTimesCalled() {
        return numberOfTimesCalled;
    }
}
