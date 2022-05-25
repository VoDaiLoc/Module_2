public class Circle {
    private double radius = 1.0;
    private String color = "red";
    private final double PI = Math.PI;

    public Circle() {

    }

    public Circle(double r) {
        this.radius = r;
    }

    public double getRadius() {
        return this.radius;
    }

    public double getArea() {
        return PI * radius * radius;
    }
}
