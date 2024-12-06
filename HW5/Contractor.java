package HW5;

public class Contractor extends  Employee{

    public double weeklyRate;

    Contractor(String name, String ssn, double weeklyRate){
        super(name, ssn);
        this.weeklyRate = weeklyRate;
    }

    @Override
    public double calculatePay() {
        return weeklyRate;
    }

    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Weekly Rate: $" + weeklyRate);
    }

}
