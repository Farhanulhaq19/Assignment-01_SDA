package basic_oop.task2;

public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }
    
    public int add(int a, int b, int c) {
        return a + b + c;
    }
    
    public double add(double a, double b) {
        return a + b;
    }
    
    public static void main(String[] args) {
        System.out.println("=== TASK 2: Method Overloading ===");
        Calculator calc = new Calculator();
        System.out.println("Sum of 5 and 10: " + calc.add(5, 10));
        System.out.println("Sum of 5, 10 and 15: " + calc.add(5, 10, 15));
        System.out.println("Sum of 5.5 and 10.5: " + calc.add(5.5, 10.5));
    }
}