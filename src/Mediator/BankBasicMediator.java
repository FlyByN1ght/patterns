package Mediator;

public class BankBasicMediator implements BankMediator {
    @Override
    public void createAccount(BankUser user) {
        System.out.println("Creating account for bank basic mediator");
    }
}
