package Visitor;

public interface Employee {
    void accept(EmployeeVisitor visitor);
}
