package Composite;
// Client class
public class Client {
    public static void main(String[] args) {
        // Create leaf objects
        Person person1 = new Person("John");
        Person person2 = new Person("Jane");
        Person person3 = new Person("Jack");

        // Create composite object
        Family family = new Family("Smith");

        // Add leaf objects to the composite object
        family.addMember(person1);
        family.addMember(person2);

        // Create another composite object
        Family subFamily = new Family("Johnson");

        // Add leaf objects to the sub-composite object
        subFamily.addMember(person3);

        // Add the sub-composite object to the main composite object
        family.addMember(subFamily);

        // Introduce the whole family tree
        family.introduce();
    }
}