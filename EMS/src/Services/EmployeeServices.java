package Services;

import DataCollection.EmployeeDataCollect;
import Enums.Role;
import Print.EmployeeDataPrint;
import Modules.Employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeServices {
    private static final List<Employee> employees = new ArrayList<>();
    private final EmployeeDataCollect dataCollect = new EmployeeDataCollect();
    private final EmployeeDataPrint dataPrint = new EmployeeDataPrint();
    private static Integer empIds = 1;

    public void addEmployee() {
        String name = dataCollect.getName();
        Role role = dataCollect.getRole();
        double salary = dataCollect.getSalary();
        employees.add(new Employee(empIds++, name, role, salary));
        dataPrint.printAddSuccess();
    }

    public void viewEmployee() {
        int n = dataCollect.getViewData();
        List<Employee> employees = new ArrayList<>();
        switch (n) {
            case 1:
                Role role = dataCollect.getRole();
                getEmployeeByRole(role, employees);
                break;
            case 2:
                double salaryLessThan = dataCollect.getSalary();
                getEmployeeSalaryLessThan(salaryLessThan, employees);
                break;
            case 3:
                double salaryGreaterThan = dataCollect.getSalary();
                getEmployeeSalaryGreaterThan(salaryGreaterThan, employees);
                break;
            case 4:
                int id = dataCollect.getEmpId();
                employees.add(getEmployeeById(id));
                break;
            default:
                System.out.println("Invalid Input");
        }
        dataPrint.printEmployees(employees);
    }

    private void getEmployeeSalaryLessThan(double salary, List<Employee> emps) {
        for (Employee employee : employees) {
            if (salary >= employee.getEmpSalary()) {
                emps.add(employee);
            }
        }
    }

    private void getEmployeeSalaryGreaterThan(double salary, List<Employee> emps) {
        for (Employee employee : employees) {
            if (salary >= employee.getEmpSalary()) {
                emps.add(employee);
            }
        }
    }

    public void delete() {
        int empId = dataCollect.getEmpId();
        Employee employee = getEmployeeById(empId);
        if (employee != null) {
            employees.remove(employee);
            dataPrint.printDeleteSuccess();
        } else {
            dataPrint.printEmployeeNotFound();
        }
    }

    public void viewAllEmployees() {
        dataPrint.printEmployees(employees);
    }

    private static Employee getEmployeeById(int empId) {
        for (Employee employee : employees) {
            if (empId == employee.getEmpId()) {
                return employee;
            }
        }
        return null;
    }

    private static void getEmployeeByRole(Role role, List<Employee> emps) {
        for (Employee employee : employees) {
            if (role == employee.getEmpRole()) {
                emps.add(employee);
            }
        }
    }
}
