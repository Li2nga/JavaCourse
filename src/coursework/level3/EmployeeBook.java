package coursework.level3;

public class EmployeeBook {
    private final Employee[] employeeBook;

    public EmployeeBook() {
        this.employeeBook = new Employee[10];
    }

    public void addNewEmployee(String fullName, int department, int salary) {
        for (int i = 0; i < employeeBook.length; i++) {
            if (employeeBook[i] == null) {
                employeeBook[i] = new Employee(fullName, department, salary);
                return;
            }
        }
        System.out.println("Книга заполнена");
    }

    public void deletingEmployee(int id) {
        for (int i = 0; i < employeeBook.length; i++) {
            if (employeeBook[i] != null && employeeBook[i].getId() == id) {
                employeeBook[i] = null;
            }
        }
        System.out.println("Такого сотрудника нет");
    }

    public void changeEmployee(int id, int salary, int department) {
        for (Employee employee : employeeBook) {
            if (employee != null && employee.getId() == id) {
                employee.setSalary(salary);
                employee.setDepartment(department);
            }
        }
        System.out.println("Такого сотрудника нет");
    }

    public long sumSalaryEmployee() {
        long sum = 0;
        for (Employee employee : employeeBook) {
            if (employee != null) {
                sum += employee.getSalary();
            }
        }
        return sum / 100;
    }

    public void printEmployeeDepartment(int department) {
        boolean empty = true;
        for (Employee employee : employeeBook) {
            if (employee != null && employee.getDepartment() == department) {
                System.out.println(STR."\{employee.getFullName()}");
                empty = false;
            }
        }
        if (empty) {
            System.out.println("В данном департаменте нет сотрудников");
        }
    }

    public void printListEmployeesDepartment() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(STR."Department \{i}:");
            printEmployeeDepartment(i);
        }
    }

    public void salaryIndexationDepartment(int department, double indexationPercentage) {
        boolean empty = true;
        for (Employee employee : employeeBook) {
            if (employee != null && employee.getDepartment() == department) {
                empty = false;
                employee.setSalary((int) Math.round(employee.getSalary() + employee.getSalary() * indexationPercentage / 100));
            }
        }
        if (empty) {
            System.out.println("В департаменте нет сотрудников для индексации");
        }
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < employeeBook.length - 1; i++) {
            str.append('[').append(i).append(']').append(employeeBook[i]).append('\n');
        }
        str.append('[').append(employeeBook.length - 1).append(']').append(employeeBook[employeeBook.length - 1]);
        return str.toString();
    }
}