package basic_oop.task2;

public class Employee extends Person {
    private double salary;
    
    public Employee(String name, int age, double salary) {
        super(name, age);
        this.salary = salary;
    }
    
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Salary: $" + salary);
        System.out.println("-------------------");
    }
    
    public static void main(String[] args) {
        System.out.println("=== TASK 2: Inheritance ===");
        Employee emp1 = new Employee("Sarah Ahmed", 30, 75000.00);
        Employee emp2 = new Employee("Usman Khan", 25, 55000.00);
        emp1.displayDetails();
        emp2.displayDetails();
    }
}