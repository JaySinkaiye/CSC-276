package ODA7;

public class EmployeeTest {

    public static void main(String[] args) {
        WeeklyEmployee weeklyEmployee1 = new WeeklyEmployee("Katie", 1809, 1800);
        weeklyEmployee1.displayDetails();
        System.out.println("Weekly salary: " + weeklyEmployee1.calculatePay() +"\n");

        HourlyEmployee hourlyEmployee1 = new HourlyEmployee("Jake", 9089, 20, 8);
        hourlyEmployee1.displayDetails();
        System.out.println("Weekly Pay: " + hourlyEmployee1.calculatePay());
    }


}
