public class Fan {
    final int SLOW = 1;
    final int MEDIUM = 2;
    final int FAST = 3;
    private int speed = SLOW;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";

    public Fan() {
    }

    public Fan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    public int getSpeed() {
        return this.speed;
    }

    public void setSpeed() {
        this.speed = speed;
    }

    public boolean getOn() {
        return on;
    }

    public void setOn() {
        this.on = on;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor() {
        this.color = color;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius() {
        this.radius = radius;
    }

    public String toString() {
        if (on)
            return "fan is on: speed = " + getSpeed() + ", color = " + getColor() + ", radius = " + getRadius();
        else
            return "fan is off: " + " color = " + getColor() + ", radius = " + getRadius();

    }
}
