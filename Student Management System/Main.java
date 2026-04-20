// Main.java - Main class to run the program

public class Main {
    public static void main(String[] args) {

        System.out.println("========================================");
        System.out.println("     STUDENT MANAGEMENT SYSTEM          ");
        System.out.println("========================================\n");

        // --- Person Object ---
        System.out.println(">>> Person Object:");
        Person p = new Person("Rahul Sharma", 20);
        p.displayInfo();

        System.out.println();

        // --- Student Object ---
        System.out.println(">>> Student Object:");
        Student s = new Student("Priya Patel", 21, 101, 68.5f);
        s.displayInfo();

        System.out.println();

        // --- GraduateStudent Object ---
        System.out.println(">>> Graduate Student Object:");
        GraduateStudent gs = new GraduateStudent(
            "Amit Verma", 24, 201, 82.0f,
            "Artificial Intelligence",
            "Deep Learning in Medical Imaging"
        );
        gs.displayInfo();

        System.out.println("\n========================================");
    }
}
