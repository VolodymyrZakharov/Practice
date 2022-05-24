import employee.Employee;
import employee.HourBasedEmployee;
import employee.Manager;
import employee.OfficeEmployee;


public class Main {

    public static void main(String[] args) {

        OfficeEmployee officeEmployee = new OfficeEmployee(2, "Petya", "Tel-Ran", 3000, 2000);
        Manager managerStepan = new Manager(3, "Stepan", "Google", 3500, 1.1);
        HourBasedEmployee hourBasedEmployeeTatyana = new HourBasedEmployee(4, "Tanya", "bla", 1000, 180);

        Employee hourBasedEmployeeMaria = new HourBasedEmployee(5, "Tanya", "bla", 1000, 180);

        /*
        Employee employeeVasya = new Employee(1, "Vasya", "Vasin", 2000);
        Employee officeEmployee = new OfficeEmployee(2, "Petya", "Tel-Ran", 3000, 2000);
        Employee managerStepan = new Manager(3, "Stepan", "Google", 3500, 1.1);
        Employee Tatyana = new HourBasedEmployee(3, "Tanya", "bla", 1000, 180);
        */

        System.out.println(hourBasedEmployeeTatyana.getMonthlyHours());
        // System.out.println(hourBasedEmployeeMaria.getMonthlyHours()); нельзя, т.к. ссылк ана нее идет через более узкий родительский класс Employee

        System.out.println(officeEmployee.getSalary());
        System.out.println(managerStepan.getSalary());
        System.out.println(hourBasedEmployeeTatyana.getSalary());

        Employee[] employees = {officeEmployee, managerStepan, hourBasedEmployeeMaria};
        for (int i = 0; i < employees.length; i++) {
            System.out.println("The employee " + employees[i].getName() + " has salary " + employees[i].getSalary());
        }
    }
}
