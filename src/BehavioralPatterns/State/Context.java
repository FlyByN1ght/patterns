package BehavioralPatterns.State;

public class Context {

    private State state;

    public Context() {
        state = new CloseState();
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }

    public void doAction() {
        state.doAction(this);
    }
}
