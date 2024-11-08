package ODA8;

public class Square extends Shape {

    private double length;
    private double width;

    Square(double length, double width){
        this.width = width;
        this.length = length;
    }

    @Override
    public void draw(){
        System.out.println("Drawing a square");
    }

    @Override
    public void calcArea(){
        double area = length * width;
        System.out.println("Area of Square: " + area + "\n");
    }
}
