package BehavioralPatterns.CoR;

public class Request {
    private String description;
    private double amount;

    public Request(String description, double amount) {
        this.description = description;
        this.amount = amount;
    }

    public String getDescription() {
        return description;
    }

    public double getAmount() {
        return amount;
    }
}
