package BehavioralPatterns.Mediator;

public class BankUser {
    private String name;
    private BankMediator mediator;

    public BankUser(String name, BankMediator mediator) {
        this.name = name;
        this.mediator = mediator;
    }

    public String getName() {
        return name;
    }

    public void createAccount() {
        mediator.createAccount(this);
    }
}
