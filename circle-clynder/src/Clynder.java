public class Clynder extends Circle {
    private double height = 1.0;

    public Clynder() {

    }

    public Clynder(double height, double radius, String color) {
        super(radius,color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        return getArea() * height;
    }

    @Override
    public String toString() {
        return String.format("Clynder{ radius = %.2f, color = %s, volume = %.2f",getRadius(),getColor(),getVolume());
    }
}
