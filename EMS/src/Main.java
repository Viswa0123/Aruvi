import Services.EmployeeServices;

import java.util.Scanner;

public class Main {
    private static final EmployeeServices employeeServices = new EmployeeServices();

    public static void main(String[] args) {
        System.out.println("**************** Welcome To Employee Management System ****************");
        int n;
        Scanner in = new Scanner(System.in);
        do {
            System.out.println(
                    """
                            1. Add Employee\s
                            2. View Employee\s
                            3. Delete Employee\s
                            4. View All Employee\s
                            5. Exit\s
                            """
            );
            System.out.print("Enter Your Choice ");
            n = in.nextInt();
            switch (n) {
                case 1:
                    employeeServices.addEmployee();
                    break;
                case 2:
                    employeeServices.viewEmployee();
                    break;
                case 3:
                    employeeServices.delete();
                    break;
                case 4:
                    employeeServices.viewAllEmployees();
                    break;
            }
            System.out.println();
        } while (n != 5);
    }
}
