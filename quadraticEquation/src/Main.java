import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a;
        do {
            System.out.println("Nhập vào a (khác 0): ");
            a = scanner.nextDouble();
        } while (a==0);
        System.out.println("Nhập vào b: ");
        double b = scanner.nextDouble();
        System.out.println("Nhập vào c: ");
        double c = scanner.nextDouble();
        QuadraticEquation quadraticEquation = new QuadraticEquation(a,b,c);
        double delta = quadraticEquation.getDiscriminant();
        if (delta>0) {
            double x1 = (-quadraticEquation.getB() - Math.pow(delta,0.5))/(2* quadraticEquation.getA());
            double x2 = (-quadraticEquation.getB() + Math.pow(delta,0.5))/(2* quadraticEquation.getA());
            System.out.printf("Phương trình có 2 nghiệm phân biệt:");
            System.out.printf("x1 = %.2f; x2 = %.2f", x1, x2);
        }
        else if(delta==0) {
            double x = (-quadraticEquation.getB())/(2* quadraticEquation.getA());
            System.out.printf("Phương trình có nghiệm kép x1 = x2 = %.2f",x);
        }
        else
            System.out.println("Phương trình vô nghiệm!");
    }
}