package advanced_oop.composition;

public class CompositionDemo {
    public static void main(String[] args) {
        System.out.println("=== ADVANCED TASK 2: Composition (House & Rooms) ===");
        House house1 = new House("123 Main Street, Islamabad");
        House house2 = new House("456 Park Avenue, Lahore");
        house1.displayHouseDetails();
        house1.addRoom("Study Room", 120.0);
        house1.displayHouseDetails();
        house2.displayHouseDetails();
        System.out.println("=== Demonstrating Composition ===");
        house1.destroyHouse();
        System.out.println("Trying to display destroyed house:");
        house1.displayHouseDetails();
        System.out.println("House2 still exists:");
        house2.displayHouseDetails();
    }
}