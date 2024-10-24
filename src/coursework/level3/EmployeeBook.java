package coursework.level3;

public class EmployeeBook {
    private final Employee[] employeeBook;

    public EmployeeBook() {
        this.employeeBook = new Employee[10];
    }

    public void addNewEmployee(String fullName, int department, int salary) {
        for (Employee employee : employeeBook) {
            if (employee == null) {
                employee = new Employee(fullName, department, salary);
                break;
            }
        }
    }
}
