package ODA8;

public class Circle  extends Shape{

    private double radius;

    Circle(double radius){
        this.radius =  radius;
    }

    @Override
    public void draw(){
        System.out.println("Drawing a circle");
    }

    @Override
    public void calcArea(){
        double area = Math.PI * Math.pow(radius, 2);
        System.out.println("Area of Circle: " + area + "\n");
    }
}
