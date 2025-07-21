package BehavioralPatterns.State;

public class OpenState implements State {

    @Override
    public void doAction(Context context) {
        System.out.println("Opening BehavioralPatterns.State");
    }
}
