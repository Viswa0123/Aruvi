package Modules;

import Enums.Role;

public class Employee {
    private Integer empId;
    private String empName;
    private Role empRole;
    private Double empSalary;

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public Role getEmpRole() {
        return empRole;
    }

    public void setEmpRole(Role empRole) {
        this.empRole = empRole;
    }

    public double getEmpSalary() {
        return empSalary;
    }

    public void setEmpSalary(Double empSalary) {
        this.empSalary = empSalary;
    }
}
