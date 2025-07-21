package BehavioralPatterns.Visitor;

public class Developer implements Employee {

    private final String name;
    private final int completedProjects;

    public Developer(String name, int completedProjects) {
        this.name = name;
        this.completedProjects = completedProjects;
    }

    public String getName() {
        return name;
    }

    public int getCompletedProjects() {
        return completedProjects;
    }

    @Override
    public void accept(EmployeeVisitor visitor) {
        visitor.visit(this);
    }
}
