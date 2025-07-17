package Facade;

public class VideoPlayer {

    public void play(String fileName) {
        System.out.println("Playing video: " + fileName);
    }
    public void stop() {
        System.out.println("Stopping video");
    }
}
