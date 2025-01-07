package ex0307.workingWithObjects;

public class Person {
    private String name;
    private String address;
    private String work;

    // Constructor
    public Person(String name, String address, String work) {
        this.name = name;
        this.address = address;
        this.work = work;
    }

    // Setters - Also called Mutators
    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setWork(String work) {
        this.work = work;
    }

    // Getters - Also called Accessors
    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getWork() {
        return work;
    }

    // Additional method
    public void eat(String food) {
        String response = "I love eating";
        System.out.println(response + " " + food);
    }

    // Override toString method
    @Override
    public String toString() {
        return "Name: " + name + " Location: " + address + " Work: " + work;
    }
}