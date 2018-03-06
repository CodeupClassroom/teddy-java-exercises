package oop;

public class Dog {

    private String name;
    private int age;
    private String gender;

    public Dog() {}

    public Dog(String name, int age) {

    }

    public Dog(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String value) {
        if (value.equalsIgnoreCase("Butch")) {
            this.name = "Not Butch";
        } else {
            this.name = value;
        }

    }
}
