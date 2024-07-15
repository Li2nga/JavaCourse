package coursework.level1;

public class Employee {
    private static int counter = 0;
    private final String fullName;
    private int department;
    private int salary;
    private int id;

    public Employee(String fullName, int department, int salary) {
        this.fullName = fullName;
        this.department = department;
        this.salary = salary;
        this.id = ++counter;
    }

    public String getFullName() {
        return fullName;
    }

    public int getDepartment() {
        return department;
    }

    public int getSalary() {
        return salary;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return STR."\{fullName}, department=\{department}, salary=\{salary / 100}, id=\{id}";
    }
}