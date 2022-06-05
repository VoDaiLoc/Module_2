public class Square extends Shape implements Colorable{
    private double a;



    public Square(double a, int type) {
        super(type);
        this.a = a;
    }

    @Override
    public void howToColor() {
        System.out.println(" Color all four sides");
    }

    @Override
    public double getArea() {
        return a*a;
    }
}
