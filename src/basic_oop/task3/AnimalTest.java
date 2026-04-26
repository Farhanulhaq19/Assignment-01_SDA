package basic_oop.task3;

public class AnimalTest {
    public static void main(String[] args) {
        System.out.println("=== TASK 3: Method Overriding & Polymorphism ===");
        Animal animal1 = new Dog();
        Animal animal2 = new Cat();
        Animal animal3 = new Animal();
        System.out.print("Dog says: ");
        animal1.sound();
        System.out.print("Cat says: ");
        animal2.sound();
        System.out.print("Animal says: ");
        animal3.sound();
        System.out.println("\nPolymorphism with Array:");
        Animal[] animals = {new Dog(), new Cat(), new Dog()};
        for (Animal animal : animals) {
            animal.sound();
        }
    }
}