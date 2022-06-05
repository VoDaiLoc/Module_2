public class Triangle extends Shape {
    private double a, b, c;

    public Triangle(double a, double b, double c,int type) {
        super(type);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double getArea() {
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}
