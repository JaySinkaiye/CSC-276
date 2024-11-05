package ODA7;

public class Employee {

    protected String name;
    protected int id;

    Employee(){
        name = "Default";
        id = 9;
    }

    Employee(String name, int id){
        this.name = name;
        this.id = id;
    }

    public void displayDetails(){
        System.out.println("Name: " + name + "\nID: " + id);
    }

    public double calculatePay(){
        return 0.0;
    }
}
