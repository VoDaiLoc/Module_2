public class Circle extends Shape{
    private double radius;

    public Circle(double radius, int type) {
        super(type);
        this.radius = radius;
    }
    @Override
    public double getArea() {
        return Math.PI*radius*radius;
    }
}
