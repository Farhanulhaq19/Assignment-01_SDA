package advanced_oop.composition;

import java.util.ArrayList;
import java.util.List;

public class House {
    private String address;
    private List<Room> rooms;
    
    public House(String address) {
        this.address = address;
        this.rooms = new ArrayList<>();
        createDefaultRooms();
    }
    
    private void createDefaultRooms() {
        rooms.add(new Room("Master Bedroom", 250.0));
        rooms.add(new Room("Kitchen", 180.0));
        rooms.add(new Room("Living Room", 300.0));
        rooms.add(new Room("Bathroom", 80.0));
    }
    
    public void addRoom(String roomType, double area) {
        Room newRoom = new Room(roomType, area);
        rooms.add(newRoom);
        System.out.println(roomType + " added to house at " + address);
    }
    
    public void displayHouseDetails() {
        System.out.println("\n=== House Details ===");
        System.out.println("Address: " + address);
        System.out.println("Number of Rooms: " + rooms.size());
        System.out.println("Rooms:");
        for (Room room : rooms) {
            room.displayRoomDetails();
        }
        double totalArea = 0;
        for (Room room : rooms) {
            totalArea += room.getArea();
        }
        System.out.println("Total Area: " + totalArea + " sq. ft.");
        System.out.println("====================\n");
    }
    
    public void destroyHouse() {
        System.out.println("\nDestroying house at " + address);
        System.out.println("All rooms are being destroyed with the house:");
        for (Room room : rooms) {
            System.out.println("  - Destroying " + room.getRoomType());
        }
        rooms.clear();
        System.out.println("House and all rooms destroyed.\n");
    }
    
    public String getAddress() {
        return address;
    }
}