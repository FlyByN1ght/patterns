package BehavioralPatterns.CoR;

public class SalesManager implements Handler {
    private Handler nextHandler;

    @Override
    public void setNext(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void handlerRequest(Request request) {
        if (request.getAmount() <= 1000) {
            System.out.println("Sales Manager handled the order: " + request.getDescription());
        } else if (nextHandler != null) {
            nextHandler.handlerRequest(request);
        } else {
            System.out.println("Order is too large, no one can handle it.");
        }
    }
}