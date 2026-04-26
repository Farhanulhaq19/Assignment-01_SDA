package advanced_oop.aggregation;

public class AggregationDemo {
    public static void main(String[] args) {
        System.out.println("=== ADVANCED TASK 1: Aggregation (University & Students) ===");
        Student student1 = new Student("Ahmed Khan", "BSE-2024-001");
        Student student2 = new Student("Fatima Ali", "BSE-2024-002");
        Student student3 = new Student("Ali Hassan", "BSE-2024-003");
        University uni1 = new University("Riphah International University");
        University uni2 = new University("FAST University");
        uni1.addStudent(student1);
        uni1.addStudent(student2);
        uni2.addStudent(student2);
        uni2.addStudent(student3);
        uni1.displayEnrolledStudents();
        uni2.displayEnrolledStudents();
        System.out.println("Demonstrating Student Independence (Aggregation):");
        uni1.removeStudent(student1);
        System.out.println("Student still exists independently:");
        student1.displayDetails();
        Student independentStudent = new Student("Sara Ahmed", "BSE-2024-004");
        System.out.println("\nNew student can exist without university:");
        independentStudent.displayDetails();
    }
}