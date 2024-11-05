package ODA7;

public class WeeklyEmployee extends Employee {

    private double weeklySalary;

    WeeklyEmployee(String name, int id, double weeklySalary){
        super(name, id);
        this.weeklySalary = weeklySalary;
    }

    @Override
    public double calculatePay(){
        return weeklySalary;
    }
}
