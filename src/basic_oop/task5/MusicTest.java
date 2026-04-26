package basic_oop.task5;

public class MusicTest {
    public static void main(String[] args) {
        System.out.println("=== TASK 5: Interface ===");
        Playable[] instruments = new Playable[2];
        instruments[0] = new Guitar("Acoustic");
        instruments[1] = new Piano("Yamaha");
        System.out.println("Music Performance:");
        for (Playable instrument : instruments) {
            System.out.println("\nInstrument: " + instrument.getInstrumentName());
            instrument.play();
            instrument.stop();
        }
    }
}