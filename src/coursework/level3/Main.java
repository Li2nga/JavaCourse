package coursework.level3;

public class Main {
    public static void main(String[] args) {

        EmployeeBook employeeBook = new EmployeeBook();
        employeeBook.addNewEmployee("Сорокин С.С.", 1, 40000_00);
        employeeBook.addNewEmployee("Иванов И.И.", 2, 45000_00);
        employeeBook.addNewEmployee("Волков В.В.", 3, 50000_00);
        employeeBook.addNewEmployee("Петров П.П.", 4, 60000_00);
        employeeBook.addNewEmployee("Сидоров А.В.", 5, 65000_00);
        employeeBook.addNewEmployee("Белкин Б.Б.", 1, 41000_00);

        System.out.println(employeeBook);
        System.out.println("------------------------------------------------");
        employeeBook.deletingEmployee(5);
        System.out.println(employeeBook);
        employeeBook.changeEmployee(1, 43000_00, 1);
        System.out.println(employeeBook);
        System.out.println("------------------------------------------------");
        employeeBook.printEmployeeDepartment(1);
        System.out.println("------------------------------------------------");
        employeeBook.printListEmployeesDepartment();
        System.out.println("------------------------------------------------");
        System.out.println(employeeBook.sumSalaryEmployee());
        System.out.println("------------------------------------------------");
        employeeBook.salaryIndexationDepartment(5, 10);
        System.out.println("------------------------------------------------");
        employeeBook.salaryIndexationDepartment(1, 10);
        System.out.println(employeeBook);
    }
}