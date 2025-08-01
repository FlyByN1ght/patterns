package StructuralPatterns.Decorator;

public class DeveloperDecorator implements Developer {

    final Developer developer;

    public DeveloperDecorator(Developer developer) {
        this.developer = developer;
    }

    @Override
    public String makeJob() {
        return developer.makeJob();
    }
}
