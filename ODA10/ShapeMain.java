package ODA10;

public class ShapeMain {

    public static void main(String[] args) {
        
        Rectangle rectangle = new Rectangle(4, 5);
        rectangle.setColor("Green");

        System.out.println("Color: " + rectangle.getColor());
        System.out.println("Description: " + rectangle.getDescription());
        System.out.println("Area: " + rectangle.calculateArea() + "\n");

        Shape shapeReference = rectangle;
        Colorable colorableReference = rectangle;

       System.out.println("Shape Reference Area: " + shapeReference.calculateArea()); 
       System.out.println("Shape Reference Description: " + shapeReference.getDescription() + "\n");

       System.out.println("Colorable Reference color: " + colorableReference.getColor());

       printShapeDetails(rectangle);
    }

    public static void printShapeDetails(Shape shape) {

        System.out.println("Description: " + shape.getDescription());
        System.out.println("Area: " + shape.calculateArea());

        if (shape instanceof Colorable) {
            Colorable colorableShape = (Colorable) shape;
            System.out.println("Color: " + colorableShape.getColor());
        }
    }
}
