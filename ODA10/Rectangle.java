package ODA10;

public class Rectangle extends Shape implements Colorable {

    private double length;
    private double width;
    private String color;
    

    Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea(){
        return length * width;
    }

    @Override
    public void setColor(String color){
        this.color = color;
    }

    @Override 
    public String getColor(){
        return color;
    }

    @Override
    public String getDescription(){
        return "This is a rectangle";
    }
}
