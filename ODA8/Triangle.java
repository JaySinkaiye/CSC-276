package ODA8;

public class Triangle extends Shape {

    private double base;
    private double height;

    Triangle(double base, double height){
        this.base = base;
        this.height = height;
    }

    @Override
    public void draw(){
        System.out.println("Drawing a triangle");
    }
    
    @Override
    public void calcArea(){
        double area = (0.5 * base) * height;
        System.out.println("Area of Triangle: " + area + "\n");
    }

}
