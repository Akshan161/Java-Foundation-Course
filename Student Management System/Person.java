// Person.java - Base Class

public class Person {
    String name;
    int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age  = age;
    }

    // Display method
    public void displayInfo() {
        System.out.println("---- Person Details ----");
        System.out.println("Name : " + name);
        System.out.println("Age  : " + age);
    }
}
