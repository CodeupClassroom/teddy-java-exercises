public class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void sayHello() {
        System.out.println("Hello, " + name + "!");
    }

    public static void main(String[] args) {
        Person person = new Person("Bob");
        person.sayHello();

        // Assigning objects to objects assigns the REFERENCE
        // not the value(s)
        Person person1 = person;
        person1.sayHello();

        System.out.println(person);
        System.out.println(person1);

        System.out.println(person.equals(person1));
    }
}
