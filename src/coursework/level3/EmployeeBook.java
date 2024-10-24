package coursework.level3;

import java.util.Arrays;

public class EmployeeBook {
    private final Employee[] employeeBook;

    public EmployeeBook() {
        this.employeeBook = new Employee[10];
    }

    public void addNewEmployee(String fullName, int department, int salary) {
        for (int i = 0; i < employeeBook.length; i++) {
            if (employeeBook[i] == null) {
                employeeBook[i] = new Employee(fullName, department, salary);
                break;
            }
            if (i == employeeBook.length - 1) {
                System.out.println("Книга заполнена");
            }
        }
    }

    public void deletingEmployee(int id) {
        for (int i = 0; i < employeeBook.length; i++) {
            if (employeeBook[i] != null && employeeBook[i].getId() == id) {
                employeeBook[i] = null;
            }
        }
    }
    public void changeEmployee(int id, int salary, int department) {
        for (int i = 0; i < employeeBook.length; i++) {
            if (employeeBook[i] != null && employeeBook[i].getId() == id) {
                employeeBook[i].setSalary(salary);
                employeeBook[i].setDepartment(department);
            }
        }
    }

    public  void printEmployeeDepartment( int department) {
        boolean empty = true;
        for (int i = 0; i < employeeBook.length; i++) {
            if (employeeBook[i] != null && employeeBook[i].getDepartment() == department) {
                System.out.println(STR."\{employeeBook[i].getFullName()}");
                empty = false;
            }
        }
        if (empty) {
            System.out.println("В данном департаменте нет сотрудников");
        }
    }
    public void printListEmployeesDepartment() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Department " + i +":");
            printEmployeeDepartment(i);


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
