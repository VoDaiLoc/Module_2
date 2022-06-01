public class Main {
    public static void main(String[] args) {
        Point point = new Point(20,30);
        System.out.println(point.toString());
        point.setXY(10,20);
        System.out.println(point.toString());
        point = new MovablePoint(point.getX(),
                point.getY(),
                10,
                20);
        System.out.println(point.toString());
        ((MovablePoint) point).move();
        System.out.println(point.toString());
        MovablePoint anotherPoint = new MovablePoint(20,20);
        System.out.println(anotherPoint.toString());
        anotherPoint.move();
        System.out.println(anotherPoint.toString());
    }
}