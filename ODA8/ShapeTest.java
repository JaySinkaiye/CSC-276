package ODA8;

public class ShapeTest {

    public static void main(String[] args) {

        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(2);
        shapes[1] = new Square(9, 9);
        shapes[2] = new Triangle(8, 12);

        for (Shape shape : shapes) {
            shape.draw();
            shape.calcArea();
        }
        
    }

}
