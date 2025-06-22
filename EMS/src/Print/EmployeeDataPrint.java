package Print;

import Modules.Employee;

import java.util.List;

public class EmployeeDataPrint {
    public void printEmployee(Employee employee) {
        System.out.println(
                "empId = " + employee.getEmpId() +
                "\nempName = " + employee.getEmpName() +
                "\nempRole = " + employee.getEmpRole() +
                "\nempSalary = " + employee.getEmpSalary() + "\n"
        );
    }

    public void printEmployeeNotFound() {
        System.out.println("Employee Not Fount!");
    }

    public void printEmployees(List<Employee> employees) {
        for (Employee employee : employees) {
            printEmployee(employee);
        }
    }

    public void printGetName() {
        System.out.print("Enter Employee Name ");
    }

    public void printGetRole() {
        System.out.print("Enter Employee Role (0 - MANAGER, 1 - EMPLOYEE) ");
    }

    public void printGetSalary() {
        System.out.print("Enter Employee Salary ");
    }

    public void printAddSuccess() {
        System.out.println("Employee Added Successfully!");
    }

    public void printDeleteSuccess() {
        System.out.println("Employee Deleted Successfully!");
    }

    public void printGetId() {
        System.out.print("Enter Employee ID ");
    }

    public void printFilter() {
        System.out.println(
                """
                            1. Filter By Role\s
                            2. Salary Less than\s
                            3. Salary Less than\s
                            4. Find Employee By ID
                            """
        );
        System.out.print("Enter the choice ");
    }
}
