package Strategy;

public class AudioPlayStrategy implements PlayStrategy {

    @Override
    public void play(String fileName) {
        System.out.println("Playing audio: " + fileName);
    }
}
