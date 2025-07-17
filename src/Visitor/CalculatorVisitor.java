package Visitor;

public class CalculatorVisitor implements EmployeeVisitor {
    @Override
    public void visit(Developer developer) {
        int bonus = developer.getCompletedProjects() * 5000;
        System.out.println(developer.getName() + " " + bonus);
    }

    @Override
    public void visit(Manager manager) {
        int bonus = (int)(manager.getKpi() * 10000);
        System.out.println(manager.getName() + " " + bonus);
    }
}
