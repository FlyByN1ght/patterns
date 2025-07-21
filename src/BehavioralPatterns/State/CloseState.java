package BehavioralPatterns.State;

public class CloseState implements State {

    @Override
    public void doAction(Context context) {
        System.out.println("Closing BehavioralPatterns.State");
    }
}
