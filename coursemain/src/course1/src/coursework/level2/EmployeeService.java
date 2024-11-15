package coursework.level2;

public class EmployeeService {
    public static long sumSalaryEmployee(Employee[] employees) {
        long sum = 0;
        for (Employee i : employees) {
            if (i != null) {
                sum += i.getSalary();
            }
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
            if (employees[i] != null) {
                System.out.println(STR."\{i}: \{employees[i].getFullName()}");
            } else System.out.println(STR."\{i}: пусто");
        }
    }

    public static void salaryIndexation(Employee[] employees, double indexationPercentage) {
        for (Employee employee : employees) {
            if (employee != null) {
                employee.setSalary((int) Math.round(employee.getSalary() + employee.getSalary() * indexationPercentage / 100));
            }
        }
    }

    public static Employee[] employeeMinSalary(Employee[] employees, int department) {
        int minSalary = Integer.MAX_VALUE;
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() < minSalary && employee.getDepartment() == department) {
                minSalary = employee.getSalary();
            }
        }
        int i = 0;
        for (Employee employee : employees) {
            if (employee != null && minSalary == employee.getSalary() && employee.getDepartment() == department) {
                i++;
            }
        }
        Employee[] employeesMinSalary = new Employee[i];
        int index = 0;
        for (Employee employee : employees)
            if (employee != null && minSalary == employee.getSalary() && employee.getDepartment() == department) {
                employeesMinSalary[index++] = employee;
            }
        return employeesMinSalary;
    }

    public static Employee[] employeeMaxSalary(Employee[] employees, int department) {
        int maxSalary = Integer.MIN_VALUE;
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() > maxSalary && employee.getDepartment() == department) {
                maxSalary = employee.getSalary();
            }
        }
        int i = 0;
        for (Employee employee : employees) {
            if (employee != null && maxSalary == employee.getSalary() && employee.getDepartment() == department) {
                i++;
            }
        }
        Employee[] employeesMaxSalary = new Employee[i];
        int index = 0;
        for (Employee employee : employees)
            if (employee != null && maxSalary == employee.getSalary() && employee.getDepartment() == department) {
                employeesMaxSalary[index++] = employee;
            }
        return employeesMaxSalary;
    }

    public static long sumSalaryEmployeesDepartment(Employee[] employees, int department) {
        long sum = 0;
        for (Employee i : employees) {
            if (i != null && i.getDepartment() == department) {
                sum += i.getSalary();
            }
        }
        return sum;
    }

    public static double averageSalaryDepartment(Employee[] employees, int department) {
        int i = 0;
        for (Employee employee : employees) {
            if (employee != null && employee.getDepartment() == department) {
                i++;
            }
        }
        return (double) sumSalaryEmployeesDepartment(employees, department) / i;
    }

    public static void salaryIndexationDepartment(Employee[] employees, int department, double indexationPercentage) {
        for (Employee employee : employees) {
            if (employee != null && employee.getDepartment() == department) {
                employee.setSalary((int) Math.round(employee.getSalary() + employee.getSalary() * indexationPercentage / 100));
            }
        }
    }

    public static void printEmployeesDepartment(Employee[] employees, int department) {
        boolean empty = true;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getDepartment() == department) {
                System.out.println(STR."\{i}: \{employees[i].toStringWithoutDepartment()}");
                empty = false;
            }
        }
        if (empty) {
            System.out.println("Таких сотрудников нет");
        }
    }

    public static void printEmployeesLessSalary(Employee[] employees, long targetSalary) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getSalary() < targetSalary) {
                System.out.println(STR."\{i}: \{employees[i].toStringWithoutDepartment()}");
            }
        }
    }

    public static void printEmployeesHigherSalary(Employee[] employees, long targetSalary) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getSalary() >= targetSalary) {
                System.out.println(STR."\{i}: \{employees[i].toStringWithoutDepartment()}");
            }
        }
    }
}
