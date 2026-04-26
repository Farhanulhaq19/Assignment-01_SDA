package advanced_oop.aggregation;

public class Student {
    private String name;
    private String studentID;
    
    public Student(String name, String studentID) {
        this.name = name;
        this.studentID = studentID;
    }
    
    public String getName() {
        return name;
    }
    
    public String getStudentID() {
        return studentID;
    }
    
    public void displayDetails() {
        System.out.println("Student ID: " + studentID + ", Name: " + name);
    }
}