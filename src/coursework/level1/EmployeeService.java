package coursework.level1;

public class EmployeeService {
    public static long sumSalaryEmployee(Employee[] employees) {
        long sum = 0;
        for (Employee i : employees) {
            sum += i.getSalary();
        }
        return sum;
    }

    public static Employee[] minSalaryEmployee(Employee[] employees) {
        int minSalary = Integer.MAX_VALUE;
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() < minSalary) {
                minSalary = employee.getSalary();
            }
        }
        int i = 0;
        for (Employee employee : employees) {
            if (employee != null && minSalary == employee.getSalary()) {
                i++;
            }
        }
        Employee[] out = new Employee[i];
        i = 0;
        for (Employee employee : employees) {
            if (employee != null && minSalary == employee.getSalary()) {
                out[i++] = employee;
            }
        }
        return out;
    }

    public static Employee[] maxSalaryEmployee(Employee[] employees) {
        int maxSalary = 0;
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() > maxSalary) {
                maxSalary = employee.getSalary();
            }
        }
        int i = 0;
        for (Employee employee : employees) {
            if (employee != null && maxSalary == employee.getSalary()) {
                i++;
            }
        }
        Employee[] out = new Employee[i];
        i = 0;
        for (Employee employee : employees) {
            if (employee != null && maxSalary == employee.getSalary()) {
                out[i++] = employee;
            }
        }
        return out;
    }

    public static double averageSalary(Employee[] employees) {
        int i = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                i++;
            }
        }
        return (double) sumSalaryEmployee(employees) / i;
    }

    public static void printEmployees(Employee[] employees) {
        for (int i = 0; i < employees.length; i++) {
            System.out.println(STR."\{i}: \{employees[i]}");
        }
    }

    public static void printEmployee(Employee[] employees) {
        for (int i = 0; i < employees.length; i++) {
            System.out.println(STR."\{i}: \{employees[i].getFullName()}");
        }
    }
}