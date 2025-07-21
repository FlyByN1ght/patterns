package BehavioralPatterns.Visitor;

public class Manager implements Employee {
    private final String name;
    private final double kpi;

    public Manager(String name, double kpi) {
        this.name = name;
        this.kpi = kpi;
    }

    public String getName() {
        return name;
    }

    public double getKpi() {
        return kpi;
    }

    @Override
    public void accept(EmployeeVisitor visitor) {
        visitor.visit(this);
    }
}
