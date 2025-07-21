package BehavioralPatterns.Strategy;

public class MediaPlayer {

    private PlayStrategy strategy;

    public void setPlayStrategy(PlayStrategy strategy) {
        this.strategy = strategy;
    }

    public void play(String fileName) {
        if (strategy == null) {
            throw new NullPointerException("PlayStrategy is null");
        }
        strategy.play(fileName);
    }
}
