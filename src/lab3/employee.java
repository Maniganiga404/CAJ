package lab3;

public class employee {

    private int empID;
    private String name;
    private String designation;
    private double salary;

    employee(int employeeId, String name, String designation, double salary) {
        this.empID = employeeId;
        this.name = name;
        this.designation = designation;
        this.salary = salary;
    }

    public boolean searchEmployee(int id) {
        if (this.empID == id)
            return true;

        return false;
    }

    public void incrementSalary() {
        salary = salary * 1.1;
    }

    @Override
    public String toString() {
        return "Name: " + getName()
                + " Designation: " + getDesignation()
                + " Salary: " + getSalary();
    }

    public int getEmployeeId() {
        return empID;
    }

    public String getName() {
        return name;
    }

    public String getDesignation() {
        return designation;
    }

    public double getSalary() {
        return salary;
    }
}