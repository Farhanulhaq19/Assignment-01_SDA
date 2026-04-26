package basic_oop.task5;

public class Guitar implements Playable {
    private String type;
    
    public Guitar(String type) {
        this.type = type;
    }
    
    @Override
    public void play() {
        System.out.println("Playing " + type + " guitar: Strumming chords");
    }
    
    @Override
    public void stop() {
        System.out.println("Stopping guitar");
    }
    
    @Override
    public String getInstrumentName() {
        return type + " Guitar";
    }
}