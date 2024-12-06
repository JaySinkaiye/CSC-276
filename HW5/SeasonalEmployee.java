package HW5;

public class SeasonalEmployee extends PartTimeEmployee {

    public String season;
    public double seasonalBonus;

    SeasonalEmployee(String name, String ssn, double hoursworked, double hourlyRate, String season, double seasonalBonus){
        super(name, ssn, hoursworked, hourlyRate);
        this.season = season;
        this.seasonalBonus = seasonalBonus;
    }

    public void displaySeason(){
        System.out.println(season + "\n\n");
    }

    @Override
    public double calculatePay() {
        return super.calculatePay() + seasonalBonus;
    }

    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Seasonal Bonus: " + seasonalBonus);
    }
}
