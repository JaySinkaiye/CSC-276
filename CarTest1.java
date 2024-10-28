public class CarTest1 {

    public static void main(String[] args) {
        Car car1 = new Car("Toyota", "Corolla", 180);
        Car car2 = new Car("Honda", "Civic", 200);

        car1.displayInfo();
        car2.displayInfo();

        System.out.println("The speed of car1 in MPH is " + Car.convertSpeedToMPH(car1.getSpeed()));
        System.out.println("The speed of car 2 in MPH is " + Car.convertSpeedToMPH(car2.getSpeed()));

    }
    
}
