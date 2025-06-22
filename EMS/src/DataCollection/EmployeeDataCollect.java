package DataCollection;

import Print.EmployeeDataPrint;
import Enums.Role;

import java.util.Scanner;

public class EmployeeDataCollect {
    private final Scanner in = new Scanner(System.in);
    private final EmployeeDataPrint dataPrint = new EmployeeDataPrint();

    public String getName(){
        dataPrint.printGetName();
        return in.next();
    }

    public Role getRole(){
        dataPrint.printGetRole();
        int role = in.nextInt();
        if (role == 0) {
            return Role.MANAGER;
        } else {
            return Role.EMPLOYEE;
        }
    }

    public double getSalary(){
        dataPrint.printGetSalary();
        return in.nextDouble();
    }

    public int getViewData() {
        dataPrint.printFilter();
        return in.nextInt();
    }

    public int getEmpId() {
        dataPrint.printGetId();
        return in.nextInt();
    }
}
