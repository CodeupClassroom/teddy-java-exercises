package pets;

//Create a class of Animal
//        Create a class of Pet
//        Create a class of Dog, Fish, Cat that extends Pet

//        Include several properties and methods in each of the
//        classes that keep replicated code to a minimum but highlight
//        the unique state and behaviour of each part of the inheritance chain.
//        Create a class PetTester with the following methods:

//public static String getSpeciesInfo() that returns the value of the species
//        this method should take in any Animal object but test it in the main method
//        with instantiated Dog, Fish, Cat objects.
//
//public static String createPet() that returns a specific pet object given
//        an instantiated Pet object and the String value of the species type

public class PetTester {

    public static void main(String[] args) {
        Pet pet1 = new Cat();
        pet1.name = "Lil' Meow Meow";
        pet1.owner = "Hulk Hogan";

        Pet pet2 = new Fish();
        pet2.name = "Butch";
        pet2.owner = "Macho Man Randy Savage";

        getSpeciesInfo(pet1);
        getSpeciesInfo(pet2);

        createPet(pet1);
        createPet(pet2);
    }

    public static void getSpeciesInfo(Animal animal){
        System.out.println("This animal has the following info: ");
        System.out.println(animal.kingdom);
        System.out.println(animal.species);
        System.out.println("Number of legs is: " + animal.numberOfLegs);
        System.out.println();
    }

    public static void createPet(Pet somePet) {
        System.out.println(somePet.name + " has " + somePet.numberOfLegs + " and is owned by " + somePet.owner);
    }
}
