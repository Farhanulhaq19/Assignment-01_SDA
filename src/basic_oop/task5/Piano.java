package basic_oop.task5;

public class Piano implements Playable {
    private String brand;
    
    public Piano(String brand) {
        this.brand = brand;
    }
    
    @Override
    public void play() {
        System.out.println("Playing " + brand + " piano: Pressing keys");
    }
    
    @Override
    public void stop() {
        System.out.println("Stopping piano");
    }
    
    @Override
    public String getInstrumentName() {
        return brand + " Piano";
    }
}