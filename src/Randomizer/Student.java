package Randomizer;

public class Student extends Person {

    protected int numberOfTimesCalled = 0;

    public Student(String name) {
        super(name);
        type = "Student";
    }

    public void call() {
        System.out.println(name + ", what did you get for your answer?");
        numberOfTimesCalled++;
    }

    public int getNumberOfTimesCalled() {
        return numberOfTimesCalled;
    }
}
