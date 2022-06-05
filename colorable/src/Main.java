import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    final static int SQ=1;
    final static int CC=2;
    final static int TA=3;
    public static void main(String[] args) {
        Shape square = new Square(3,SQ);
        Shape circle = new Circle(3,CC);
        Shape triangle = new Triangle(3,4,5,TA);
        List<Shape> shapes = new ArrayList<>();
        shapes.add(square);
        shapes.add(circle);
        shapes.add(triangle);
        for (Shape x: shapes) {
            shape(x);
        }
    }
    public static void shape(Shape shape) {
        System.out.println(shape.getArea());
        if (Square.class.isInstance(shape)) {
            ((Square) shape).howToColor();
        }
    }
}