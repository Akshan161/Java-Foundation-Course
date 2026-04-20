// Student.java - Derived from Person

public class Student extends Person {
    int rollNumber;
    float marks;

    // Constructor
    public Student(String name, int age, int rollNumber, float marks) {
        super(name, age);        // calls Person constructor
        this.rollNumber = rollNumber;
        this.marks      = marks;
    }

    // Grade calculator
    public String getGrade() {
        if      (marks >= 75) return "Distinction";
        else if (marks >= 60) return "First Class";
        else if (marks >= 45) return "Pass";
        else                  return "Fail";
    }

    // Display method
    @Override
    public void displayInfo() {
        super.displayInfo();     // calls Person displayInfo
        System.out.println("---- Student Details ----");
        System.out.println("Roll Number : " + rollNumber);
        System.out.println("Marks       : " + marks);
        System.out.println("Grade       : " + getGrade());
    }
}
