package TemplateMethod;

public class PhysicalOrderProcessor extends OrderProcessor {

    @Override
    protected void pay() {
        System.out.println("physical wallet");
    }
}
