package HW5;

public class PartTimeEmployee extends Employee {

    double hourlyRate;
    double hoursWorked;

    PartTimeEmployee(String name, String ssn, double hoursworked, double hourlyRate){
        super(name, ssn);
        this.hoursWorked = hoursworked;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculatePay() {
        return hourlyRate * hoursWorked;
    }

    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Hourly Rate: " + hourlyRate + "\nHours Worked: " + hoursWorked);
    }

}
