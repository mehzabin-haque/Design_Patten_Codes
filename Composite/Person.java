package Composite;

public class Person implements FamilyMember {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public void introduce() {
        System.out.println("I am " + name + ", a family member.");
    }
}