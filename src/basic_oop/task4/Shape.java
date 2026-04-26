package basic_oop.task4;

public abstract class Shape {
    protected String color;
    
    public Shape(String color) {
        this.color = color;
    }
    
    public abstract double area();
    
    public void displayColor() {
        System.out.println("Color: " + color);
    }
}