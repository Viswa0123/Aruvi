package DataPrint;

import Modules.Employee;

import java.util.List;

public class EmployeeDataPrint {
    public void printEmployee(Employee employee) {
        System.out.println(
                "empId = " + employee.getEmpId() +
                "\nempName = '" + employee.getEmpName() +
                "\nempRole = " + employee.getEmpRole() +
                "\nempSalary = " + employee.getEmpSalary() + "\n"
        );
    }

    public void empNotFound() {
        System.out.println("Employee Not Fount!");
    }

    public void printEmployees(List<Employee> employees) {
        for (Employee employee : employees) {
            printEmployee(employee);
        }
    }

    public void getName() {
        System.out.print("Enter Employee Name ");
    }

    public void getRole() {
        System.out.print("Enter Employee Enums.Role (0 - MANAGER, 1 - EMPLOYEE) ");
    }

    public void getSalary() {
        System.out.print("Enter Employee Salary ");
    }

    public void getAddSuccess() {
        System.out.println("Employee Added Successfully!");
    }

    public void getDeleteSuccess() {
        System.out.println("Employee Deleted Successfully!");
    }

    public void getId() {
        System.out.print("Enter Employee Id ");
    }
}
