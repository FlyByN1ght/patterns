package Strategy;

public class VideoPlayStrategy implements PlayStrategy {

    @Override
    public void play(String fileName) {
        System.out.println("Playing video: " + fileName);
    }
}
