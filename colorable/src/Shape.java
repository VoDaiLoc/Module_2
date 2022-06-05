public abstract class Shape {
    private int type;

    public Shape(int type) {
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public abstract double getArea();
}
