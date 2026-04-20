// GraduateStudent.java - Derived from Student

public class GraduateStudent extends Student {
    String specialization;
    String thesisTitle;

    // Constructor
    public GraduateStudent(String name, int age, int rollNumber,
                           float marks, String specialization, String thesisTitle) {
        super(name, age, rollNumber, marks);   // calls Student constructor
        this.specialization = specialization;
        this.thesisTitle    = thesisTitle;
    }

    // Display method
    @Override
    public void displayInfo() {
        super.displayInfo();     // calls Student displayInfo
        System.out.println("---- Graduate Details ----");
        System.out.println("Specialization : " + specialization);
        System.out.println("Thesis Title   : " + thesisTitle);
    }
}
