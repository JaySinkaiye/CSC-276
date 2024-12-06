package HW5;

import java.util.ArrayList;

public class EmployeeMainTest {

    public static void main(String[] args) {

        ArrayList<Employee> employees = new ArrayList<>();

        employees.add(new FullTimeEmployee("jack", "1009890", 3000));
        employees.add(new PartTimeEmployee("Laney", "89086268", 40, 30));
        employees.add(new SeasonalEmployee("Kayla", "89372902", 32, 19, "Winter", 900));
        employees.add(new Contractor("Laide", "910987457", 800));

        for (Employee employee : employees) {
           employee.displayInfo();
           System.out.println("Pay: $" + employee.calculatePay()); 

           if (employee instanceof FullTimeEmployee){
            System.out.println("Type: Full Time Employee\n\n");
           } 
           else if (employee instanceof PartTimeEmployee){
            System.out.println("Type: Part Time Employee\n\n");
           } 
           else if (employee instanceof SeasonalEmployee){
            SeasonalEmployee seasonalEmployee = (SeasonalEmployee) employee;
            seasonalEmployee.displaySeason();
           }
           else {
            System.out.println("Type: Contractor\n\n");
           }
        }
    }
}
