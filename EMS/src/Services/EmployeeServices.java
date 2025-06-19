package Services;

import DataCollection.EmployeeDataCollect;
import DataPrint.EmployeeDataPrint;
import Modules.Employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeServices {
    private static final List<Employee> employees = new ArrayList<>();
    private final EmployeeDataCollect employeeDataCollect = new EmployeeDataCollect();
    private final EmployeeDataPrint employeeDataPrint = new EmployeeDataPrint();
    private static Integer empIds = 0;

    public void addEmployee() {
        Employee emp = employeeDataCollect.getData();
        emp.setEmpId(++empIds);
        employees.add(emp);
    }

    public void viewEmployee() {
        List<Employee> employees = employeeDataCollect.getViewData(EmployeeServices.getEmployees());
        employeeDataPrint.printEmployees(employees);
    }

    public void delete() {
        int empId = employeeDataCollect.getEmpId();
        int flag = 0;
        for (int i = 0; i < employees.size(); i++) {
            Employee employee = employees.get(i);
            if (empId == employee.getEmpId()) {
                flag = 1;
                employees.remove(employee);
            }
            if (flag == 1) {
                break;
            }
        }
        employeeDataPrint.getDeleteSuccess();
    }

    public void viewAllEmployees() {
        employeeDataPrint.printEmployees(employees);
    }

    private static List<Employee> getEmployees() {
        return employees;
    }
}
