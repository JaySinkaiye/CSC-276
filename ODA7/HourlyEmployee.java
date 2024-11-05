package ODA7;

public class HourlyEmployee extends Employee {
    private double hourlyRate;
    private int hoursWorked;

    HourlyEmployee(String name, int id, double hourlyRate, int hoursWorked){
        super(name, id);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculatePay(){
        return hourlyRate * hoursWorked;
    }
}
