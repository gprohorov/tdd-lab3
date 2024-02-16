package edu.pro;

/**
 * Created by george on 12/2/16.
 */
public class Company {
    // parent for this company nullable, when there is no parent for this company
    private Company parent;
    private long employeesCount;

    public Company(Company parent, long employeesCount) {
        this.parent = parent;
        this.employeesCount = employeesCount;
    }

    public Company getParent() {
        return parent;
    }

    public long getEmployeesCount() {
        return employeesCount;
    }
}
