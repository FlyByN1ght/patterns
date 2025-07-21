package BehavioralPatterns.CoR;

public interface Handler {
    void setNext(Handler nextHandler);
    void handlerRequest(Request request);
}
