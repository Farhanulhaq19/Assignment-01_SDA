package advanced_oop.aggregation;

import java.util.ArrayList;
import java.util.List;

public class University {
    private String universityName;
    private List<Student> students;
    
    public University(String universityName) {
        this.universityName = universityName;
        this.students = new ArrayList<>();
    }
    
    public void addStudent(Student student) {
        if (student != null && !students.contains(student)) {
            students.add(student);
            System.out.println(student.getName() + " enrolled in " + universityName);
        }
    }
    
    public void removeStudent(Student student) {
        if (students.remove(student)) {
            System.out.println(student.getName() + " removed from " + universityName);
        }
    }
    
    public void displayEnrolledStudents() {
        System.out.println("\n=== " + universityName + " ===");
        System.out.println("Enrolled Students (" + students.size() + "):");
        if (students.isEmpty()) {
            System.out.println("No students enrolled.");
        } else {
            for (Student student : students) {
                student.displayDetails();
            }
        }
        System.out.println("============================\n");
    }
    
    public String getUniversityName() {
        return universityName;
    }
}