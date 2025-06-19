package DataCollection;

import DataPrint.EmployeeDataPrint;
import Enums.Role;
import Modules.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeDataCollect {
    private final Scanner in = new Scanner(System.in);
    private final EmployeeDataPrint employeeDataPrint = new EmployeeDataPrint();

    public Employee getData() {
        Employee emp = new Employee();

        employeeDataPrint.getName();
        emp.setEmpName(in.next());

        employeeDataPrint.getRole();
        int role = in.nextInt();
        if (role == 0) {
            emp.setEmpRole(Role.MANAGER);
        } else {
            emp.setEmpRole(Role.EMPLOYEE);
        }

        employeeDataPrint.getSalary();
        emp.setEmpSalary(in.nextDouble());

        employeeDataPrint.getAddSuccess();
        return emp;
    }

    public List<Employee> getViewData(List<Employee> emps) {
        List<Employee> employees = new ArrayList<>();
        return employees;
    }

    public int getEmpId() {
        employeeDataPrint.getId();
        return in.nextInt();
    }
}
