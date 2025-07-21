package StructuralPatterns.Facade;

public class AudioPlayer {

    public void play(String fileName) {
        System.out.println("Playing audio: " + fileName);
    }
    public void stop() {
        System.out.println("Stopping audio");
    }
}
