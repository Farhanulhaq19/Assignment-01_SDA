package basic_oop.task4;

public class ShapeTest {
    public static void main(String[] args) {
        System.out.println("=== TASK 4: Abstract Class ===");
        Shape circle = new Circle("Red", 5.0);
        Shape rectangle = new Rectangle("Blue", 4.0, 6.0);
        System.out.println("Circle Area: " + String.format("%.2f", circle.area()));
        circle.displayColor();
        System.out.println("\nRectangle Area: " + String.format("%.2f", rectangle.area()));
        rectangle.displayColor();
    }
}