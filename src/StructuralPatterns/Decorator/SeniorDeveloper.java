package StructuralPatterns.Decorator;

public class SeniorDeveloper extends DeveloperDecorator{


    public SeniorDeveloper(Developer developer) {
        super(developer);
    }

    public String task(){
        return " Senior Developer: task";
    }

    @Override
    public String makeJob() {
        return super.makeJob() + task();
    }
}
