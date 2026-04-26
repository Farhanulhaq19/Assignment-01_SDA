package advanced_oop.composition;

public class Room {
    private String roomType;
    private double area;
    
    public Room(String roomType, double area) {
        this.roomType = roomType;
        this.area = area;
    }
    
    public String getRoomType() {
        return roomType;
    }
    
    public double getArea() {
        return area;
    }
    
    public void displayRoomDetails() {
        System.out.println("  - " + roomType + " (" + area + " sq. ft.)");
    }
}