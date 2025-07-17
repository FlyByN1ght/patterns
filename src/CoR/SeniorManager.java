package CoR;

public class SeniorManager implements Handler {

    private Handler nextHandler;

    @Override
    public void setNext(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void handlerRequest(Request request) {
        if (request.getAmount() > 1000) {
            System.out.println("Senior Manager handled the order: " + request.getDescription());
        } else if (nextHandler != null) {
            nextHandler.handlerRequest(request);
        } else {
            System.out.println("Order is too small");
        }
    }
}
