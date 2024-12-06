package HW5;

public class FullTimeEmployee extends Employee {

    public double monthlySalary;

    FullTimeEmployee(String name, String SSN, double monthlySalary){
        super(name, SSN);
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double calculatePay() {
        return monthlySalary;
    }

    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Monthly Salary: $" + monthlySalary );
    }

}
