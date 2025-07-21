package BehavioralPatterns.TemplateMethod;

public class DigitalOrderProcessor extends OrderProcessor {

    @Override
    protected void pay() {
        System.out.println("digital wallet");
    }
}
