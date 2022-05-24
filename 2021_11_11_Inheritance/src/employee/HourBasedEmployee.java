package employee;

public class HourBasedEmployee extends Employee {
    int monthlyHours;

    public HourBasedEmployee(int id, String name, String companyName, int basicSalary, int monthlyHours) {
        super(id, name, companyName, basicSalary);
        this.monthlyHours = monthlyHours;
    }

    public int getMonthlyHours() {
        return monthlyHours;
    }

    @Override
    public int getSalary() {
        return monthlyHours * basicSalary / 180;
    }
}
