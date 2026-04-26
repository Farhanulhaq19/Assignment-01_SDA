package basic_oop.task1;

public class Student {
    private String name;
    private String rollNumber;
    
    public Student(String name, String rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
    }
    
    public void displayDetails() {
        System.out.println("Student Details:");
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("-------------------");
    }
    
    public static void main(String[] args) {
        System.out.println("=== TASK 1: Class and Object ===");
        Student student1 = new Student("Ahmed Khan", "BSE-2024-001");
        student1.displayDetails();
        
        Student student2 = new Student("Fatima Ali", "BSE-2024-002");
        student2.displayDetails();
        
        Student student3 = new Student("Ali Hassan", "BSE-2024-003");
        student3.displayDetails();
    }
}