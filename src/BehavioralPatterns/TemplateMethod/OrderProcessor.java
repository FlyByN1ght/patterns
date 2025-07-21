package BehavioralPatterns.TemplateMethod;

public abstract class OrderProcessor {

    public final void process() {
        selectItem();
        pay();
    }

    protected void selectItem() {
        System.out.println("Select item");
    }
    protected abstract void pay();
}
