import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào chiều dài của hình chữ nhật: ");
        double height = scanner.nextDouble();
        System.out.println("Nhập vào chiều rộng của hình chữ nhật: ");
        double width = scanner.nextDouble();
        Rectangle rectangle = new Rectangle(width,height);
        double area = rectangle.getArea();
        double perimeter = rectangle.getPerimeter();
        System.out.println(rectangle.display());
        System.out.printf("Area: %.2f \n",area);
        System.out.printf("Perimeter: %.2f",perimeter);
    }
}