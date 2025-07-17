package Facade;

public class MediaFacade {

    private AudioPlayer audioPlayer;
    private VideoPlayer videoPlayer;

    public MediaFacade() {
        this.audioPlayer = new AudioPlayer();
        this.videoPlayer = new VideoPlayer();
    }

    public void playMedia(String filename, String type) {
        if (type.equalsIgnoreCase("audio")) {
            audioPlayer.play(filename);
        } else if (type.equalsIgnoreCase("video")) {
            videoPlayer.play(filename);
        } else {
            System.out.println("Unsupported media type.");
        }
    }

    public void stopMedia(String type) {
        if (type.equalsIgnoreCase("audio")) {
            audioPlayer.stop();
        } else if (type.equalsIgnoreCase("video")) {
            videoPlayer.stop();
        } else {
            System.out.println("Unsupported media type.");
        }
    }
}

