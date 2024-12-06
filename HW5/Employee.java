package HW5;

public abstract class Employee {
    String name;
    String SSN;

    Employee(String name, String SSN){
        this.name = name;
        this.SSN = SSN;
    }

    public abstract double calculatePay();

    public void displayInfo(){
        System.out.println("Employee Name: " + name + "\nSSN: " + SSN);
    }

}
