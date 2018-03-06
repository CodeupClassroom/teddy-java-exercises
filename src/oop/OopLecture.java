package oop;

public class OopLecture {
    public static void main(String[] args) {
//        Person p = new Person(); // instantiation of Person object
//        p.firstName = "Rick";
//        p.lastName = "Sanchez";
//        System.out.println(p.sayHello());

        // static

//        System.out.println(Arithmetic.pi);
//        System.out.println(Arithmetic.add(3, 4));


        // slide 7

//        Person theBestDrummerAlive = new Person();
//        theBestDrummerAlive.name = "Neil Peart";
//        Person.worldPopulation += 1; // accessing a static property
        // this also works, but is usually not a good idea
//        System.out.println(theBestDrummerAlive.worldPopulation); // 7500000001
        // DONT DO THIS, it will not compile
//        System.out.println(Person.name);

//        Person person2 = new Person();
//        person2.name = "Bob";
//
//        Person.worldPopulation -= 7000000000L;
//
//        System.out.println(theBestDrummerAlive.worldPopulation);
//        System.out.println(person2.worldPopulation);
//        System.out.println(Person.worldPopulation);


        // constructor

        Dog d = new Dog("Sparky", 3, "female");

        System.out.println(d.getName());

        d.setName("Butch");
        System.out.println(d.getName());


//        System.out.println(d.age);
//        System.out.println(d.gender);


        User user = new User("Kevin39");

        user.setUsername("Kevin40");
        System.out.println(user.getUsername());




    }
}
