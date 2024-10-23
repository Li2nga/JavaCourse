package coursework.level2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[10];
        employees[0] = new Employee("Сорокин С.С.", 1, 40000_00);
        employees[1] = new Employee("Иванов И.И.", 2, 45000_00);
        employees[2] = new Employee("Волков В.В.", 3, 50000_00);
        employees[3] = new Employee("Петров П.П.", 4, 60000_00);
        employees[4] = new Employee("Сидоров А.В.", 5, 65000_00);
        employees[5] = new Employee("Белкин Б.Б.", 1, 41000_00);
        // employees[6] = new Employee("Белов С.А.", 2, 63000_00);
        employees[7] = new Employee("Власова А.А.", 3, 55000_00);
        employees[8] = new Employee("Гайдукова Г.В.", 4, 47000_00);
        employees[9] = new Employee("Кузнецова Н.В.", 5, 70000_00);
        EmployeeService.printEmployees(employees);
        System.out.println(STR."Сумма затрат на зарплаты в месяц составила \{EmployeeService.sumSalaryEmployee(employees) / 100} рублей");
        System.out.println(STR."Сотрудник с минимальной зарплатой:\{Arrays.toString(EmployeeService.minSalaryEmployee(employees))}");
        System.out.println(STR."Сотрудник с максимальной зарплатой:\{Arrays.toString(EmployeeService.maxSalaryEmployee(employees))}");
        System.out.println(STR."Cреднее значение зарплат составляет \{EmployeeService.averageSalary(employees) / 100} рублей");
        EmployeeService.printEmployee(employees);
        System.out.println("------------------------------------------------");
        EmployeeService.salaryIndexation(employees, 20);
        EmployeeService.printEmployees(employees);
        System.out.println("------------------------------------------------");
        System.out.println(Arrays.toString(EmployeeService.employeeMinSalary(employees, 3)));
        System.out.println("------------------------------------------------");
        System.out.println((Arrays.toString(EmployeeService.employeeMaxSalary(employees, 3))));
        System.out.println("------------------------------------------------");
        System.out.println((EmployeeService.sumSalaryEmployeesDepartment(employees, 3)) / 100);
        System.out.println("------------------------------------------------");
        System.out.println((EmployeeService.averageSalaryDepartment(employees, 3)) / 100);
        System.out.println("------------------------------------------------");
        EmployeeService.salaryIndexationDepartment(employees, 3, 10);
        EmployeeService.printEmployees(employees);
        // не сделан отбор по департаменту, на печать выведен весь массив сотрудников
        System.out.println("------------------------------------------------");
        EmployeeService.printEmployeesDepartment(employees, 3);
        System.out.println("------------------------------------------------");
        EmployeeService.printEmployeesLessSalary(employees, 6500000);
        System.out.println("------------------------------------------------");
        EmployeeService.printEmployeesHigherSalary(employees, 65000_00);

    }
}