package BehavioralPatterns.Visitor;

public interface EmployeeVisitor {
    void visit(Developer developer);
    void visit(Manager manager);
}
