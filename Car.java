public class Car {

    String make;
    String model;
    int speed;

    public Car(String newMake, String newModel, int newSpeed){
        make = newMake;
        model = newModel;
        speed = newSpeed;
    }

    public void setMake(String newMake){
        make = newMake;
    }

    public String getMake(){
        return make;
    }

    public void setModel(String newModel){
        model = newModel;
    }

    public String getModel(){
        return model;
    }
    
    public void setSpeed(int newSpeed){
        speed = newSpeed;
    }

    public int getSpeed(){
        return speed;
    }

    public void displayInfo(){
        System.out.println("The make of the car is " + make);
        System.out.println("The model of the car is " + model);
        System.out.println("The speed of the car is " + speed + "\n");
    }

    public static double convertSpeedToMPH(int speedInKmh){
        double mile = speedInKmh * 0.621371;
        return mile;
    }
}
